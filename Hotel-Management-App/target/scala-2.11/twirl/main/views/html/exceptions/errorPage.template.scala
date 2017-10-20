
package views.html.exceptions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object errorPage_Scope0 {
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

class errorPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Throwable,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ex:Throwable):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""


"""),_display_(/*4.2*/main("Oops !")/*4.16*/ {_display_(Seq[Any](format.raw/*4.18*/("""

    """),_display_(/*6.6*/if(play.api.Play.isDev(play.api.Play.current))/*6.52*/ {_display_(Seq[Any](format.raw/*6.54*/("""
        """),format.raw/*7.9*/("""<p class="lead">
            <code>
            """),_display_(/*9.14*/(ex.getMessage)),format.raw/*9.29*/("""
            """),format.raw/*10.13*/("""</code>
        </p>
        <div class="page-header">
            <h4>Stacktrace</h4>
        </div>
        <div class="">
            <pre>
                <code>"""),_display_(/*17.24*/({
                    val u = new java.io.StringWriter; ex.printStackTrace(new java.io.PrintWriter(u)); u.toString
                })),format.raw/*19.19*/("""</code></pre>
        </div>
    """)))}/*21.6*/else/*21.10*/{_display_(Seq[Any](format.raw/*21.11*/("""
        """),format.raw/*22.9*/("""<div style="text-align: center">
            <h1>Oops!</h1>
            <h4>Something went wrong.</h4>

            <p>Please try going back to the <a href="/" >Home page</a></p>
        </div>
    """)))}),format.raw/*28.6*/("""

""")))}))
      }
    }
  }

  def render(ex:Throwable): play.twirl.api.HtmlFormat.Appendable = apply(ex)

  def f:((Throwable) => play.twirl.api.HtmlFormat.Appendable) = (ex) => apply(ex)

  def ref: this.type = this

}


}

/**/
object errorPage extends errorPage_Scope0.errorPage
              /*
                  -- GENERATED --
                  DATE: Fri Oct 20 16:41:01 WAT 2017
                  SOURCE: C:/Users/Longbridge PC/Documents/HOTMGMT/Hotel-Management-App/Hotel-Management-App/app/views/exceptions/errorPage.scala.html
                  HASH: e3bcf08a11ca08caf57363ce8d850f6f13418c25
                  MATRIX: 767->1|876->15|908->22|930->36|969->38|1003->47|1057->93|1096->95|1132->105|1209->156|1244->171|1286->185|1486->358|1643->494|1697->530|1710->534|1749->535|1786->545|2021->750
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|37->6|37->6|38->7|40->9|40->9|41->10|48->17|50->19|52->21|52->21|52->21|53->22|59->28
                  -- GENERATED --
              */
          