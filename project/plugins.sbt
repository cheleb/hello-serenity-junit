val serenityVersion = "4.1.12"
addSbtPlugin(
  "dev.cheleb" % "sbt-serenity" % "local"
)
libraryDependencies ++= Seq(
  "net.serenity-bdd" % "serenity-single-page-report" % serenityVersion,
  "net.serenity-bdd" % "serenity-navigator-report" % serenityVersion
)
// logLevel := Level.Debug
