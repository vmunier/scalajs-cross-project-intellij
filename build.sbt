import org.scalajs.sbtplugin.cross.CrossProject

lazy val crossProject = CrossProject("example", file("."), CrossType.Full).
  settings(
    persistLauncher := true,
    persistLauncher in Test := false,
    libraryDependencies ++= sharedLibs.value
  )

lazy val jvm = crossProject.jvm
lazy val js = crossProject.js

// declare the shared project with its libraryDependencies to make IntelliJ happy without using symlinks
lazy val shared = Project("exampleShared", file("shared")).
  settings(libraryDependencies ++= sharedLibs.value)

lazy val sharedLibs = Def.setting(Seq(
  "com.scalatags" %%% "scalatags" % "0.4.3-M3"
))
