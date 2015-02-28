val demo = project.in(file(".")).enablePlugins(AgileSitesPlugin)

name := "agilesites2-demo"

organization := "com.sciabarra"

version := "0.1-SNAPSHOT"

val v = "2.0-M1"

val s = "11.1.1.8.0"

// resolvers += "sciabarra" at "http://dl.bintray.com/content/sciabarra/maven"

ivyConfigurations += config("tomcat")

libraryDependencies ++= Seq(
  "com.sciabarra" % "agilesites2-core" % s"${s}_${v}",
  "com.sciabarra" % "agilesites2-api" % s"${s}_${v}",
  "com.sciabarra" %  "agilesites2-setup" % v % "tomcat")

offline := true

crossPaths := false

javacOptions ++= Seq("-g", "-Xlint:unchecked")

crossPaths := false

javacOptions ++= Seq("-g", "-Xlint:unchecked")
