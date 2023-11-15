import sbt._

object Dependencies {
  object Versions {
    val cucumberJUnit = "7.14.0"
    val cucumberScala = "8.14.1"
  }
  val munit = Seq("org.scalameta" %% "munit" % "0.7.29" % Test)
  val cucumber = Seq(
    "io.cucumber" %% "cucumber-scala" % Versions.cucumberScala % Test,
    "io.cucumber" % "cucumber-junit" % Versions.cucumberJUnit % Test
  )
}
