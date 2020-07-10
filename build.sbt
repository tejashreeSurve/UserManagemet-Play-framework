name := """play-sample-project"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += javaJdbc

libraryDependencies += jdbc
libraryDependencies ++= Seq(
  javaJpa,
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4"
)  


EclipseKeys.withSource := true
EclipseKeys.withJavadoc := true

libraryDependencies += javaJpa

PlayKeys.externalizeResourcesExcludes += baseDirectory.value / "conf" / "META-INF" / "persistence.xml"