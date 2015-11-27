# Scala.js Cross Project working with IntelliJ

## IntelliJ Scala Plugin v1.3.3 or higher

Importing a project works well when using the IntelliJ scala plugin v1.3.3 or higher.

In IntelliJ, open Project wizard, select `Import Project`, choose the root folder and click `OK`.
Select `Import project from external model` option, choose `SBT project` and click `Next`. Select additional import options and click `Finish`.

## IntelliJ Scala Plugin prior to v1.3.3

There are known issues with the Scala plugin prior to v1.3.3.

A workaround is to use the `sbt-idea` plugin (included in `project/plugins.sbt` of this sample):

1. `$ sbt gen-idea`
2. Inside IntelliJ, `File/Open...`, choose the root folder to import all the projects (do *not* use `Import Project...` or `Import Module...`)

#### IntelliJ 14

You will be prompted to convert the old format to a new format. Just click `Convert`.

#### Changes in build.sbt

Here's the annoying part. Every time you do some changes in build.sbt, import a fresh new IDEA project:
```
Inside IntelliJ, delete scalajs-cross-project-intellij, then
$ cd scalajs-cross-project-intellij
$ rm -r .idea/ .idea_modules/
$ sbt gen-idea
Inside IntelliJ, File/Open..., choose scalajs-cross-project-intellij to import all the projects
```

## Run the application

Run the jvm project from sbt:
```
$ sbt
> exampleJVM/run
```
Run the js project from sbt:
```
$ sbt
> exampleJS/run
```
Run the javascript output file in a web browser:
```
$ sbt
> exampleJS/fastOptJS
$ open index-fastopt.html
```
