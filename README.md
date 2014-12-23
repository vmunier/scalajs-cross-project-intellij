# Scala.js Cross Project working with IntelliJ

## Try it Yourself

1. `$ sbt gen-idea`
2. Inside IntelliJ, `File/Open...`, choose the root folder to import all the projects (do *not* use `Import Project...` or `Import Module...`)

## IntelliJ 14

You will be prompted to convert the format `The project 'scalajs-cross-project-intellij' has an older format and will be converted.`
Just click `Convert`.

## Notes

The only important part in this repo to make IntelliJ happy, is to declare the shared project with its libraryDependencies in your [sbt build file](https://github.com/vmunier/scalajs-cross-project-intellij/blob/8c004a5e487d30eecb4c1276fd04ae3c7167ae9e/build.sbt#L13-L15). You don't need to use symbolic links.
