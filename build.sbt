enablePlugins(SerenitySbtPlugin)

val serenityVersion = "4.1.9"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.assertj" % "assertj-core" % "3.25.3",
  "net.serenity-bdd" % "serenity-core" % serenityVersion,
  "net.serenity-bdd" % "serenity-junit5" % serenityVersion,
  "net.serenity-bdd" % "serenity-cucumber" % serenityVersion,
  "org.junit.jupiter" % "junit-jupiter-api" % "5.10.2" % "test"
) ++ Dependencies.munit ++ Dependencies.cucumber

Test / testOptions := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))
