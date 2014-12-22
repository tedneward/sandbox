name := "hello"

version := "1.0"

scalaVersion := "2.11.1"

doc in Compile := {
  val f = (doc in Compile).value

  // execute a shell script if you want with sbt's Process API
  // http://www.scala-sbt.org/0.13/docs/Process.html
  val ec = (baseDirectory.value / "testScript.sh").getAbsolutePath !
  val log = streams.value.log
  log.debug(s"Exit code: $ec")
  f
}
