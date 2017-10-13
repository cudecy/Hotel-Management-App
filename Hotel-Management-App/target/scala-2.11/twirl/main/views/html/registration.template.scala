
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registration_Scope0 {
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

class registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[forms.AppUserForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(appUserForm: Form[forms.AppUserForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("Registration")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.111*/("""
"""),format.raw/*5.1*/("""<div>
    <div class=" container">
        <h3 class="page-header h3"style="text-align: center; background-color: black;">Registration</h3>
        <form href="/registration/save" form action="controllers.routes.UserController.save()" method="POST">
        <div class="packageSquare col-md-6" style="background-color: black" >
            <div class="col-md-3 pull-left">
                <input id="firstName" name="firstName" class="form-control" type="text" style="background-color: #DFC977; color: #000000"  value=""""),_display_(/*11.148*/appUserForm/*11.159*/.field("firstName").value),format.raw/*11.184*/(""""placeholder="First Name" required>
                <input id="password" name="password" class="form-control" type="password" style="background-color: #DFC977; color: #000000" value=""""),_display_(/*12.149*/appUserForm/*12.160*/.field("password").value),format.raw/*12.184*/("""" placeholder="Password" required>
                <select id="gender" name="gender" style="background-color: #DFC977; color: #000000" required>
                    <option value="gender"> Gender </option>
                    <option value="male" style="color: white"> Male </option>
                    <option value="female" style="color: white"> Female </option>
                </select>

            </div>
            <div class="col-md-3 pull-right">
                <input id="lastName" name="lastName" class="form-control" type="text" style="background-color: #DFC977; color: #000000" value=""""),_display_(/*21.145*/appUserForm/*21.156*/.field("lastName").value),format.raw/*21.180*/("""" placeholder="Last Name" required>
                <input id="confirmPassword" name="confirmPassword" class="form-control" type="password" style="background-color: #DFC977; color: #000000"  placeholder="Confirm Password" required>
                <input id="mobileNumber" name="mobileNumber" class="form-control" type="text" style="background-color: #DFC977; color: #000000" value=""""),_display_(/*23.153*/appUserForm/*23.164*/.field("mobileNumber").value),format.raw/*23.192*/("""" placeholder="Mobile number" required>
            </div>
            <input id="date" name="date" class=" form-control col-md-3" type="date" value=""""),_display_(/*25.93*/appUserForm/*25.104*/.field("date").value),format.raw/*25.124*/(""""style="background-color: #DFC977; color: #000000" required>
            <input type="submit" class="col-md-6 col-lg-push-3" style="background-color: #DFC977; color: #000000;align-self: center" value="Submit"></div>
        </form>
    </div>
</div>
    """)))}),format.raw/*30.6*/("""

"""))
      }
    }
  }

  def render(appUserForm:Form[forms.AppUserForm]): play.twirl.api.HtmlFormat.Appendable = apply(appUserForm)

  def f:((Form[forms.AppUserForm]) => play.twirl.api.HtmlFormat.Appendable) = (appUserForm) => apply(appUserForm)

  def ref: this.type = this

}


}

/**/
object registration extends registration_Scope0.registration
              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 11:41:23 PDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/registration.scala.html
                  HASH: 91247a10f602746fa8a8b032114fc96077d0fbaa
                  MATRIX: 776->1|909->39|939->44|967->64|1006->66|1040->178|1068->180|1622->706|1643->717|1690->742|1903->927|1924->938|1970->962|2609->1573|2630->1584|2676->1608|3090->1994|3111->2005|3161->2033|3341->2186|3362->2197|3404->2217|3694->2477
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|42->11|42->11|42->11|43->12|43->12|43->12|52->21|52->21|52->21|54->23|54->23|54->23|56->25|56->25|56->25|61->30
                  -- GENERATED --
              */
          