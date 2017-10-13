
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
"""),format.raw/*4.107*/("""
    """),format.raw/*5.5*/("""<div class="container" style="">

        <h3 class="page-header h3" style="text-align: center ; background-color: black">Login</h3>
        <div class="packageSquare col-md-6" style="background-color: black">
        <div  style="margin-top: 50px" class="form-group col-md-6 col-md-offset-3" >
           <label style="color: white"> Username/Email Address: </label>  <input type="text"name="username" style="background-color: #DFC977; color: #000000" class="input input-sm" placeholder="Enter Username" >
        </div>
            <div class="form-group col-md-6 col-md-offset-3">
                <label style="color: white;">Password: </label><input type="password"name="pword" style="background-color: #dfc977; color: #000000 " class="input input-sm" placeholder="Enter Password">
        </div>
            <br><br>
        <div style="margin-bottom: 50px" class="col-md-5 col-md-offset-1"><button type="Submit" style="margin-left: 35px" class="btn btn-default"> Submit </button></div>
        </div>




    </div>
""")))}),format.raw/*23.2*/("""






"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 11:41:20 PDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/login.scala.html
                  HASH: 944e44f0fa380d5b5d191290602da3ab12c91b47
                  MATRIX: 738->1|834->3|864->8|885->21|924->23|954->131|986->137|2057->1178
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|54->23
                  -- GENERATED --
              */
          