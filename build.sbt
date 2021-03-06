name := """play-compose-seed"""

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
	jdbc,
	cache,
	ws,
	filters,
	"com.typesafe.slick" % "slick_2.10" % "2.1.0",
	"org.slf4j" % "slf4j-nop" % "1.6.4",
	"mysql" % "mysql-connector-java" % "5.1.27",
	"com.typesafe.akka" % "akka-actor_2.10" % "2.3.5"
)

scalacOptions += "-feature"