enablePlugins(SerenitySbtPlugin)

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.assertj" % "assertj-core" % "3.25.3",
  "net.serenity-bdd" % "serenity-core" % "4.1.6",
  "net.serenity-bdd" % "serenity-junit5" % "4.1.6",
  "net.serenity-bdd" % "serenity-cucumber" % "4.1.6",
  "org.junit.jupiter" % "junit-jupiter-api" % "5.10.2" % "test"
) ++ Dependencies.munit ++ Dependencies.cucumber

Test / testOptions := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))
