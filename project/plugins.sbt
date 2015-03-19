val v = scala.io.Source.fromFile(file("version.txt")).getLines.next.trim

resolvers += Resolver.url("sbt plugin", url("http://dl.bintray.com/content/sciabarra/sbt-plugins"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.sciabarra" % "agilesites2-build" % v)

resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

