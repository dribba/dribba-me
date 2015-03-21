name := """dribba-me"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

resolvers += "ERQX Releases" at "https://jroper.github.io/releases"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "au.id.jazzy.erqx" %% "erqx-engine" % Versions.erqx
)
