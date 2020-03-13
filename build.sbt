name := "akka-http-example"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= {
  val akkaVersion = "2.6.3"
  val akkaHttpVersion = "10.1.11"
  Seq(
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  )
}
