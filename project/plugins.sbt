resolvers += Resolver.typesafeRepo("releases")

resolvers += Resolver.url("sbt plugin",
    url("http://dl.bintray.com/content/sciabarra/sbt-plugins"))(
        Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0")

addSbtPlugin("com.sciabarra" % "agilesites2-build" % "2.0-M1-SNAPSHOT")

val pluginDir = file("..") / "agilesites2-build"

//val demo = if(pluginDir.exists) project.in(file(".")).dependsOn(pluginDir.toURI) else project.in(file("."))
