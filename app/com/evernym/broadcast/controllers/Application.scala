package com.evernym.broadcast.controllers

import play.api.mvc._

object Application extends Controller{

  def index = Action {
    Ok(com.evernym.broadcast.views.html.index("Your new application is ready."))
  }

}