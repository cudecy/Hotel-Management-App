
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rooms_Scope0 {
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

class rooms extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <script type="text/javascript" src=""""),_display_(/*7.46*/routes/*7.52*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*7.97*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-ui.min.js")),format.raw/*9.94*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*11.46*/routes/*11.52*/.Assets.at("javascripts/tt_slideshow.js")),format.raw/*11.93*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*13.46*/routes/*13.52*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*13.94*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.Assets.at("javascripts/Customjs.js")),format.raw/*15.89*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*17.46*/routes/*17.52*/.Assets.at("javascripts/contactform.js")),format.raw/*17.92*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*19.46*/routes/*19.52*/.Assets.at("javascripts/angular/angular.min.js")),format.raw/*19.100*/("""">
</script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Add the site description here" />
        <meta  name="keywords" content="First keyword, second keyword," />
        <title>
Hotel Leisure
        </title>
        <link rel="stylesheet"  href=""""),_display_(/*27.40*/routes/*27.46*/.Assets.at("css/bootstrap.css")),format.raw/*27.77*/("""" type="text/css" media="screen"/>
        <link rel="stylesheet"  href=""""),_display_(/*28.40*/routes/*28.46*/.Assets.at("css/style.css")),format.raw/*28.73*/("""" type="text/css" media="screen"/>
        <link rel="stylesheet"  href=""""),_display_(/*29.40*/routes/*29.46*/.Assets.at("stylesheets/main.css")),format.raw/*29.80*/("""" type="text/css" media="screen"/>
            <!--[if lte IE 8]>
<link rel="stylesheet"  href="menuie.css" type="text/css" media="screen"/>
<link rel="stylesheet"  href="vmenuie.css" type="text/css" media="screen"/>
<![endif]-->
        <script type="text/javascript" src=""""),_display_(/*34.46*/routes/*34.52*/.Assets.at("javascripts/totop.js")),format.raw/*34.86*/("""">
</script>
            <!--[if IE 7]>
<style type="text/css" media="screen">
#ttr_vmenu_items  li.ttr_vmenu_items_parent """),format.raw/*38.45*/("""{"""),format.raw/*38.46*/("""margin-left:-16px;font-size:0px;"""),format.raw/*38.78*/("""}"""),format.raw/*38.79*/("""
"""),format.raw/*39.1*/("""</style>
<![endif]-->
            <!--[if lt IE 9]>
<script type="text/javascript" src='"""),_display_(/*42.38*/routes/*42.44*/.Assets.at("javascripts/html5shiv.js")),format.raw/*42.82*/("""'>
        </script>
<script type="text/javascript" src='"""),_display_(/*44.38*/routes/*44.44*/.Assets.at("javascripts/respond.min.js")),format.raw/*44.84*/("""'>
        </script>
        <![endif]-->
    </head>
    <body class="Rooms">
        <div class="totopshow">
            <a href="#" class="back-to-top"><img alt="Back to Top" src='"""),_display_(/*50.74*/routes/*50.80*/.Assets.at("images/gototop0.png")),format.raw/*50.113*/("""'/></a>
        </div>
        <div id="ttr_page" class="container">
            <header id="ttr_header">
                <div id="ttr_header_inner">
                    <a href="http://www.templatetoaster.com" target="_self">
                        <img  class="ttr_header_logo" src='"""),_display_(/*56.61*/routes/*56.67*/.Assets.at("images/logo.png")),format.raw/*56.96*/("""' >
                    </a>
                    <p style="margin-left: 1000px; padding-top: 20px">
                        <span style="color: #ffffff; font-family:'Roboto','Roboto'; margin-right: 15px; font-size: 12px">Already a VIP member?</span>
                        <a class="btn btn-default" href="/login"><span style="color: #ffffff">Login</span></a>
                        <a class="btn btn-default" href="/registration"><span style="color: #ffffff">Register</span></a>
                    </p>
                </div>
            </header>
            <nav id="ttr_menu" class="navbar-default navbar">
                <div id="ttr_menu_inner_in">
                    <div class="menuforeground">
                    </div>
                    <div id="navigationmenu">
                        <div class="navbar-header">
                            <button id="nav-expander" data-target=".navbar-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
                                <span class="sr-only">
                                </span>
                                <span class="icon-bar">
                                </span>
                                <span class="icon-bar">
                                </span>
                                <span class="icon-bar">
                                </span>
                            </button>
                        </div>
                        <div class="menu-center collapse navbar-collapse">
                            <ul class="ttr_menu_items nav navbar-nav nav-center">
                                <li class="ttr_menu_items_parent dropdown active"><a href="/" class="ttr_menu_items_parent_link"><span class="menuchildicon"></span>Home</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                                <li class="ttr_menu_items_parent dropdown"><a href="/about" class="ttr_menu_items_parent_link"><span class="menuchildicon"></span>About</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                                <li class="ttr_menu_items_parent dropdown"><a href="/rooms" class="ttr_menu_items_parent_link_active"><span class="menuchildicon"></span>Rooms</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                                <li class="ttr_menu_items_parent dropdown"><a href="/services" class="ttr_menu_items_parent_link"><span class="menuchildicon"></span>Services</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                                <li class="ttr_menu_items_parent dropdown"><a href="/contact" class="ttr_menu_items_parent_link"><span class="menuchildicon"></span>Contact</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
            <div id="ttr_content_and_sidebar_container">
                <div id="ttr_content">
                    <div id="ttr_content_margin"class="container-fluid">
                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        <div class="ttr_Rooms_html_row0 row">
                            <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="ttr_Rooms_html_column00">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Times New Roman';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">DELUXE ROOMS</span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column01">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*122.225*/routes/*122.231*/.Assets.at("images/60.jpg")),format.raw/*122.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">KING SIZE BEDROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Vivamus non nisi massa, nec lacinia odiomassa</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column02">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*132.225*/routes/*132.231*/.Assets.at("images/61.jpg")),format.raw/*132.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">DELUXE ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Vivamus ac tortor dolor, sit amet males uadaveli.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span> </span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column03">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*142.225*/routes/*142.231*/.Assets.at("images/62.jpg")),format.raw/*142.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">SPECIAL SPA ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Fusce rhoncus nascetur metus mauris parturient.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column04">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*152.225*/routes/*152.231*/.Assets.at("images/63.jpg")),format.raw/*152.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">FAMILY ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Potenti pede id commodo platea consec tetuer.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                        </div>
                        <div class="ttr_Rooms_html_row1 row">
                            <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="ttr_Rooms_html_column10">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Times New Roman';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">STANDARD ROOMS</span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column11">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*174.225*/routes/*174.231*/.Assets.at("images/64.jpg")),format.raw/*174.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">CHILDREN ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Nostra sapien per per metus molestie ut porttitor.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column12">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*184.225*/routes/*184.231*/.Assets.at("images/65.jpg")),format.raw/*184.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">FAMILY ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Tellus risus dis dis est natoque, rhoncus frindilla.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column13">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*194.225*/routes/*194.231*/.Assets.at("images/66.jpg")),format.raw/*194.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">LUXUARY ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Fusce porttitor morbi magnis vitae leo suscipit nunc.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column14">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*204.225*/routes/*204.231*/.Assets.at("images/67.jpg")),format.raw/*204.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">FAMILY ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Fusce porttitor morbi magnis vitae leo suscipit nunc.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                        </div>
                        <div class="ttr_Rooms_html_row2 row">
                            <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="ttr_Rooms_html_column20">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Droid Serif','Arial';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">EXCUTIVE ROOMS</span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column21">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*226.225*/routes/*226.231*/.Assets.at("images/68.jpg")),format.raw/*226.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">SINGLE ROOM</span></p><p style="margin:0.71em 0em 0.36em 0em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Nostra sapien per per metus molestie ut porttitor.</span></p><p style="margin:0.71em 0em 0.36em 0em;text-align:Center;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column22">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*236.225*/routes/*236.231*/.Assets.at("images/69.jpg")),format.raw/*236.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="margin:0.36em 0em 0.36em 0em;text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">SIMPLE ROOM</span></p><p style="margin:0.71em 0em 0.36em 0em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Roboto';">Phasellus laoreet lorem vel dolor tempus vehicula.</span></p><p style="margin:0.71em 0em 0.36em 0em;text-align:Center;"><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column23">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*246.225*/routes/*246.231*/.Assets.at("images/70.jpg")),format.raw/*246.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">SIMPLE ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Roboto';"> Excepteur sint obcaecat cupiditat non proident.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;"><span><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Rooms_html_column24">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*256.225*/routes/*256.231*/.Assets.at("images/71.jpg")),format.raw/*256.258*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">SIMPLE ROOM</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Roboto';"> Excepteur sint obcaecat cupiditat non proident.</span></p><p style="margin:0.71em 0.36em 0.36em 0em;text-align:Center;"><span><span> </span><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">BOOK NOW</a></span></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                        </div>
                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                    </div>
                </div>
                <div style="clear:both">
                </div>
            </div>
            <div style="height:0px;width:0px;overflow:hidden;"></div>
            <footer id="ttr_footer">
                <div class="ttr_footerRooms_html_row0 row">
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerRooms_html_column00">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;"><br style="font-family:'Arial';" /></p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">QUICK LINKS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="About.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">ABOUT</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Services.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SERVICES</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Events.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EVENTS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Blog.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">BLOG</span></a></p><p style="margin:0.71em 0em 0em 2.86em;"><br style="font-family:'Arial';" /></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerRooms_html_column01">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">ROOMS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">STANDARD ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SUITE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">DELUXE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EXCUTIVE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 2.86em;">&nbsp;</p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerRooms_html_column02">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">CONTACT US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">173A Nguyen Van Troi,</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">Ho Chi Minh City, USA</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">PHONE :-&nbsp;&nbsp;+44 (0) 1334 896578</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">MOBILE :-&nbsp;&nbsp;+44 (0) 1334 869548</span></p><p style="margin:0.36em 0em 0em 2.86em;"><br style="font-family:'Roboto';color:rgba(255,255,255,1);" /></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerRooms_html_column03">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 3.21em;">&nbsp;</p><p style="margin:0em 0em 0em 2.86em;"><span style="font-family:'Droid Serif';font-size:1.429em;color:rgba(255,255,255,1);">&nbsp;&nbsp;</span><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">FOLLOW US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*303.530*/routes/*303.536*/.Assets.at("images/72.png")),format.raw/*303.563*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*303.750*/routes/*303.756*/.Assets.at("images/73.png")),format.raw/*303.783*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*303.970*/routes/*303.976*/.Assets.at("images/74.png")),format.raw/*303.1003*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*303.1190*/routes/*303.1196*/.Assets.at("images/75.png")),format.raw/*303.1223*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                    </div>
                </div>
                <div class="ttr_footer_bottom_footer">
                    <div class="ttr_footer_bottom_footer_inner">
                        <div id="ttr_copyright">
                            <a href="#">
                                Copyright © 2014. All rights reserved.
                            </a>
                        </div>
                    </div>
                </div>
            </footer>
            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-bottom-collapse: separate;"></div>
        </div>
        <script type="text/javascript">
                WebFontConfig = """),format.raw/*323.33*/("""{"""),format.raw/*323.34*/("""
                    """),format.raw/*324.21*/("""google: """),format.raw/*324.29*/("""{"""),format.raw/*324.30*/(""" """),format.raw/*324.31*/("""families: [ 'Droid+Serif'] """),format.raw/*324.58*/("""}"""),format.raw/*324.59*/("""
                """),format.raw/*325.17*/("""}"""),format.raw/*325.18*/(""";
                (function() """),format.raw/*326.29*/("""{"""),format.raw/*326.30*/("""
                    """),format.raw/*327.21*/("""var wf = document.createElement('script');
                    wf.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://ajax.googleapis.com/ajax/libs/webfont/1.0.31/webfont.js';
                    wf.type = 'text/javascript';
                    wf.async = 'true';
                    var s = document.getElementsByTagName('script')[0];
                    s.parentNode.insertBefore(wf, s);
                """),format.raw/*333.17*/("""}"""),format.raw/*333.18*/(""")();
        </script>
    </body>
</html>
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
object rooms extends rooms_Scope0.rooms
              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 11:41:24 PDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/rooms.scala.html
                  HASH: 8df4e65719db57234303a7c8f2253a22f51db957
                  MATRIX: 738->1|834->3|864->7|1004->121|1018->127|1083->172|1169->232|1183->238|1245->280|1332->340|1347->346|1409->387|1496->447|1511->453|1574->495|1661->555|1676->561|1734->598|1821->658|1836->664|1897->704|1984->764|1999->770|2069->818|2431->1153|2446->1159|2498->1190|2600->1265|2615->1271|2663->1298|2765->1373|2780->1379|2835->1413|3142->1693|3157->1699|3212->1733|3367->1860|3396->1861|3456->1893|3485->1894|3514->1896|3633->1988|3648->1994|3707->2032|3794->2092|3809->2098|3870->2138|4087->2328|4102->2334|4157->2367|4477->2660|4492->2666|4542->2695|9648->7772|9665->7778|9715->7805|11318->9379|11335->9385|11385->9412|13035->11033|13052->11039|13102->11066|14720->12655|14737->12661|14787->12688|17575->15447|17592->15453|17642->15480|19217->17026|19234->17032|19284->17059|20922->18668|20939->18674|20989->18701|22595->20278|22612->20284|22662->20311|25448->23068|25465->23074|25515->23101|27076->24633|27093->24639|27143->24666|28755->26249|28772->26255|28822->26282|30407->27838|30424->27844|30474->27871|37883->35251|37900->35257|37950->35284|38166->35471|38183->35477|38233->35504|38449->35691|38466->35697|38517->35724|38734->35911|38752->35917|38803->35944|39896->37008|39926->37009|39977->37031|40014->37039|40044->37040|40074->37041|40130->37068|40160->37069|40207->37087|40237->37088|40297->37119|40327->37120|40378->37142|40839->37574|40869->37575
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|40->9|40->9|40->9|42->11|42->11|42->11|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|65->34|65->34|65->34|69->38|69->38|69->38|69->38|70->39|73->42|73->42|73->42|75->44|75->44|75->44|81->50|81->50|81->50|87->56|87->56|87->56|153->122|153->122|153->122|163->132|163->132|163->132|173->142|173->142|173->142|183->152|183->152|183->152|205->174|205->174|205->174|215->184|215->184|215->184|225->194|225->194|225->194|235->204|235->204|235->204|257->226|257->226|257->226|267->236|267->236|267->236|277->246|277->246|277->246|287->256|287->256|287->256|334->303|334->303|334->303|334->303|334->303|334->303|334->303|334->303|334->303|334->303|334->303|334->303|354->323|354->323|355->324|355->324|355->324|355->324|355->324|355->324|356->325|356->325|357->326|357->326|358->327|364->333|364->333
                  -- GENERATED --
              */
          