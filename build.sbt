enablePlugins(SerenitySbtPlugin)

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.assertj" % "assertj-core" % "3.24.2",
  "net.serenity-bdd" % "serenity-core" % "3.6.23",
  "net.serenity-bdd" % "serenity-junit5" % "3.6.23",
  "net.serenity-bdd" % "serenity-cucumber" % "3.6.23",
  "org.junit.jupiter" % "junit-jupiter-api" % "5.9.2" % "test"
) ++ Dependencies.munit ++ Dependencies.cucumber

Test / testOptions := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))
