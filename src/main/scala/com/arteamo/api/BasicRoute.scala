package com.arteamo.api
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

trait BasicRoute {
  val route: Route = {
    (pathPrefix("ping") & get) {
      complete("OK")
    }
  }
}
