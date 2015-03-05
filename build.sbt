val v = scala.io.Source.fromFile(file("version.txt")).getLines.next.trim

val s = "11.1.1.8.0"

val demo = project.in(file(".")).enablePlugins(AgileSitesPlugin)

name := "agilesites2-demo"

organization := "com.sciabarra"

version := "0.1-SNAPSHOT"

resolvers += "sciabarra" at "http://dl.bintray.com/content/sciabarra/maven"

ivyConfigurations += config("tomcat")

libraryDependencies ++= Seq(
  "com.sciabarra" % "agilesites2-core" % s"${s}_${v}",
  "com.sciabarra" % "agilesites2-api" % s"${s}_${v}",
  "com.sciabarra" % "agilesites2-setup" % v % "tomcat")

offline := true

crossPaths := false

javacOptions ++= Seq("-g", "-Xlint:unchecked")

unmanagedBase := file(sitesWebapp.value) / "WEB-INF" / "lib"
