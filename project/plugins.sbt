resolvers += Resolver.url("sbt plugin", url("http://dl.bintray.com/content/sciabarra/sbt-plugins"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.sciabarra" % "agilesites2-build" % "2.0-M1-SNAPSHOT")

resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

