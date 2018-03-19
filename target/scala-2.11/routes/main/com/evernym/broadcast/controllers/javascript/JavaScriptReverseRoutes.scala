
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/pati80/Chandrashekhar/practice/messageBroadcast/messageBroadcast/conf/routes
// @DATE:Mon Mar 19 21:05:42 IST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package com.evernym.broadcast.controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseBroadcastController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def unsubscribe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.evernym.broadcast.controllers.BroadcastController.unsubscribe",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unsubscribe"})
        }
      """
    )
  
    // @LINE:7
    def subscribe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.evernym.broadcast.controllers.BroadcastController.subscribe",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscribe"})
        }
      """
    )
  
  }


}