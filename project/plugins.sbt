val serenityVersion = "4.1.10"
addSbtPlugin(
libraryDependencies ++= Seq(
  "net.serenity-bdd" % "serenity-single-page-report" % serenityVersion,
  "net.serenity-bdd" % "serenity-navigator-report" % serenityVersion
)
// logLevel := Level.Debug
