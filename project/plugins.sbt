val serenityVersion = "4.1.10"
addSbtPlugin(
  "dev.cheleb" % "sbt-serenity" % "0.0.3"
)
libraryDependencies ++= Seq(
  "net.serenity-bdd" % "serenity-single-page-report" % serenityVersion,
  "net.serenity-bdd" % "serenity-navigator-report" % serenityVersion
)
// logLevel := Level.Debug
