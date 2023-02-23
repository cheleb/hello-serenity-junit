//enablePlugins(SerenitySbtPlugin)

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.assertj" % "assertj-core" % "3.8.0",
  "net.serenity-bdd" % "serenity-core" % "3.4.2",
  "net.serenity-bdd" % "serenity-junit5" % "3.4.2",
  "net.serenity-bdd" % "serenity-cucumber" % "3.6.12",
  "org.junit.jupiter" % "junit-jupiter-api" % "5.8.2" % "test"
) ++ Dependencies.munit ++ Dependencies.cucumber

Test / testOptions := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))
