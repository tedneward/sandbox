name := "hello"

version := "1.0"

scalaVersion := "2.11.1"


lazy val runTestScriptTask = taskKey[Unit]("Run testScript")

runTestScriptTask := {
  val ec = (baseDirectory.value / "testScript.sh").getAbsolutePath !
  val log = streams.value.log
  log.debug(s"Exit code: $ec")
}

runTestScriptTask <<= runTestScriptTask triggeredBy (doc in Compile)
