val demo  = project.in(file(".")).enablePlugins(SbtWeb)

val ver = "11.1.1.8.0"

name := "demo"

organization := "com.sciabarra"

version := "0.1-SNAPSHOT"

crossPaths := false

resolvers += "sciabarra" at "http://dl.bintray.com/content/sciabarra/maven"

javacOptions ++= Seq("-g", "-Xlint:unchecked")

libraryDependencies ++= Seq(
      "com.sciabarra" % "agilesites2-core" % (ver + "_1.9-M3" ),
      "com.sciabarra" % "agilesites2-api" % (ver + "_1.9-M3" ),
      //"com.oracle.sites" % "cs-core" % ver ,
      //"com.oracle.sites" % "cs" % ver,
      //"com.oracle.sites" % "xcelerate" % ver,
      //"com.oracle.sites" % "assetapi" % ver,
      //"com.oracle.sites" % "assetapi-impl" % ver,
      //"com.oracle.sites" % "jsoup" % ver,
      //"com.oracle.sites" % "xstream" % ver,
      "org.webjars" % "bootstrap" % "3.2.0",
      "org.webjars" % "bootstrapvalidator" % "0.5.2",
      "org.webjars" % "jquery" % "1.11.1",
      "org.webjars" % "jquery-ui" % "1.11.1",
      "org.webjars" % "jquery-throttle-debounce-plugin" % "1.1",
      "org.webjars" % "picturefill" % "2.1.0",
      "org.webjars" % "holderjs" % "2.4.0",
      "com.novocode" % "junit-interface" % "0.9" % "test")

includeFilter in (Assets, LessKeys.less) := "main.less"

asUploadTarget := None //Some(uploadTarget)

asWebFolder := WebKeys.assets.value

asWebExcludeFilter := "*.less" | "*.map"

resourceGenerators in Compile += asWebPackage.taskValue

