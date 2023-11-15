enablePlugins(SerenitySbtPlugin)

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.assertj" % "assertj-core" % "3.24.2",
  "net.serenity-bdd" % "serenity-core" % "4.0.21",
  "net.serenity-bdd" % "serenity-junit5" % "4.0.21",
  "net.serenity-bdd" % "serenity-cucumber" % "4.0.21",
  "org.junit.jupiter" % "junit-jupiter-api" % "5.10.1" % "test"
) ++ Dependencies.munit ++ Dependencies.cucumber

Test / testOptions := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))
