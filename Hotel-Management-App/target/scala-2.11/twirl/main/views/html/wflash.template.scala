
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object wflash_Scope0 {
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

     object wflash_Scope1 {
import helper._

class wflash extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/flash/*3.7*/.map/*3.11*/ {/*4.5*/case (key, value) =>/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
        """),format.raw/*5.9*/("""<div id="flasher" class="alert alert-"""),_display_(/*5.47*/key),format.raw/*5.50*/(""" """),format.raw/*5.51*/("""alert-square" >
            <button aria-hidden="true" data-dismiss="alert" class="close" type="button">×</button>
            <p class="text-center">"""),_display_(/*7.37*/value),format.raw/*7.42*/("""</p>
        </div>
    """)))}}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object wflash extends wflash_Scope0.wflash_Scope1.wflash
              /*
                  -- GENERATED --
                  DATE: Fri Oct 20 16:41:01 WAT 2017
                  SOURCE: C:/Users/Longbridge PC/Documents/HOTMGMT/Hotel-Management-App/Hotel-Management-App/app/views/wflash.scala.html
                  HASH: cd1f0784630f1950219498bfe3a822399e02639d
                  MATRIX: 874->21|886->26|898->30|907->38|935->58|974->60|1010->70|1074->108|1097->111|1125->112|1304->265|1329->270
                  LINES: 35->3|35->3|35->3|35->4|35->4|35->4|36->5|36->5|36->5|36->5|38->7|38->7
                  -- GENERATED --
              */
          