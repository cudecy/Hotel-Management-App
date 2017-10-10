import sbt.Keys._

name := "HTMGMTSYS"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)


scalaVersion := "2.11.6"
libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.mindrot" % "jbcrypt" % "0.3m",
  "mysql" % "mysql-connector-java" % "5.1.36",
  "org.apache.commons" % "commons-lang3" % "3.4",
  "org.jasypt" % "jasypt" % "1.9.2",
  "org.jpos" % "jpos" % "2.0.0",
  "com.typesafe.play" %% "play-mailer" % "3.0.1",
  "com.google.inject.extensions" % "guice-assistedinject" % "4.0",
  "it.innove" % "play2-pdf" % "1.3.0",
  "com.adrianhurt" %% "play-bootstrap" % "1.1-P24-B3",
  "org.apache.httpcomponents" % "httpclient" % "4.5.2"
)


resolvers ++= Seq(
  "Local Maven Repository" at "file:///C:Users/ccndu/.m2/repository",
  "Apache" at "https://repo1.maven.org/maven2/",
  "Mvn Cent" at "http://central.maven.org/maven2",
  "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
  "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)


resolvers += Resolver.sonatypeRepo("snapshots")


//Use play offline mode. Set up application to stop resolving dependencies
cleanKeepFiles ++= Seq("resolution-cache", "streams").map(target.value / _)

clean := Defaults.doClean(cleanFiles.value, cleanKeepFiles.value ++
  (ivyConfiguration.value match {
    case i: InlineIvyConfiguration => i.resolutionCacheDir
    case _ => None
  }).toList)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

doc in Compile <<= target.map(_ / "none")

offline:=true