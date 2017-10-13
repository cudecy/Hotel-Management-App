
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object services_Scope0 {
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

class services extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <body class="Services">
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
                                <li class="ttr_menu_items_parent dropdown"><a href="/rooms" class="ttr_menu_items_parent_link"><span class="menuchildicon"></span>Rooms</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                                <li class="ttr_menu_items_parent dropdown"><a href="/services" class="ttr_menu_items_parent_link_active"><span class="menuchildicon"></span>Services</a>
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
                        <div class="ttr_Services_html_row0 row">
                            <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="ttr_Services_html_column00">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Times New Roman';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">OUR&nbsp;&nbsp;SERVICES</span></p><p style="margin:1.43em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Droid Serif';">Quisque cursus, sem eget sagittis sagittis, nisl magna sodales eros, ut feugiat velit velit non turpis. Cras eu nibh dapibus justo fringilla bibendum. Donec eget aliquam massa. Etiam ac dui felis, sed eleifend mi. Suspendisse consequat</span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Services_html_column01">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*122.225*/routes/*122.231*/.Assets.at("images/48.png")),format.raw/*122.258*/("""' class="ttr_fill" style="max-width:62px;max-height:62px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">RESTAURANT</span></p><p style="margin:0em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">SERVICES</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Roboto';">Bulum iaculis lacinia est. Proin dictum elemn tum velit sce euismod cons equat ante. Cum sociis natoque penatibus et dis part urient montes, nascetur ridiculus mus. Vestib ulum id ligula </span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Services_html_column02">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*132.225*/routes/*132.231*/.Assets.at("images/49.png")),format.raw/*132.258*/("""' class="ttr_fill" style="max-width:62px;max-height:62px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">RECEPTION</span></p><p style="margin:0em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">SERVICES</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Roboto';">Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium dolo rem que laudantium, totam rem aper iam, eaque ipsa quae ab illo inventore veritatis eatae ornare.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Services_html_column03">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*142.225*/routes/*142.231*/.Assets.at("images/50.png")),format.raw/*142.258*/("""' class="ttr_fill" style="max-width:62px;max-height:62px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">FREE WIFI</span></p><p style="margin:0em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">SERVICES</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Roboto';">Pellentesque eu,pretium quis, sem. Nulla consequat massa quis enim.Donec pede justo,fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut , imperdiet a, venenatis</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Services_html_column04">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*152.225*/routes/*152.231*/.Assets.at("images/51.png")),format.raw/*152.258*/("""' class="ttr_fill" style="max-width:62px;max-height:62px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">FREE WIFI</span></p><p style="margin:0em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">SERVICES</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Roboto';">Pellentesque eu,pretium quis, sem. Nulla consequat massa quis enim.Donec pede justo,fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut , imperdiet a, venenatis</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span> </span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                        </div>
                        <div class="ttr_Services_html_row1 row">
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Services_html_column10">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*164.225*/routes/*164.231*/.Assets.at("images/52.png")),format.raw/*164.258*/("""' class="ttr_fill" style="max-width:62px;max-height:62px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">GYMNASIUM</span></p><p style="margin:0em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;"> SERVICES</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Roboto';">Fusce euismod consequat ante. Lorem ipsum dolor sit amet, consectetuer adi piscing elit. Pellentesque sed dolor. Aliq uam congue fermentum nisl. Nam libero tempore, cum soluta </span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span> </span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Services_html_column11">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*174.225*/routes/*174.231*/.Assets.at("images/53.png")),format.raw/*174.258*/("""' class="ttr_fill" style="max-width:62px;max-height:62px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">SAFE PARKING</span></p><p style="margin:0em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">SERVICES</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Roboto';">Etharum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus Donec sagittis culpa qui officia deserunt</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span> </span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Services_html_column12">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*184.225*/routes/*184.231*/.Assets.at("images/54.png")),format.raw/*184.258*/("""' class="ttr_fill" style="max-width:62px;max-height:62px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">TAXI </span></p><p style="margin:0em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">SERVICES</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Roboto';">deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt. Aliquam congue fermentum nisl.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span> </span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Services_html_column13">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*194.225*/routes/*194.231*/.Assets.at("images/55.png")),format.raw/*194.258*/("""' class="ttr_fill" style="max-width:62px;max-height:62px;" /></span></span><br style="font-family:'Droid Serif';font-size:1.571em;" /></p><p style="text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">LUGGAGE</span></p><p style="margin:0em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">SERVICES</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Roboto';">Cras porttitor blandit bibendum. Praesent sit amet laoreet nibh. Mauris turpis diam, fringilla maximus ullamcorper Donec eget aliquam massa. Donec eget aliquam massa. Etiam ac dui.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span> </span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                        </div>
                        <div class="ttr_Services_html_row2 row">
                            <div class="post_column col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="ttr_Services_html_column20">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 0em;line-height:1.83098591549296;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;color:rgba(142,91,34,1);">BUSINESS CONVENIENCE</span></p><ul style="list-style:disc;"><li><p><span style="font-family:'Roboto','Arial';">Complimentary Printing Service</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Express Mail</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Fax &amp; Landline Phone</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Meeting Rooms</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Notary Public</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Office Rental</span></p></li></ul></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="ttr_Services_html_column21">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 0em;line-height:1.83098591549296;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;color:rgba(142,91,34,1);">FOR YOUR COMFORT</span></p><ul style="list-style:disc;"><li><p><span style="font-family:'Roboto','Arial';">Bar Area</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Foreign Currency Exchange</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Gift Shop</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Multi-Lingual Staff</span></p></li><li><p><span style="font-family:'Roboto','Arial';">News Stand</span></p></li><li><p><span style="font-family:'Roboto','Arial';">Safety Deposit Box</span></p></li></ul></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="ttr_Services_html_column22">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 0em;line-height:1.83098591549296;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;color:rgba(142,91,34,1);">FOR YOUR FITNESS &amp; RECREATION</span></p><ul style="list-style:disc;"><li><p style="margin:0.36em 0.36em 0.36em 0.36em;"><span style="font-family:'Roboto','Arial';">Basketball</span></p></li><li><p style="margin:0.36em 0.36em 0.36em 0.36em;"><span style="font-family:'Roboto','Arial';">Sight Seeing Tours</span></p></li><li><p style="margin:0.36em 0.36em 0.36em 0.36em;"><span style="font-family:'Roboto','Arial';">Pool</span></p></li><li><p style="margin:0.36em 0.36em 0.36em 0.36em;"><span style="font-family:'Roboto','Arial';">Beach</span></p></li><li><p style="margin:0.36em 0.36em 0.36em 0.36em;"><span style="font-family:'Roboto','Arial';">Fitness Room</span></p></li><li><p style="margin:0.36em 0.36em 0.36em 0.36em;"><span style="font-family:'Roboto','Arial';">Snorkeling</span></p></li></ul></div>
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
                <div class="ttr_footerServices_html_row0 row">
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerServices_html_column00">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;"><br style="font-family:'Arial';" /></p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">QUICK LINKS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="About.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">ABOUT</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Services.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SERVICES</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Events.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EVENTS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Blog.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">BLOG</span></a></p><p style="margin:0.71em 0em 0em 2.86em;"><br style="font-family:'Arial';" /></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerServices_html_column01">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">ROOMS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">STANDARD ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SUITE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">DELUXE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EXCUTIVE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 2.86em;">&nbsp;</p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerServices_html_column02">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">CONTACT US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">173A Nguyen Van Troi,</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">Ho Chi Minh City, USA</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">PHONE :-&nbsp;&nbsp;+44 (0) 1334 896578</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">MOBILE :-&nbsp;&nbsp;+44 (0) 1334 869548</span></p><p style="margin:0.36em 0em 0em 2.86em;"><br style="font-family:'Roboto';color:rgba(255,255,255,1);" /></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerServices_html_column03">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 3.21em;">&nbsp;</p><p style="margin:0em 0em 0em 2.86em;"><span style="font-family:'Droid Serif';font-size:1.429em;color:rgba(255,255,255,1);">&nbsp;&nbsp;</span><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">FOLLOW US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*273.530*/routes/*273.536*/.Assets.at("images/56.png")),format.raw/*273.563*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*273.750*/routes/*273.756*/.Assets.at("images/57.png")),format.raw/*273.783*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*273.970*/routes/*273.976*/.Assets.at("images/58.png")),format.raw/*273.1003*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*273.1190*/routes/*273.1196*/.Assets.at("images/59.png")),format.raw/*273.1223*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span></p></div>
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
                WebFontConfig = """),format.raw/*293.33*/("""{"""),format.raw/*293.34*/("""
                    """),format.raw/*294.21*/("""google: """),format.raw/*294.29*/("""{"""),format.raw/*294.30*/(""" """),format.raw/*294.31*/("""families: [ 'Droid+Serif'] """),format.raw/*294.58*/("""}"""),format.raw/*294.59*/("""
                """),format.raw/*295.17*/("""}"""),format.raw/*295.18*/(""";
                (function() """),format.raw/*296.29*/("""{"""),format.raw/*296.30*/("""
                    """),format.raw/*297.21*/("""var wf = document.createElement('script');
                    wf.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://ajax.googleapis.com/ajax/libs/webfont/1.0.31/webfont.js';
                    wf.type = 'text/javascript';
                    wf.async = 'true';
                    var s = document.getElementsByTagName('script')[0];
                    s.parentNode.insertBefore(wf, s);
                """),format.raw/*303.17*/("""}"""),format.raw/*303.18*/(""")();
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
object services extends services_Scope0.services
              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 11:41:25 PDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/services.scala.html
                  HASH: fccb34f0dd8681dbd6f9c96cd62cb9d06c457c15
                  MATRIX: 744->1|840->3|870->7|1010->121|1024->127|1089->172|1175->232|1189->238|1251->280|1338->340|1353->346|1415->387|1502->447|1517->453|1580->495|1667->555|1682->561|1740->598|1827->658|1842->664|1903->704|1990->764|2005->770|2075->818|2437->1153|2452->1159|2504->1190|2606->1265|2621->1271|2669->1298|2771->1373|2786->1379|2841->1413|3148->1693|3163->1699|3218->1733|3373->1860|3402->1861|3462->1893|3491->1894|3520->1896|3639->1988|3654->1994|3713->2032|3800->2092|3815->2098|3876->2138|4096->2331|4111->2337|4166->2370|4486->2663|4501->2669|4551->2698|10067->8185|10084->8191|10134->8218|12020->10075|12037->10081|12087->10108|13988->11980|14005->11986|14055->12013|15942->13871|15959->13877|16009->13904|18046->15912|18063->15918|18113->15945|19994->17797|20011->17803|20061->17830|21987->19727|22004->19733|22054->19760|23936->21613|23953->21619|24003->21646|36564->34178|36581->34184|36631->34211|36847->34398|36864->34404|36914->34431|37130->34618|37147->34624|37198->34651|37415->34838|37433->34844|37484->34871|38577->35935|38607->35936|38658->35958|38695->35966|38725->35967|38755->35968|38811->35995|38841->35996|38888->36014|38918->36015|38978->36046|39008->36047|39059->36069|39520->36501|39550->36502
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|40->9|40->9|40->9|42->11|42->11|42->11|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|65->34|65->34|65->34|69->38|69->38|69->38|69->38|70->39|73->42|73->42|73->42|75->44|75->44|75->44|81->50|81->50|81->50|87->56|87->56|87->56|153->122|153->122|153->122|163->132|163->132|163->132|173->142|173->142|173->142|183->152|183->152|183->152|195->164|195->164|195->164|205->174|205->174|205->174|215->184|215->184|215->184|225->194|225->194|225->194|304->273|304->273|304->273|304->273|304->273|304->273|304->273|304->273|304->273|304->273|304->273|304->273|324->293|324->293|325->294|325->294|325->294|325->294|325->294|325->294|326->295|326->295|327->296|327->296|328->297|334->303|334->303
                  -- GENERATED --
              */
          