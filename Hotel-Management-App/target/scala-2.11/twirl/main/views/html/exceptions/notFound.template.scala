
package views.html.exceptions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object notFound_Scope0 {
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

class notFound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(uri:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/breadCrumb/*3.12*/ = {{

    sharedfunctions.BreadCrumbs.generate(("Not Found"),null);
}};
Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*6.2*/("""

"""),_display_(/*8.2*/main("Not Found")/*8.19*/ {_display_(Seq[Any](format.raw/*8.21*/("""

    """),format.raw/*10.5*/("""<div class="row">
        <div class="container">
            <div class="col-md-8">
                <p class="">
                    <strong>
                    The requested URL <em>"""),_display_(/*15.44*/uri),format.raw/*15.47*/("""</em> was not found
                    </strong>
                </p>
                <img src='"""),_display_(/*18.28*/routes/*18.34*/.Assets.at("images/4042.png")),format.raw/*18.63*/("""' title="Page Not Found" class="img-thumbnail"/>
            </div>


        </div>
    </div>


""")))}))
      }
    }
  }

  def render(uri:String): play.twirl.api.HtmlFormat.Appendable = apply(uri)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (uri) => apply(uri)

  def ref: this.type = this

}


}

/**/
object notFound extends notFound_Scope0.notFound
              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 05:13:39 AEDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/exceptions/notFound.scala.html
                  HASH: 3e0fa117e963b5abb0cc62c180ddb39554630fe0
                  MATRIX: 762->1|852->18|870->28|973->13|1003->101|1033->106|1058->123|1097->125|1132->133|1350->324|1374->327|1502->428|1517->434|1567->463
                  LINES: 27->1|31->3|31->3|35->1|37->6|39->8|39->8|39->8|41->10|46->15|46->15|49->18|49->18|49->18
                  -- GENERATED --
              */
          