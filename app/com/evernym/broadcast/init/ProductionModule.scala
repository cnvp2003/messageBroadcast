package com.evernym.broadcast.init

import com.google.inject.{Binder, Module}
import com.evernym.broadcast.services.{BroadcastService, BroadcastServiceImpl}

/**
 * The Guice-Module used in Production
 */
class ProductionModule extends Module {
  def configure(binder: Binder): Unit = {
      binder.bind(classOf[BroadcastService]).to(classOf[BroadcastServiceImpl])
  }
}
