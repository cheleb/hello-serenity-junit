enablePlugins(SerenitySbtPlugin)

scalaVersion := "3.4.2"

val serenityVersion = "4.1.12"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.22",
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.scalameta" %% "munit" % "0.7.29" % Test,
  "org.assertj" % "assertj-core" % "3.25.3" % Test,
  "net.serenity-bdd" % "serenity-core" % serenityVersion % Test,
  "net.serenity-bdd" % "serenity-junit5" % serenityVersion % Test,
  "net.serenity-bdd" % "serenity-cucumber" % serenityVersion % Test,
  "org.junit.jupiter" % "junit-jupiter-api" % "5.10.2" % Test
) ++ Dependencies.munit ++ Dependencies.cucumber

Test / testOptions := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))

//logLevel := Level.Debug
