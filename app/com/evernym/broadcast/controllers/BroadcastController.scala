package com.evernym.broadcast.controllers

import java.util.UUID

import com.google.inject.{Inject, Singleton}
import play.api.Logger
import play.api.mvc.{Action, AnyContent, Controller}
import com.evernym.broadcast.services.SubscribeService

import scala.concurrent.Future

@Singleton
class BroadcastController @Inject() (subscribeService: SubscribeService) extends Controller {

  private val logger = Logger(getClass)

  def subscribe(userId: java.util.UUID, channelId: java.util.UUID): Action[AnyContent] = Action.async { implicit request =>
      logger.info(s"User subscribe")
      // get channel by id and check it's type then apply logic or algo to check phonenumber for one user with channel
      subscribeService.subscribe(userId, channelId)
      Future.successful(Ok(com.evernym.broadcast.views.html.index(s"you are subscribe to channel")))
  }

  def unsubscribe = Action {
    logger.info(s"User unsubscribe")
    Ok(com.evernym.broadcast.views.html.index(s"you are unsubscribe from channel"))
  }
}