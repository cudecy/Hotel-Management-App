
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bootstrap3Input_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class bootstrap3Input extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/if(!elements.args.contains('hideIt))/*2.38*/ {_display_(Seq[Any](format.raw/*2.40*/("""
    """),format.raw/*3.5*/("""<h5 for=""""),_display_(/*3.15*/elements/*3.23*/.id),format.raw/*3.26*/("""">"""),_display_(/*3.29*/elements/*3.37*/.label),format.raw/*3.43*/("""</h5>
""")))}),format.raw/*4.2*/("""
"""),_display_(/*5.2*/elements/*5.10*/.input),format.raw/*5.16*/("""
"""),format.raw/*6.62*/("""
"""),format.raw/*7.1*/("""<span class="errors_boot">"""),_display_(/*7.28*/elements/*7.36*/.errors.mkString(", ")),format.raw/*7.58*/("""</span>"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object bootstrap3Input extends bootstrap3Input_Scope0.bootstrap3Input
              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 11:41:19 PDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/bootstrap3Input.scala.html
                  HASH: 04a28327d187a5921b8ceccd7bb9988a95d867f6
                  MATRIX: 779->1|906->33|934->36|978->72|1017->74|1049->80|1085->90|1101->98|1124->101|1153->104|1169->112|1195->118|1232->126|1260->129|1276->137|1302->143|1331->206|1359->208|1412->235|1428->243|1470->265
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|38->7
                  -- GENERATED --
              */
          