
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/pati80/Chandrashekhar/practice/messageBroadcast/messageBroadcast/conf/routes
// @DATE:Mon Mar 19 21:05:42 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subscribe""", """@com.evernym.broadcast.controllers.BroadcastController@.subscribe"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unsubscribe""", """@com.evernym.broadcast.controllers.BroadcastController@.unsubscribe"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val com_evernym_broadcast_controllers_BroadcastController_subscribe0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscribe")))
  )
  private[this] lazy val com_evernym_broadcast_controllers_BroadcastController_subscribe0_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[com.evernym.broadcast.controllers.BroadcastController]).subscribe,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.evernym.broadcast.controllers.BroadcastController",
      "subscribe",
      Nil,
      "GET",
      """""",
      this.prefix + """subscribe"""
    )
  )

  // @LINE:8
  private[this] lazy val com_evernym_broadcast_controllers_BroadcastController_unsubscribe1_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unsubscribe")))
  )
  private[this] lazy val com_evernym_broadcast_controllers_BroadcastController_unsubscribe1_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[com.evernym.broadcast.controllers.BroadcastController]).unsubscribe,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.evernym.broadcast.controllers.BroadcastController",
      "unsubscribe",
      Nil,
      "POST",
      """""",
      this.prefix + """unsubscribe"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_at2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case com_evernym_broadcast_controllers_BroadcastController_subscribe0_route(params) =>
      call { 
        com_evernym_broadcast_controllers_BroadcastController_subscribe0_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[com.evernym.broadcast.controllers.BroadcastController]).subscribe)
      }
  
    // @LINE:8
    case com_evernym_broadcast_controllers_BroadcastController_unsubscribe1_route(params) =>
      call { 
        com_evernym_broadcast_controllers_BroadcastController_unsubscribe1_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[com.evernym.broadcast.controllers.BroadcastController]).unsubscribe)
      }
  
    // @LINE:11
    case controllers_Assets_at2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
      }
  }
}