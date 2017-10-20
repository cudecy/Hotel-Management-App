
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.lang;
import helper._;

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!doctype html>
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
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*22.55*/routes/*22.61*/.Assets.at("css/bootstrap.min.css")),format.raw/*22.96*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*23.55*/routes/*23.61*/.Assets.at("Fonts/font-awesome-4.5.0/css/font-awesome.min.css")),format.raw/*23.124*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*24.55*/routes/*24.61*/.Assets.at("css/slider.css")),format.raw/*24.89*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*25.55*/routes/*25.61*/.Assets.at("css/mystyle.css")),format.raw/*25.90*/("""">
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
                        <a class="navbar-brand logo" href="#"><img src=""""),_display_(/*55.74*/routes/*55.80*/.Assets.at("images/logo1.png")),format.raw/*55.110*/("""" alt="logo"></a>
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
                        <li>
                            """),format.raw/*78.88*/("""
                            """),format.raw/*79.29*/("""<a href="/contact">CONTACT</a>

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
                        <img src=""""),_display_(/*92.36*/routes/*92.42*/.Assets.at("images/oldcar.jpg")),format.raw/*92.73*/("""" alt="oldcar">
                        <div class="carousel-caption">
                            <h2>Porsche 356</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur ,<br>
                                sed do eiusmod tempor incididunt ut labore </p>
                        </div>
                    </div>
                    <div class="item">
                        <img src=""""),_display_(/*100.36*/routes/*100.42*/.Assets.at("images/porche.jpg")),format.raw/*100.73*/("""" alt="porche">
                        <div class="carousel-caption">
                            <h2>Porche</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur ,<br>
                                sed do eiusmod tempor incididunt ut labore </p>
                        </div>
                    </div>
                    <div class="item">
                        <img src=""""),_display_(/*108.36*/routes/*108.42*/.Assets.at("images/benz.jpg")),format.raw/*108.71*/("""" alt="benz">
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
            <!-- ____________________Featured Section ______________________________-->
        <div class="allcontain">
            <div class="feturedsection">
                <h1 class="text-center"><span class="bdots">&bullet;</span>F E A T U R E S<span class="carstxt">C A R S</span>&bullet;</h1>
            </div>
            <div class="feturedimage">
                <div class="row firstrow">
                    <div class="col-lg-6 costumcol colborder1">
                        <div class="row costumrow">
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 img1colon">
                                <img src=""""),_display_(/*182.44*/routes/*182.50*/.Assets.at("images/featurporch.jpg")),format.raw/*182.86*/("""" alt="porsche">
                            </div>
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 txt1colon ">
                                <div class="featurecontant">
                                    <h1>LOREM IPSUM</h1>
                                    <p>"Lorem ipsum dolor sit amet, consectetur ,<br>
                                        sed do eiusmod tempor incididunt </p>
                                    <h2>Price &euro;</h2>
                                    <button id="btnRM" onClick="rmtxt()">READ MORE</button>
                                    <div id="readmore">
                                        <h1>Car Name</h1>
                                        <p>"Lorem ipsum dolor sit amet, consectetur ,<br>
                                            sed do eiusmod tempor incididunt <br>"Lorem ipsum dolor sit amet, consectetur ,<br>
                                            sed do eiusmod tempor incididunt"Lorem ipsum dolor sit amet, consectetur1 ,
                                            sed do eiusmod tempor incididunt"Lorem ipsum dolor sit amet, consectetur1
                                            sed do eiusmod tempor incididunt"Lorem ipsum dolor sit amet, consectetur1<br>
                                        </p>
                                        <button id="btnRL">READ LESS</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 costumcol colborder2">
                        <div class="row costumrow">
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 img2colon">
                                <img src=""""),_display_(/*208.44*/routes/*208.50*/.Assets.at("images/featurporch1.jpg")),format.raw/*208.87*/("""" alt="porsche1">
                            </div>
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 txt1colon ">
                                <div class="featurecontant">
                                    <h1>LOREM IPSUM</h1>
                                    <p>"Lorem ipsum dolor sit amet, consectetur ,<br>
                                        sed do eiusmod tempor incididunt </p>
                                    <h2>Price &euro;</h2>
                                    <button id="btnRM2">READ MORE</button>
                                    <div id="readmore2">
                                        <h1>Car Name</h1>
                                        <p>"Lorem ipsum dolor sit amet, consectetur ,<br>
                                            sed do eiusmod tempor incididunt <br>"Lorem ipsum dolor sit amet, consectetur ,<br>
                                            sed do eiusmod tempor incididunt"Lorem ipsum dolor sit amet, consectetur1 ,
                                            sed do eiusmod tempor incididunt"Lorem ipsum dolor sit amet, consectetur1
                                            sed do eiusmod tempor incididunt"Lorem ipsum dolor sit amet, consectetur1<br></p>
                                        <button id="btnRL2">READ LESS</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
                <!-- ________________________LATEST CARS SECTION _______________________-->
            <div class="latestcars">
                <h1 class="text-center">&bullet; LATEST   CARS &bullet;</h1>
                <ul class="nav nav-tabs navbar-left latest-navleft">
                    <li role="presentation" class="li-sortby"><span class="sortby">SORT BY: </span></li>
                    <li data-filter=".RECENT" role="presentation"><a href="#mostrecent" class="prcBtnR">MOST RECENT </a></li>
                    <li data-filter=".POPULAR" role="presentation"><a href="#mostpopular" class="prcBtnR">MOST POPULAR </a></li>
                    <li  role="presentation"><a href="#" class="alphSort">ALPHABETICAL </a></li>
                    <li data-filter=".HPRICE" role="presentation"><a href="#" class="prcBtnH">HIGHEST PRICE </a></li>
                    <li data-filter=".LPRICE" role="presentation"><a href="#" class="prcBtnL">LOWEST  PRICE </a></li>
                    <li id="hideonmobile">
                </ul>
            </div>
            <br>
            <br>
                <!-- ________________________Latest Cars Image Thumbnail________________-->
            <div class="grid">
                <div class="row">
                    <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
                        <div class="txthover">
                            <img src=""""),_display_(/*252.40*/routes/*252.46*/.Assets.at("images/car1.jpg")),format.raw/*252.75*/("""" alt="car1">
                            <div class="txtcontent">
                                <div class="stars">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                                <div class="simpletxt">
                                    <h3 class="name">Rolls Royce</h3>
                                    <p>"Lorem ipsum dolor sit amet, consectetur,<br>
                                        sed do eiusmod tempor incididunt" </p>
                                    <h4 class="price"> 1000&euro;</h4>
                                    <button>READ MORE</button><br>
                                    <div class="wishtxt">
                                        <p class="paragraph1"> Add to Wishlist <span class="glyphicon glyphicon-heart"></span> </p>
                                        <p class="paragraph2">Compare <span class="icon"><img src="image/compicon.png" alt="compicon"></span></p>
                                    </div>
                                </div>
                                <div class="stars2">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 ">
                        <div class="txthover">
                            <img src=""""),_display_(/*280.40*/routes/*280.46*/.Assets.at("images/car2.jpg")),format.raw/*280.75*/("""" alt="car2">
                            <div class="txtcontent">
                                <div class="stars">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                                <div class="simpletxt">
                                    <h3 class="name">Renault</h3>
                                    <p>"Lorem ipsum dolor sit amet, consectetur,<br>
                                        sed do eiusmod tempor incididunt" </p>
                                    <h4 class="price">900 &euro;</h4>
                                    <button>READ MORE</button><br>
                                    <div class="wishtxt">
                                        <p class="paragraph1"> Add to Wishlist <span class="glyphicon glyphicon-heart"></span> </p>
                                        <p class="paragraph2">Compare <span class="icon"><img src="image/compicon.png" alt="compicon"></span></p>
                                    </div>
                                </div>
                                <div class="stars2">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
                        <div class="txthover">
                            <img src=""""),_display_(/*308.40*/routes/*308.46*/.Assets.at("images/car3.jpg")),format.raw/*308.75*/("""" alt="car3">
                            <div class="txtcontent">
                                <div class="stars">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                                <div class="simpletxt">
                                    <h3 class="name">Ford Mustang</h3>
                                    <p>"Lorem ipsum dolor sit amet, consectetur,<br>
                                        sed do eiusmod tempor incididunt" </p>
                                    <h4 class="price">3000 &euro;</h4>
                                    <button>READ MORE</button><br>
                                    <div class="wishtxt">
                                        <p class="paragraph1"> Add to Wishlist <span class="glyphicon glyphicon-heart"></span> </p>
                                        <p class="paragraph2">Compare <span class="icon"><img src="image/compicon.png" alt="compicon"></span></p>
                                    </div>
                                </div>
                                <div class="stars2">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
                        <div class="txthover">
                            <img src=""""),_display_(/*336.40*/routes/*336.46*/.Assets.at("images/car4.jpg")),format.raw/*336.75*/("""" alt="car4">
                            <div class="txtcontent">
                                <div class="stars">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                                <div class="simpletxt">
                                    <h3 class="name">Rover</h3>
                                    <p>"Lorem ipsum dolor sit amet, consectetur,<br>
                                        sed do eiusmod tempor incididunt" </p>
                                    <h4 class="price">1000 &euro;</h4>
                                    <button>READ MORE</button><br>
                                    <div class="wishtxt">
                                        <p class="paragraph1"> Add to Wishlist <span class="glyphicon glyphicon-heart"></span> </p>
                                        <p class="paragraph2">Compare <span class="icon"><img src="image/compicon.png" alt="compicon"></span></p>
                                    </div>
                                </div>
                                <div class="stars2">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
                        <div class="txthover">
                            <img src=""""),_display_(/*364.40*/routes/*364.46*/.Assets.at("images/car5.jpg")),format.raw/*364.75*/("""" alt="car5">
                            <div class="txtcontent">
                                <div class="stars">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                                <div class="simpletxt">
                                    <h3 class="name">Porche</h3>
                                    <p>"Lorem ipsum dolor sit amet, consectetur,<br>
                                        sed do eiusmod tempor incididunt" </p>
                                    <h4 class="price">1200 &euro;</h4>
                                    <button>READ MORE</button><br>
                                    <div class="wishtxt">
                                        <p class="paragraph1"> Add to Wishlist <span class="glyphicon glyphicon-heart"></span> </p>
                                        <p class="paragraph2">Compare <span class="icon"><img src=""""),_display_(/*379.101*/routes/*379.107*/.Assets.at("images/compicon.png")),format.raw/*379.140*/("""" alt="compicon"></span></p>
                                    </div>
                                </div>
                                <div class="stars2">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
                        <div class="txthover">
                            <img src=""""),_display_(/*392.40*/routes/*392.46*/.Assets.at("images/car6.jpg")),format.raw/*392.75*/("""" alt="car6">
                            <div class="txtcontent">
                                <div class="stars">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                                <div class="simpletxt">
                                    <h3 class="name">Porche 911</h3>
                                    <p>"Lorem ipsum dolor sit amet, consectetur,<br>
                                        sed do eiusmod tempor incididunt" </p>
                                    <h4 class="price">4000 &euro;</h4>
                                    <button>READ MORE</button><br>
                                    <div class="wishtxt">
                                        <p class="paragraph1"> Add to Wishlist <span class="glyphicon glyphicon-heart"></span> </p>
                                        <p class="paragraph2">Compare <span class="icon"><img src="image/compicon.png" alt="compicon"></span></p>
                                    </div>
                                </div>
                                <div class="stars2">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
                        <div class="txthover">
                            <img src=""""),_display_(/*420.40*/routes/*420.46*/.Assets.at("images/car7.jpg")),format.raw/*420.75*/("""" alt="car7">
                            <div class="txtcontent">
                                <div class="stars">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                                <div class="simpletxt">
                                    <h3 class="name">Chevrolet SS</h3>
                                    <p>"Lorem ipsum dolor sit amet, consectetur,<br>
                                        sed do eiusmod tempor incididunt" </p>
                                    <h4 class="price">3000 &euro;</h4>
                                    <button>READ MORE</button><br>
                                    <div class="wishtxt">
                                        <p class="paragraph1"> Add to Wishlist <span class="glyphicon glyphicon-heart"></span> </p>
                                        <p class="paragraph2">Compare <span class="icon"><img src="image/compicon.png" alt="compicon"></span></p>
                                    </div>
                                </div>
                                <div class="stars2">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
                        <div class="txthover">
                            <img src=""""),_display_(/*448.40*/routes/*448.46*/.Assets.at("images/car8.jpg")),format.raw/*448.75*/("""" alt="car8">
                            <div class="txtcontent">
                                <div class="stars">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                                <div class="simpletxt">
                                    <h3 class="name">Meclaren</h3>
                                    <p>"Lorem ipsum dolor sit amet, consectetur,<br>
                                        sed do eiusmod tempor incididunt" </p>
                                    <h4 class="price">2500 &euro;</h4>
                                    <button>READ MORE</button><br>
                                    <div class="wishtxt">
                                        <p class="paragraph1"> Add to Wishlist <span class="glyphicon glyphicon-heart"></span> </p>
                                        <p class="paragraph2">Compare <span class="icon"><img src="image/compicon.png" alt="compicon"></span></p>
                                    </div>
                                </div>
                                <div class="stars2">
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                    <div class="glyphicon glyphicon-star"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
                <!-- _______________________________News Letter ____________________-->
            <div class="newslettercontent">
                <div class="leftside">
                    <img src=""""),_display_(/*479.32*/routes/*479.38*/.Assets.at("images/border.png")),format.raw/*479.69*/("""" alt="border">
                    <h1>NEWSLETTER</h1>
                    <p>Subscribe to the COLLECTIONCARS mailing list to <br>
                        receive updates on new arrivals, special offers <br>
                        and other discount information.</p>
                </div>
                <div class="rightside">
                    <img class="newsimage" src=""""),_display_(/*486.50*/routes/*486.56*/.Assets.at("images/newsletter.jpg")),format.raw/*486.91*/("""" alt="newsletter">
                    <input type="text" class="form-control" id="subemail" placeholder="EMAIL">
                    <button>SUBSCRIBE</button>
                </div>
            </div>
                <!-- ______________________________________________________Bottom Menu ______________________________-->
            <div class="bottommenu">
                <div class="bottomlogo">
                    <span class="dotlogo">&bullet;</span><img src=""""),_display_(/*494.69*/routes/*494.75*/.Assets.at("images/collectionlogo1.png")),format.raw/*494.115*/("""" alt="logo1"><span class="dotlogo">&bullet;;</span>
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
                <img src=""""),_display_(/*505.28*/routes/*505.34*/.Assets.at("image/line.png")),format.raw/*505.62*/("""" alt="line"> <br>
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
        </div>

        <script type="text/javascript" src=""""),_display_(/*523.46*/routes/*523.52*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*523.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*524.46*/routes/*524.52*/.Assets.at("javascripts/isotope.js")),format.raw/*524.88*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*525.46*/routes/*525.52*/.Assets.at("javascripts/myscript.js")),format.raw/*525.89*/(""""></script>
        """),format.raw/*526.105*/("""
        """),format.raw/*527.9*/("""<script type="text/javascript" src=""""),_display_(/*527.46*/routes/*527.52*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*527.94*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Oct 20 16:41:01 WAT 2017
                  SOURCE: C:/Users/Longbridge PC/Documents/HOTMGMT/Hotel-Management-App/Hotel-Management-App/app/views/main.scala.html
                  HASH: cb679f78eba713a7c396646c598d7460f626fc3f
                  MATRIX: 748->1|907->31|937->74|965->76|1513->597|1528->603|1584->638|1669->696|1684->702|1769->765|1854->823|1869->829|1918->857|2003->915|2018->921|2068->950|3665->2520|3680->2526|3732->2556|5205->4060|5263->4090|5891->4691|5906->4697|5958->4728|6403->5145|6419->5151|6472->5182|6912->5594|6928->5600|6979->5629|11766->10388|11782->10394|11840->10430|13706->12268|13722->12274|13781->12311|16804->15306|16820->15312|16871->15341|18760->17202|18776->17208|18827->17237|20710->19092|20726->19098|20777->19127|22666->20988|22682->20994|22733->21023|24615->22877|24631->22883|24682->22912|25840->24041|25857->24047|25913->24080|26650->24789|26666->24795|26717->24824|28604->26683|28620->26689|28671->26718|30560->28579|30576->28585|30627->28614|32602->30561|32618->30567|32671->30598|33087->30986|33103->30992|33160->31027|33667->31506|33683->31512|33746->31552|34530->32308|34546->32314|34596->32342|35485->33203|35501->33209|35568->33254|35654->33312|35670->33318|35728->33354|35814->33412|35830->33418|35889->33455|35940->33572|35978->33582|36043->33619|36059->33625|36123->33667
                  LINES: 27->1|33->1|35->5|36->6|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|85->55|85->55|85->55|108->78|109->79|122->92|122->92|122->92|130->100|130->100|130->100|138->108|138->108|138->108|212->182|212->182|212->182|238->208|238->208|238->208|282->252|282->252|282->252|310->280|310->280|310->280|338->308|338->308|338->308|366->336|366->336|366->336|394->364|394->364|394->364|409->379|409->379|409->379|422->392|422->392|422->392|450->420|450->420|450->420|478->448|478->448|478->448|509->479|509->479|509->479|516->486|516->486|516->486|524->494|524->494|524->494|535->505|535->505|535->505|553->523|553->523|553->523|554->524|554->524|554->524|555->525|555->525|555->525|556->526|557->527|557->527|557->527|557->527
                  -- GENERATED --
              */
          