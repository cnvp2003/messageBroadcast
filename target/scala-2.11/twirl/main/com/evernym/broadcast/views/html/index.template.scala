
package com.evernym.broadcast.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Message Broadcast")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

    """),_display_(/*5.6*/message),format.raw/*5.13*/("""
    
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Mar 19 17:14:43 IST 2018
                  SOURCE: /Users/pati80/Chandrashekhar/practice/messageBroadcast/messageBroadcast/app/com/evernym/broadcast/views/index.scala.html
                  HASH: 582d4828e511e153bdaaa74bb01e9e4b59892784
                  MATRIX: 549->1|661->18|689->21|722->46|761->48|793->55|820->62|856->69
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5|31->7
                  -- GENERATED --
              */
          