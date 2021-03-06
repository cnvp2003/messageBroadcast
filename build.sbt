import play.sbt.PlayImport._

name := """Message-Broadcast"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
