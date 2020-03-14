package com.arteamo

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import com.arteamo.api.BasicRoute
import com.arteamo.logging.Logging
import com.typesafe.config.ConfigFactory

import scala.concurrent.ExecutionContextExecutor

object Main extends App with BasicRoute with Logging {
  implicit val system: ActorSystem = ActorSystem()
  implicit val executionContext: ExecutionContextExecutor = system.dispatcher

  val config = ConfigFactory.load()
  val host = config.getString("http.host")
  val port = config.getInt("http.port")

  Http().bindAndHandle(route, host, port)
  log.info(s"Application started on http://$host:$port")
}
