
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
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <script type="text/javascript" src=""""),_display_(/*10.46*/routes/*10.52*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*10.97*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*12.46*/routes/*12.52*/.Assets.at("javascripts/jquery-ui.min.js")),format.raw/*12.94*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*14.46*/routes/*14.52*/.Assets.at("javascripts/tt_slideshow.js")),format.raw/*14.93*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*16.46*/routes/*16.52*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*16.94*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*18.46*/routes/*18.52*/.Assets.at("javascripts/Customjs.js")),format.raw/*18.89*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*20.46*/routes/*20.52*/.Assets.at("javascripts/contactform.js")),format.raw/*20.92*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*22.46*/routes/*22.52*/.Assets.at("javascripts/angular/angular.min.js")),format.raw/*22.100*/("""">
</script>
        <script type="text/javascript" src=""""),_display_(/*24.46*/routes/*24.52*/.Assets.at("javascripts/customJs/app.js")),format.raw/*24.93*/("""">
</script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Add the site description here" />
        <meta  name="keywords" content="First keyword, second keyword," />
        <title>
Hotel Leisure
        </title>
        <link rel="stylesheet"  href=""""),_display_(/*32.40*/routes/*32.46*/.Assets.at("css/bootstrap.css")),format.raw/*32.77*/("""" type="text/css" media="screen"/>
        <link rel="stylesheet"  href=""""),_display_(/*33.40*/routes/*33.46*/.Assets.at("css/style.css")),format.raw/*33.73*/("""" type="text/css" media="screen"/>
            <!--[if lte IE 8]>
<link rel="stylesheet"  href="menuie.css" type="text/css" media="screen"/>
<link rel="stylesheet"  href="vmenuie.css" type="text/css" media="screen"/>
<![endif]-->
        <script type="text/javascript" src=""""),_display_(/*38.46*/routes/*38.52*/.Assets.at("javascripts/totop.js")),format.raw/*38.86*/("""">
</script>
            <!--[if IE 7]>
<style type="text/css" media="screen">
#ttr_vmenu_items  li.ttr_vmenu_items_parent """),format.raw/*42.45*/("""{"""),format.raw/*42.46*/("""margin-left:-16px;font-size:0px;"""),format.raw/*42.78*/("""}"""),format.raw/*42.79*/("""
"""),format.raw/*43.1*/("""</style>
<![endif]-->
            <!--[if lt IE 9]>
<script type="text/javascript" src='"""),_display_(/*46.38*/routes/*46.44*/.Assets.at("javascripts/html5shiv.js")),format.raw/*46.82*/("""'>
</script>
<script type="text/javascript" src='"""),_display_(/*48.38*/routes/*48.44*/.Assets.at("javascripts/respond.min.js")),format.raw/*48.84*/("""'>
</script>
<![endif]-->
    </head>
    <body class="Home">
        <div class="totopshow">
            <a href="#" class="back-to-top"><img alt="Back to Top" src=""""),_display_(/*54.74*/routes/*54.80*/.Assets.at("images/gototop0.png")),format.raw/*54.113*/(""""/></a>
        </div>
        <div id="ttr_page" class="container">
            <header id="ttr_header">
                <div id="ttr_header_inner">
                    <a href="http://www.templatetoaster.com" target="_self">
                        <img  class="ttr_header_logo" src=""""),_display_(/*60.61*/routes/*60.67*/.Assets.at("images/logo.png")),format.raw/*60.96*/("""" >
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
                                <li class="ttr_menu_items_parent dropdown active"><a href="/" class="ttr_menu_items_parent_link_active"><span class="menuchildicon"></span>Home</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                                <li class="ttr_menu_items_parent dropdown"><a href="/about" class="ttr_menu_items_parent_link"><span class="menuchildicon"></span>About</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                                <li class="ttr_menu_items_parent dropdown"><a href="/rooms" class="ttr_menu_items_parent_link"><span class="menuchildicon"></span>Rooms</a>
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
      """),_display_(/*108.8*/if(title.equalsIgnoreCase("Login") || title.equalsIgnoreCase("Registration"))/*108.85*/ {_display_(Seq[Any](format.raw/*108.87*/("""
            """),_display_(/*109.14*/content),format.raw/*109.21*/("""
        """)))}/*110.10*/else/*110.14*/{_display_(Seq[Any](format.raw/*110.15*/("""
            """),format.raw/*111.13*/("""<div class="ttr_banner_slideshow">
