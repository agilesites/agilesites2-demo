resolvers += Resolver.url("sbt plugin", url("http://dl.bintray.com/content/sciabarra/sbt-plugins"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("sciabarra", url("http://dl.bintray.com/content/sciabarra/maven"))(Resolver.mavenStylePatterns)

addSbtPlugin("com.sciabarra" % "agilesites2-build" % "2.0.1")

resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

