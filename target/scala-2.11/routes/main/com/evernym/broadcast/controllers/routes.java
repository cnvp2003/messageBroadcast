
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/pati80/Chandrashekhar/practice/messageBroadcast/messageBroadcast/conf/routes
// @DATE:Mon Mar 19 21:05:42 IST 2018

package com.evernym.broadcast.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final com.evernym.broadcast.controllers.ReverseBroadcastController BroadcastController = new com.evernym.broadcast.controllers.ReverseBroadcastController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final com.evernym.broadcast.controllers.javascript.ReverseBroadcastController BroadcastController = new com.evernym.broadcast.controllers.javascript.ReverseBroadcastController(RoutesPrefix.byNamePrefix());
  }

}
