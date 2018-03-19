
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/pati80/Chandrashekhar/practice/messageBroadcast/messageBroadcast/conf/routes
// @DATE:Mon Mar 19 21:05:42 IST 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package com.evernym.broadcast.controllers {

  // @LINE:7
  class ReverseBroadcastController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def unsubscribe(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "unsubscribe")
    }
  
    // @LINE:7
    def subscribe(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subscribe")
    }
  
  }


}