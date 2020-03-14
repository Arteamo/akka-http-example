name := "akka-http-example"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= {
  val akkaVersion = "2.6.3"
  val akkaHttpVersion = "10.1.11"
  val logbackVersion = "1.2.3"
  val akkaHttpPlayJsonVersion = "1.31.0"
  val playWsStandaloneJson = "2.1.2"
  val slickVersion = "3.3.2"
  Seq(
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.slick" %% "slick" % slickVersion,
    "de.heikoseeberger" %% "akka-http-play-json" % akkaHttpPlayJsonVersion,
    "com.typesafe.play" %% "play-ws-standalone-json" % playWsStandaloneJson,
    "ch.qos.logback" % "logback-classic" % logbackVersion
  )
}
