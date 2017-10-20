
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
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Garage Bootstrap Template</title>
        <meta name="description" content="">
            <!--

Template 2079 Garage

http://www.tooplate.com/view/2079-garage

-->
        <meta name="author" content="Web Domus Italia">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.at("css/bootstrap.css")),format.raw/*17.92*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.at("Fonts/font-awesome-4.5.0/css/font-awesome.css")),format.raw/*18.120*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*19.55*/routes/*19.61*/.Assets.at("css/slider.css")),format.raw/*19.89*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*20.55*/routes/*20.61*/.Assets.at("css/mystyle.css")),format.raw/*20.90*/("""">
    </head>
    <body>
            <!-- Header -->
        <div class="allcontain">
            <div class="header">
                <ul class="socialicon">
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                </ul>
                <ul class="givusacall">
                    <li>Give us a call : +66666666 </li>
                </ul>
            </div>
                <!-- Navbar Up -->
            <nav class="topnavbar navbar-default topnav">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed toggle-costume" data-toggle="collapse" data-target="#upmenu" aria-expanded="false">
                            <span class="sr-only"> Toggle navigaion</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand logo" href="#"><img src=""""),_display_(/*46.74*/routes/*46.80*/.Assets.at("images/logo1.png")),format.raw/*46.110*/("""" alt="logo"></a>
                    </div>
                </div>
                <div class="collapse navbar-collapse" id="upmenu">
                    <ul class="nav navbar-nav" id="navbarontop">
                        <li class="active"><a href="index.html">HOME</a> </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle"	data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">CATEGORIES <span class="caret"></span></a>
                            <ul class="dropdown-menu dropdowncostume">
                                <li><a href="#">Sport</a></li>
                                <li><a href="#">Old</a></li>
                                <li><a href="#">New</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">DEALERS <span class="caret"></span></a>
                            <ul class="dropdown-menu dropdowncostume">
                                <li><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="3">3</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="/contact">CONTACT</a>

                        </li>
                        <button><span class="postnewcar">POST NEW CAR</span></button>
                    </ul>
                </div>
            </nav>
        </div>

        <div class="feturedsection">
            <h1 class="text-center"><span class="bdots">&bullet;</span>Login &nbsp;&nbsp;&bullet;</h1>
        </div>

            <!--Login box below-->
        <div class="container">
            <div class="col-md-8">
                <img src=""""),_display_(/*85.28*/routes/*85.34*/.Assets.at("images/benz.jpg")),format.raw/*85.63*/(""""style="width: 750px !important; height: 395px !important;"/>
            </div>
            <div class="row col-md-4 pull-right"  style="background-color:#C59E47 !important;">
                <div style="padding-top: 45px; padding-bottom: 13px">
                    <h4 style="text-align: center; color: snow"><span style="color: black">&bullet;&nbsp;&nbsp;</span>
                        Already A Member ?
                        <span style="color: black">&nbsp;&nbsp;&bullet;</span></h4>
                </div>
                <div class="form-group col-md-8 col-md-offset-2">
                    <h5 style="text-align: center"><b>Username /Email Address</b></h5>
                    <input type="text" class="form-control" placeholder="Please enter your username" />
                </div>
                <div class="form-group col-md-8 col-md-offset-2">
                    <h5 style="text-align: center"><b>Password</b></h5>
                    <input type="text" class="form-control" placeholder="Please enter your password" />
                </div>
                <div class="form-group col-md-offset-7">
                    <input type="submit" class="btn btn-info" style="padding-left: 22px; padding-right: 22px; font-weight: bold; color: black" value="Sign In"/>
                </div>
                <div class="form-group col-md-offset-5" style="padding-bottom: 45px">
                    <a href="">Forgot Your Password ?</a>
                </div>
            </div>
        </div>

            <!-- ______________________________________________________Bottom Menu ______________________________-->
        <div class="bottommenu">
            <div class="bottomlogo">
                <span class="dotlogo">&bullet;</span><img src=""""),_display_(/*113.65*/routes/*113.71*/.Assets.at("images/collectionlogo1.png")),format.raw/*113.111*/("""" alt="logo1"><span class="dotlogo">&bullet;;</span>
            </div>
            <ul class="nav nav-tabs bottomlinks">
                <li role="presentation" ><a href="#/" role="button">ABOUT US</a></li>
                <li role="presentation"><a href="#/">CATEGORIES</a></li>
                <li role="presentation"><a href="#/">PREORDERS</a></li>
                <li role="presentation"><a href="/contact">CONTACT US</a></li>
                <li role="presentation"><a href="#/">RECEIVE OUR NEWSLETTER</a></li>
            </ul>
            <p>"Lorem ipsum dolor sit amet, consectetur,  sed do eiusmod tempor incididunt <br>
                eiusmod tempor incididunt"</p>
            <img src="image/line.png" alt="line"> <br>
            <div class="bottomsocial">
                <a href="#"><i class="fa fa-facebook"></i></a>
                <a href="#"><i class="fa fa-twitter"></i></a>
                <a href="#"><i class="fa fa-google-plus"></i></a>
                <a href="#"><i class="fa fa-pinterest"></i></a>
            </div>
            <div class="footer">
                <div class="copyright">
                        &copy; Copy right 2016 | <a href="#">Privacy </a>| <a href="#">Policy</a>
                </div>
                <div class="atisda">
					 Designed by <a href="http://www.webdomus.net/">Web Domus Italia - Web Agency </a>
				</div>
            </div>
        </div>
        """),format.raw/*140.19*/("""

        """),format.raw/*142.9*/("""<script type="text/javascript" src=""""),_display_(/*142.46*/routes/*142.52*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*142.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*143.46*/routes/*143.52*/.Assets.at("javascripts/isotope.js")),format.raw/*143.88*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*144.46*/routes/*144.52*/.Assets.at("javascripts/myscript.js")),format.raw/*144.89*/(""""></script>
        """),format.raw/*145.105*/("""
        """),format.raw/*146.9*/("""<script type="text/javascript" src=""""),_display_(/*146.46*/routes/*146.52*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*146.94*/(""""></script>
    </body>
</html>"""))
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
                  DATE: Fri Oct 20 16:55:38 WAT 2017
                  SOURCE: C:/Users/Longbridge PC/Documents/HOTMGMT/Hotel-Management-App/Hotel-Management-App/app/views/login.scala.html
                  HASH: f26f0ca6ae14595da236905d232d01794958393b
                  MATRIX: 827->0|1375->521|1390->527|1442->558|1527->616|1542->622|1623->681|1708->739|1723->745|1772->773|1857->831|1872->837|1922->866|3303->2220|3318->2226|3370->2256|5384->4243|5399->4249|5449->4278|7260->6061|7276->6067|7339->6107|8813->7562|8853->7574|8918->7611|8934->7617|9001->7662|9087->7720|9103->7726|9161->7762|9247->7820|9263->7826|9322->7863|9373->7980|9411->7990|9476->8027|9492->8033|9556->8075
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|77->46|77->46|77->46|116->85|116->85|116->85|144->113|144->113|144->113|171->140|173->142|173->142|173->142|173->142|174->143|174->143|174->143|175->144|175->144|175->144|176->145|177->146|177->146|177->146|177->146
                  -- GENERATED --
              */
          