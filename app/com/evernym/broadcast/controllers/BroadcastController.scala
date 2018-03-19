package com.evernym.broadcast.controllers

import com.google.inject.{Inject, Singleton}
import play.api.Logger
import play.api.mvc.{Action, Controller}
import com.evernym.broadcast.services.BroadcastService

@Singleton
class BroadcastController @Inject() (broadcastService: BroadcastService) extends Controller {

  private val logger = Logger(getClass)

  def subscribe = Action {
        logger.info(s"User subscribe")
     // broadcastService.subscribe()
        Ok(com.evernym.broadcast.views.html.index(s"you are subscribe to channel"))
  }

  def unsubscribe = Action {
    logger.info(s"User unsubscribe")
    Ok(com.evernym.broadcast.views.html.index(s"you are unsubscribe from channel"))
  }
}