</div>
            <div class="ttr_slideshow">
                <div id="ttr_slideshow_inner">
                    <ul>
                        <li id="Slide0" class="ttr_slide" style="background-image: url('"""),_display_(/*116.90*/routes/*116.96*/.Assets.at("images/HomeDesktopSlide0.jpg")),format.raw/*116.138*/("""')" data-slideEffect="Fade">
                            <a href="http://www.example.com"></a>
                            <div class="ttr_slideshow_last">
</div>
                        </li>
                        <li id="Slide1" class="ttr_slide" style="background-image: url('"""),_display_(/*121.90*/routes/*121.96*/.Assets.at("images/HomeDesktopSlide1.jpg")),format.raw/*121.138*/("""')" data-slideEffect="Fade">
                            <a href="http://www.example.com"></a>
                            <div class="ttr_slideshow_last">
</div>
                        </li>
                        <li id="Slide2" class="ttr_slide" style="background-image: url('"""),_display_(/*126.90*/routes/*126.96*/.Assets.at("images/HomeDesktopSlide2.jpg")),format.raw/*126.138*/("""')" data-slideEffect="RadialBlur">
                            <a href="http://templatetoaster.com/"></a>
                            <div class="ttr_slideshow_last">
</div>
                        </li>
                    </ul>
                </div>
                <div class="ttr_slideshow_in">
                    <div class="ttr_slideshow_last">
                        <div class="left-button">
</div>
                        <div id="nav"></div>
                        <div class="right-button">
</div>
                    </div>
                </div>
            </div>
            <div class="ttr_banner_slideshow">
</div>
            <div id="ttr_content_and_sidebar_container">
                <div id="ttr_content">
                    <div id="ttr_content_margin"class="container-fluid">
                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        <div class="ttr_Home_html_row0 row">
                            <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="ttr_Home_html_column00">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Droid Serif','Droid Serif';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">OUR SPECIAL OFFER AND SERVICES</span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column01">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 1.79em 0em;"><span><img class="ttr_uniform" src=""""),_display_(/*163.248*/routes/*163.254*/.Assets.at("images/31.png")),format.raw/*163.281*/("""" style="max-width:70px;max-height:62px;" /></span></span><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">SPECIAL</span></p><p style="margin:0.36em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">PROMOTION</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Cum sociis natoque penatibus et magnis dis part urient montes, nascetur ridiculus mus. Vestib ulum id ligula porta felis euis. Donec sed odio dui. Maecenas faucibus mollis interdum aenean rutrum.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span> </span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column02">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 1.79em 0em;"><span><img class="ttr_uniform" src=""""),_display_(/*173.248*/routes/*173.254*/.Assets.at("images/32.png")),format.raw/*173.281*/("""" style="max-width:70px;max-height:62px;" /></span></span><span style="font-family:'Droid Serif','Droid Serif','Arial';font-size:1.571em;">BED &amp; BREAKFAST</span></p><p style="margin:0.36em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Droid Serif','Arial';font-size:1.571em;">PACKAGE</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Fusce feugiat malesuada odio. orbi nunc odio gravida at cursus nec luctus .Mae cenas tristique orci ac sem. Duis ultricies pharetra magna onec accumsan. male suada Duis diam eros</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column03">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 1.79em 0em;"><span><img class="ttr_uniform" src=""""),_display_(/*183.248*/routes/*183.254*/.Assets.at("images/33.png")),format.raw/*183.281*/("""" style="max-width:70px;max-height:62px;" /></span></span><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">HOTEL</span></p><p style="margin:0.36em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">RESTAURANT</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium inventore&nbsp;&nbsp;inventore dolo rem que laudantium, totam rem aper iam, eaque ipsa quae ab illo inventore veritat is beatae vitae.</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span> </span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column04">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 1.79em 0em;"><span><img class="ttr_uniform" src=""""),_display_(/*193.248*/routes/*193.254*/.Assets.at("images/34.png")),format.raw/*193.281*/("""" style="max-width:70px;max-height:62px;" /></span></span><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">SIGN UP FOR</span></p><p style="margin:0.36em 0.36em 0.36em 0.36em;text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">OUR GUESTBOOK</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">pellentesque eu,pretium quis, sem. Nulla consequat massa quis enim.Donec pede justo,fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut , imperdiet a, venenatis vitae</span></p><p style="margin:0.71em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span><span><a HREF="#" target="_self" class="btn btn-md btn-default">READ MORE</a></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
</div>
                        </div>
                        <div class="ttr_Home_html_row1 row">
                            <div class="post_column col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="ttr_Home_html_column10">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="margin:0em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Droid Serif','Times New Roman';font-size:2.286em;color:rgba(142,91,34,1);">FAMILY</span></p><p style="margin:0.36em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Droid Serif','Times New Roman';font-size:2.286em;color:rgba(142,91,34,1);">PACKAGES</span></p><p style="margin:0.71em 0em 0em 0em;"><span style="font-family:'Roboto','Arial';font-size:1.571em;">from $85</span></p><p style="margin:2.86em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Droid Serif','Times New Roman';font-size:2.286em;color:rgba(142,91,34,1);">BUSINESS</span></p><p style="margin:0.36em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Droid Serif','Times New Roman';font-size:2.286em;color:rgba(142,91,34,1);">PACKAGES</span></p><p style="margin:0.71em 0em 0em 0em;"><span style="font-family:'Roboto','Arial';font-size:1.571em;">from $120</span></p><p style="margin:2.86em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Droid Serif','Times New Roman';font-size:2.286em;color:rgba(142,91,34,1);">JUST MARRIED</span></p><p style="margin:0.36em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Droid Serif','Times New Roman';font-size:2.286em;color:rgba(142,91,34,1);">PACKAGES</span></p><p style="margin:0.71em 0em 0em 0em;"><span style="font-family:'Roboto','Arial';font-size:1.571em;">from $250</span></p><p style="margin:0em 0em 0em 1.43em;">&nbsp;</p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
</div>
                            <div class="post_column col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                <div class="ttr_Home_html_column11">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img class="ttr_uniform" src=""""),_display_(/*215.245*/routes/*215.251*/.Assets.at("images/35.jpg")),format.raw/*215.278*/("""" style="max-width:650px;max-height:432px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
</div>
                        </div>
                        <div class="ttr_Home_html_row2 row">
                            <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="ttr_Home_html_column20">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Times New Roman';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">HOTEL LEISURE ROOM</span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column21">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src=""""),_display_(/*237.225*/routes/*237.231*/.Assets.at("images/36.jpg")),format.raw/*237.258*/("""" class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column22">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src=""""),_display_(/*247.225*/routes/*247.231*/.Assets.at("images/37.jpg")),format.raw/*247.258*/("""" class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column23">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src=""""),_display_(/*257.225*/routes/*257.231*/.Assets.at("images/38.jpg")),format.raw/*257.258*/("""" class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column24">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src=""""),_display_(/*267.225*/routes/*267.231*/.Assets.at("images/39.jpg")),format.raw/*267.258*/("""" class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column25">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src=""""),_display_(/*277.225*/routes/*277.231*/.Assets.at("images/40.jpg")),format.raw/*277.258*/("""" class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column26">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src=""""),_display_(/*287.225*/routes/*287.231*/.Assets.at("images/41.jpg")),format.raw/*287.258*/("""" class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column27">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src=""""),_display_(/*297.225*/routes/*297.231*/.Assets.at("images/42.jpg")),format.raw/*297.258*/("""" class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
</div>
                            <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                <div class="ttr_Home_html_column28">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src=""""),_display_(/*307.225*/routes/*307.231*/.Assets.at("images/43.jpg")),format.raw/*307.258*/("""" class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
</div>
                        </div>
                        <div class="ttr_Home_html_row3 row">
                            <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="ttr_Home_html_column30">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 0em;text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Times New Roman';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">WHAT THEY SAY ABOUT US</span></p><p style="margin:3.57em 0em 0.36em 0em;text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Roboto','Arial';font-size:1.429em;">Staff are always friendly, welcoming and efficient. Rooms are clean, food excellent, gym well equipped. HotelEngine will continue to be my first choice for my next hotel's website. </span></p><p style="margin:1.43em 0.36em 0.36em 0em;text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Roboto';font-size:1.429em;color:rgba(142,91,34,1);">JUSTIN NGUYEN</span></p></div>
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
            """)))}),format.raw/*334.14*/("""
            """),format.raw/*335.13*/("""<footer id="ttr_footer">
                <div class="ttr_footerHome_html_row0 row">
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerHome_html_column00">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;"><br style="font-family:'Arial';" /></p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">QUICK LINKS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="About.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">ABOUT</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Services.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SERVICES</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Events.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EVENTS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Blog.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">BLOG</span></a></p><p style="margin:0.71em 0em 0em 2.86em;"><br style="font-family:'Arial';" /></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-xs-block">
</div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerHome_html_column01">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">ROOMS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">STANDARD ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SUITE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">DELUXE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EXCUTIVE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 2.86em;">&nbsp;</p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
</div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerHome_html_column02">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">CONTACT US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">173A Nguyen Van Troi,</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">Ho Chi Minh City, USA</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">PHONE :-&nbsp;&nbsp;+44 (0) 1334 896578</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">MOBILE :-&nbsp;&nbsp;+44 (0) 1334 869548</span></p><p style="margin:0.36em 0em 0em 2.86em;"><br style="font-family:'Roboto';color:rgba(255,255,255,1);" /></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-xs-block">
</div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerHome_html_column03">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 3.21em;">&nbsp;</p><p style="margin:0em 0em 0em 2.86em;"><span style="font-family:'Droid Serif';font-size:1.429em;color:rgba(255,255,255,1);">&nbsp;&nbsp;</span><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">FOLLOW US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src=""""),_display_(/*367.530*/routes/*367.536*/.Assets.at("images/44.png")),format.raw/*367.563*/("""" class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src=""""),_display_(/*367.750*/routes/*367.756*/.Assets.at("images/45.png")),format.raw/*367.783*/("""" class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src=""""),_display_(/*367.970*/routes/*367.976*/.Assets.at("images/46.png")),format.raw/*367.1003*/("""" class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src=""""),_display_(/*367.1190*/routes/*367.1196*/.Assets.at("images/47.png")),format.raw/*367.1223*/("""" class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span></p></div>
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
Copyright © 2017. All rights reserved.
                            </a>
                        </div>
                    </div>
                </div>
            </footer>
            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-bottom-collapse: separate;"></div>
        </div>
        <script type="text/javascript">
WebFontConfig = """),format.raw/*387.17*/("""{"""),format.raw/*387.18*/("""
    """),format.raw/*388.5*/("""google: """),format.raw/*388.13*/("""{"""),format.raw/*388.14*/(""" """),format.raw/*388.15*/("""families: [ 'Droid+Serif'] """),format.raw/*388.42*/("""}"""),format.raw/*388.43*/("""
"""),format.raw/*389.1*/("""}"""),format.raw/*389.2*/(""";
(function() """),format.raw/*390.13*/("""{"""),format.raw/*390.14*/("""
    """),format.raw/*391.5*/("""var wf = document.createElement('script');
    wf.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://ajax.googleapis.com/ajax/libs/webfont/1.0.31/webfont.js';
    wf.type = 'text/javascript';
    wf.async = 'true';
    var s = document.getElementsByTagName('script')[0];
    s.parentNode.insertBefore(wf, s);
"""),format.raw/*397.1*/("""}"""),format.raw/*397.2*/(""")();
</script>
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
                  DATE: Thu Oct 12 11:41:22 PDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/main.scala.html
                  HASH: e9eb1d0c1ba6bed9d2d02515aaf25a7ce893fbfa
                  MATRIX: 748->1|907->31|937->74|965->76|1106->190|1121->196|1187->241|1274->301|1289->307|1352->349|1439->409|1454->415|1516->456|1603->516|1618->522|1681->564|1768->624|1783->630|1841->667|1928->727|1943->733|2004->773|2091->833|2106->839|2176->887|2263->947|2278->953|2340->994|2702->1329|2717->1335|2769->1366|2871->1441|2886->1447|2934->1474|3241->1754|3256->1760|3311->1794|3466->1921|3495->1922|3555->1954|3584->1955|3613->1957|3732->2049|3747->2055|3806->2093|3885->2145|3900->2151|3961->2191|4161->2364|4176->2370|4231->2403|4551->2696|4566->2702|4616->2731|7674->5762|7761->5839|7802->5841|7845->5856|7874->5863|7905->5874|7919->5878|7959->5879|8002->5893|8278->6141|8294->6147|8359->6189|8674->6476|8690->6482|8755->6524|9070->6811|9086->6817|9151->6859|11760->9439|11777->9445|11827->9472|13616->11232|13633->11238|13683->11265|15506->13059|15523->13065|15573->13092|17375->14865|17392->14871|17442->14898|21623->19050|21640->19056|21690->19083|23816->21180|23833->21186|23883->21213|24875->22176|24892->22182|24942->22209|25968->23206|25985->23212|26035->23239|27027->24202|27044->24208|27094->24235|28137->25249|28154->25255|28204->25282|29196->26245|29213->26251|29263->26278|30289->27275|30306->27281|30356->27308|31348->28271|31365->28277|31415->28304|33972->30829|34015->30843|39887->36686|39904->36692|39954->36719|40170->36906|40187->36912|40237->36939|40453->37126|40470->37132|40521->37159|40738->37346|40756->37352|40807->37379|41832->38375|41862->38376|41896->38382|41933->38390|41963->38391|41993->38392|42049->38419|42079->38420|42109->38422|42138->38423|42182->38438|42212->38439|42246->38445|42610->38781|42639->38782
                  LINES: 27->1|33->1|35->5|36->6|40->10|40->10|40->10|42->12|42->12|42->12|44->14|44->14|44->14|46->16|46->16|46->16|48->18|48->18|48->18|50->20|50->20|50->20|52->22|52->22|52->22|54->24|54->24|54->24|62->32|62->32|62->32|63->33|63->33|63->33|68->38|68->38|68->38|72->42|72->42|72->42|72->42|73->43|76->46|76->46|76->46|78->48|78->48|78->48|84->54|84->54|84->54|90->60|90->60|90->60|138->108|138->108|138->108|139->109|139->109|140->110|140->110|140->110|141->111|146->116|146->116|146->116|151->121|151->121|151->121|156->126|156->126|156->126|193->163|193->163|193->163|203->173|203->173|203->173|213->183|213->183|213->183|223->193|223->193|223->193|245->215|245->215|245->215|267->237|267->237|267->237|277->247|277->247|277->247|287->257|287->257|287->257|297->267|297->267|297->267|307->277|307->277|307->277|317->287|317->287|317->287|327->297|327->297|327->297|337->307|337->307|337->307|364->334|365->335|397->367|397->367|397->367|397->367|397->367|397->367|397->367|397->367|397->367|397->367|397->367|397->367|417->387|417->387|418->388|418->388|418->388|418->388|418->388|418->388|419->389|419->389|420->390|420->390|421->391|427->397|427->397
                  -- GENERATED --
              */
          