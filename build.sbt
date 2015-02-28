import sbt._

val app = project.in(file(".")).enablePlugins(AgileSitesPlugin)

name := "agilesites2-app"

organization := "com.sciabarra"

version := "0.1-SNAPSHOT"

val v = "2.0-M1"

val s = "11.1.1.8.0"

libraryDependencies ++= Seq(
  "com.sciabarra" % "agilesites2-core" % s"${s}_${v}",
  "com.sciabarra" % "agilesites2-api" % s"${s}_${v}",
  "com.sciabarra" %  "agilesites2-setup" % v)

offline := true

crossPaths := false

javacOptions ++= Seq("-g", "-Xlint:unchecked")

net.virtualvoid.sbt.graph.Plugin.graphSettings
