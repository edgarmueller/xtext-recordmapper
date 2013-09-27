import AssemblyKeys._ // put this at the top of the file

name := "modelgen"

version := "0.0.1"

scalaVersion := "2.10.0"

libraryDependencies += "org.specs2" %% "specs2" % "2.1.1" % "test"

assemblySettings

resolvers += "Scala Tools" at "http://scala-tools.org/repo-releases/"

//resolvers += "Nexus Release Repository" at "https://oss.sonatype.org/service/local/staging/deploy/maven2/"

//resolvers += "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"