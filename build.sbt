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
   "org.hibernate" % "hibernate-entitymanager" % "4.3.5.Final",
   "org.hibernate" % "hibernate-core" % "5.4.9.Final",
   "org.postgresql" % "postgresql" % "42.2.12"
 
)  


EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
EclipseKeys.withSource := true
EclipseKeys.withJavadoc := true


PlayKeys.externalizeResourcesExcludes += baseDirectory.value / "conf" / "META-INF" / "persistence.xml"