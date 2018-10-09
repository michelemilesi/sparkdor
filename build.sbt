lazy val commonSettings = Seq(
  organization := "it.michelemilesi.sparkdor",
  name := "SparkDOR",
  version := "0.1",
  scalaVersion := "2.11.12",
  libraryDependencies ++= dependecies
)

lazy val spark_dor = (project in file(".")).
  settings(commonSettings: _*)

resolvers in Global += Resolver.mavenLocal

lazy val dependecies = Seq(
  "org.apache.spark" %% "spark-core" % "2.3.0" % Provided,
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)