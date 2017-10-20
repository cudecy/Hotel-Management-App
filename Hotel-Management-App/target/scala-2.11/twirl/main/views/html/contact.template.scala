
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
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

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!doctype html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Garage Template - Contact Page</title>
        <meta name="description" content="">
            <!--

Template 2079 Garage

http://www.tooplate.com/view/2079-garage

-->
        <meta name="author" content="Web Domus Italia">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*19.55*/routes/*19.61*/.Assets.at("css/bootstrap.css")),format.raw/*19.92*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*20.55*/routes/*20.61*/.Assets.at("Fonts/font-awesome-4.5.0/css/font-awesome.min.css")),format.raw/*20.124*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*21.55*/routes/*21.61*/.Assets.at("css/slider.css")),format.raw/*21.89*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*22.55*/routes/*22.61*/.Assets.at("css/mystyle.css")),format.raw/*22.90*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*23.55*/routes/*23.61*/.Assets.at("css/contactstyle.css")),format.raw/*23.95*/("""">
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
                <ul class="logreg">
                    <li><a href="/login">Login </a> </li>
                    <li><a href="/registration"><span class="register">Register</span></a></li>
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
                        <a class="navbar-brand logo" href="/"><img src=""""),_display_(/*53.74*/routes/*53.80*/.Assets.at("images/logo1.png")),format.raw/*53.110*/("""" alt="logo"></a>
                    </div>
                </div>
                <div class="collapse navbar-collapse" id="upmenu">
                    <ul class="nav navbar-nav" id="navbarontop">
                        <li class="active"><a href="/">HOME</a> </li>
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
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">CONTACT </a>
                        </li>
                        <button><span class="postnewcar">POST NEW CAR</span></button>
                    </ul>
                </div>
            </nav>
        </div>
            <!--_______________________________________ Carousel__________________________________ -->
        <div class="allcontain">
            <div id="carousel-up" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner " role="listbox">
                    <div class="item active">
                        <img src=""""),_display_(/*88.36*/routes/*88.42*/.Assets.at("images/oldcar.jpg")),format.raw/*88.73*/("""" alt="oldcar">
                        <div class="carousel-caption">
                            <h2>Porsche 356</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur ,<br>
                                sed do eiusmod tempor incididunt ut labore </p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="""),_display_(/*96.35*/routes/*96.41*/.Assets.at("images/porche.jpg")),format.raw/*96.72*/("""" alt="porche">
                        <div class="carousel-caption">
                            <h2>Porche</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur ,<br>
                                sed do eiusmod tempor incididunt ut labore </p>
                        </div>
                    </div>
                    <div class="item">
                        <img src=""""),_display_(/*104.36*/routes/*104.42*/.Assets.at("images/benz.jpg")),format.raw/*104.71*/("""" alt="benz">
                        <div class="carousel-caption">
                            <h2>Car</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur ,<br>
                                sed do eiusmod tempor incididunt ut labore </p>
                        </div>
                    </div>
                </div>
                <nav class="navbar navbar-default midle-nav">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed textcostume" data-toggle="collapse" data-target="#navbarmidle" aria-expanded="false">
                            <h1>SEARCH TEXT</h1>
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="collapse navbar-collapse" id="navbarmidle">
                        <div class="searchtxt">
                            <h1>SEARCH TEXT</h1>
                        </div>
                        <form class="navbar-form navbar-left searchformmargin" role="search">
                            <div class="form-group">
                                <input type="text" class="form-control searchform" placeholder="Enter Keyword">
                            </div>
                        </form>
                        <ul class="nav navbar-nav navbarborder">
                            <li class="li-category">
                                <a class="btn  dropdown-toggle btn-costume"  id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Category<span class="glyphicon glyphicon-chevron-down downicon"></span></a>
                                <ul class="dropdown-menu" id="mydd">
                                    <li><a href="#">Epic</a></li>
                                    <li><a href="#">Old</a></li>
                                    <li><a href="#">New</a></li>
                                </ul>
                            </li>
                            <li class="li-minyear"><a class="btn  dropdown-toggle btn-costume"  id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Min Year <span class="glyphicon glyphicon-chevron-down downicon"></span></a>
                                <ul class="dropdown-menu" id="mydd2">
                                    <li><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                </ul>
                            </li>
                            <li class="li-maxyear"><a class="btn dropdown-toggle btn-costume"  id="dropdownMenu3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Max Year <span class="glyphicon glyphicon-chevron-down downicon"></span></a>
                                <ul class="dropdown-menu" id="mydd3">
                                    <li><a href="#">1900</a></li>
                                    <li><a href="#">2000</a></li>
                                    <li><a href="#">2016</a></li>
                                </ul>
                            </li>
                            <li class="li-slideprice">
                                <p> <label class="slidertxt" for="amount">Price </label>
                                    <input class="priceslider" type="text" id="amount" readonly="readonly">
                                </p>
                                <div id="slider-range"></div>

                            </li>
                            <li class="li-search"> <button class="searchbutton"><span class="glyphicon glyphicon-search "></span></button></li>
                        </ul>

                    </div>
                </nav>
            </div>
        </div>
        <div class="allcontain">
            <div class="contact">
                <div class="newslettercontent">
                    <div class="leftside">
                        <img id="image_border" src=""""),_display_(/*172.54*/routes/*172.60*/.Assets.at("images/border.png")),format.raw/*172.91*/("""" alt="border">
                        <div class="contact-form">
                            <h1>Contact Us</h1>
                            <div class="form-group group-coustume">
                                <input type="text" class="form-control name-form" placeholder="Name">
                                <input type="text" class="form-control email-form" placeholder="E-mail">
                                <input type="text" class="form-control subject-form" placeholder="Subject">
                                <textarea rows="4" cols="50" class="message-form"></textarea>
                                <button type="submit" class="btn btn-default btn-submit">Submit</button>
                            </div>
                        </div>
                    </div>
                    <div class="google-maps">
                        <div id="googleMap"></div>

                    </div>
                </div>

            </div>
        </div>
        <div class="footer">
            <div class="copyright">
                    &copy; Copy right 2016 | <a href="#">Privacy </a>| <a href="#">Policy</a>
            </div>
            <div class="atisda">
                Designed by <a href="http://www.webdomus.net/">Web Domus Italia - Web Agency </a>
            </div>
        </div>



        <script src="http://maps.googleapis.com/maps/api/js"></script>
        <script>

                var myCenter=new google.maps.LatLng(41.567197,14.681526);

                function initialize()
                """),format.raw/*209.17*/("""{"""),format.raw/*209.18*/("""
                    """),format.raw/*210.21*/("""var mapProp = """),format.raw/*210.35*/("""{"""),format.raw/*210.36*/("""
                        """),format.raw/*211.25*/("""center:myCenter,
                        zoom:16,
                        mapTypeId:google.maps.MapTypeId.ROADMAP
                    """),format.raw/*214.21*/("""}"""),format.raw/*214.22*/(""";

                    var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

                    var marker=new google.maps.Marker("""),format.raw/*218.55*/("""{"""),format.raw/*218.56*/("""
                        """),format.raw/*219.25*/("""position:myCenter,
                    """),format.raw/*220.21*/("""}"""),format.raw/*220.22*/(""");

                    marker.setMap(map);
                """),format.raw/*223.17*/("""}"""),format.raw/*223.18*/("""



        """),format.raw/*227.9*/("""</script>

        <script>
                $(window).resize(function()"""),format.raw/*230.44*/("""{"""),format.raw/*230.45*/("""
                    """),format.raw/*231.21*/("""var new_height = $("#image_border").height();
                    console.log(new_height);
                    $("#googleMap").height(new_height);
                """),format.raw/*234.17*/("""}"""),format.raw/*234.18*/(""");

                $(window).load(function()"""),format.raw/*236.42*/("""{"""),format.raw/*236.43*/("""
                    """),format.raw/*237.21*/("""var new_height = $("#image_border").height();
                    console.log(new_height);
                    $("#googleMap").height(new_height);
                    google.maps.event.addDomListener(window, 'load', initialize());
                """),format.raw/*241.17*/("""}"""),format.raw/*241.18*/(""");

        </script>
        <script type="text/javascript" src=""""),_display_(/*244.46*/routes/*244.52*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*244.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*245.46*/routes/*245.52*/.Assets.at("javascripts/isotope.js")),format.raw/*245.88*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*246.46*/routes/*246.52*/.Assets.at("javascripts/myscript.js")),format.raw/*246.89*/(""""></script>
        """),format.raw/*247.105*/("""
        """),format.raw/*248.9*/("""<script type="text/javascript" src=""""),_display_(/*248.46*/routes/*248.52*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*248.94*/(""""></script>
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
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Fri Oct 20 16:54:08 WAT 2017
                  SOURCE: C:/Users/Longbridge PC/Documents/HOTMGMT/Hotel-Management-App/Hotel-Management-App/app/views/contact.scala.html
                  HASH: 05e3e9a482fd55f5c764e90c761d00fa610f1ee4
                  MATRIX: 742->1|838->3|868->7|1421->533|1436->539|1488->570|1573->628|1588->634|1673->697|1758->755|1773->761|1822->789|1907->847|1922->853|1972->882|2057->940|2072->946|2127->980|3724->2550|3739->2556|3791->2586|5977->4745|5992->4751|6044->4782|6487->5198|6502->5204|6554->5235|6994->5647|7010->5653|7061->5682|11402->9995|11418->10001|11471->10032|13074->11606|13104->11607|13155->11629|13198->11643|13228->11644|13283->11670|13449->11807|13479->11808|13665->11965|13695->11966|13750->11992|13819->12032|13849->12033|13941->12096|13971->12097|14015->12113|14118->12187|14148->12188|14199->12210|14394->12376|14424->12377|14500->12424|14530->12425|14581->12447|14861->12698|14891->12699|14989->12769|15005->12775|15072->12820|15158->12878|15174->12884|15232->12920|15318->12978|15334->12984|15393->13021|15444->13138|15482->13148|15547->13185|15563->13191|15627->13233
                  LINES: 27->1|32->1|34->3|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|84->53|84->53|84->53|119->88|119->88|119->88|127->96|127->96|127->96|135->104|135->104|135->104|203->172|203->172|203->172|240->209|240->209|241->210|241->210|241->210|242->211|245->214|245->214|249->218|249->218|250->219|251->220|251->220|254->223|254->223|258->227|261->230|261->230|262->231|265->234|265->234|267->236|267->236|268->237|272->241|272->241|275->244|275->244|275->244|276->245|276->245|276->245|277->246|277->246|277->246|278->247|279->248|279->248|279->248|279->248
                  -- GENERATED --
              */
          