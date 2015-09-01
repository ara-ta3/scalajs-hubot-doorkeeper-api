enablePlugins(ScalaJSPlugin)

name := "Doorkeeper API with scalajs"

scalaVersion := "2.11.7"
libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"

scalaJSStage in Global := FastOptStage
