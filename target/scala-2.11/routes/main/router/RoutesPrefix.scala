
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/pati80/Chandrashekhar/practice/messageBroadcast/messageBroadcast/conf/routes
// @DATE:Mon Mar 19 21:05:42 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
