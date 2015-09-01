enablePlugins(ScalaJSPlugin)

name := "Doorkeeper API with scalajs"

scalaVersion := "2.11.7"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"
postLinkJSEnv := PhantomJSEnv().value
