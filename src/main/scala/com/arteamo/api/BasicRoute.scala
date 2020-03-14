package com.arteamo.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._
import play.api.libs.json.Json

trait BasicRoute {

  val route: Route = {
    (pathPrefix("ping") & get) {
      complete(Json.obj("STATUS" -> "OK"))
    }
  }

}
