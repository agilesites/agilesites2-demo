resolvers += Resolver.url("sbt plugin", url("http://dl.bintray.com/content/sciabarra/sbt-plugins"))(Resolver.ivyStylePatterns) 

addSbtPlugin("com.sciabarra" % "agilesites2-build" % "1.9-M11")

//val plugin = project.in(file(".")).dependsOn(file("plugin").toURI)

resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0")

