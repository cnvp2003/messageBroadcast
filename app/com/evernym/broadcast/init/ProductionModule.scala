package com.evernym.broadcast.init

import com.google.inject.{Binder, Module}
import com.evernym.broadcast.services.{SubscribeService, SubscribeServiceImpl}

/**
 * The Guice-Module used in Production
 */
class ProductionModule extends Module {
  def configure(binder: Binder): Unit = {
      binder.bind(classOf[SubscribeService]).to(classOf[SubscribeServiceImpl])
  }
}
