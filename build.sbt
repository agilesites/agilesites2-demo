val v = "2.0-M1-SNAPSHOT"

val ver = "11.1.1.8.0"

val demo  = project.in(file(".")).enablePlugins(agilesites.build.AgileSitesPlugin)

name := "agilesites2-demo"

organization := "com.sciabarra"

version := ver + "_" + v

resolvers += "sciabarra" at "http://dl.bintray.com/content/sciabarra/maven"

libraryDependencies ++= Seq(
  "com.sciabarra" % "agilesites2-core" % version.value,
  "com.sciabarra" % "agilesites2-api" % version.value)

scalaVersion := "2.11.5"

crossPaths := false

javacOptions ++= Seq("-g", "-Xlint:unchecked")

//includeFilter in (Assets, LessKeys.less) := "main.less"

//asUploadTarget := None //Some(uploadTarget)

//asWebFolder := WebKeys.assets.value

//asWebExcludeFilter := "*.less" | "*.map"

//resourceGenerators in Compile += asWebPackage.taskValue

// sitesUrl := "http://localhost:8181/cs"

// sitesUser := "fwadmin"

// sitesPassword := "xceladmin"
