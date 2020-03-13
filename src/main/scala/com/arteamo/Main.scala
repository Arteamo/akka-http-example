package com.arteamo

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import com.arteamo.api.BasicRoute
import com.typesafe.config.ConfigFactory

import scala.concurrent.ExecutionContextExecutor

object Main extends BasicRoute {
  def main(args: Array[String]): Unit = {

    val config = ConfigFactory.load()
    val host = config.getString("http.host")
    val port = config.getInt("http.port")

    implicit val system: ActorSystem = ActorSystem()
    implicit val executionContext: ExecutionContextExecutor = system.dispatcher

    Http().bindAndHandle(route, host, port)
  }
}
