echo On master
echo ... stash working changes
git stash

git checkout gh-pages
echo On gh-pages
echo ... cleaning out old docs folder
rm -r docs/api/*
echo ... copying target/scala-2.11/api/* over to docs/api
cp -r target/scala-2.11/api/* docs/api
git add docs/api
git commit -m "Documentation commit"

git checkout master
git stash pop
