
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <body class="About">
            <div class="totopshow">
                <a href="#" class="back-to-top"><img alt="Back to Top" src='"""),_display_(/*50.78*/routes/*50.84*/.Assets.at("images/gototop0.png")),format.raw/*50.117*/("""'/></a>
            </div>
            <header id="ttr_header">
                <div id="ttr_header_inner">
                    <a href="http://www.templatetoaster.com" target="_self">
                        <img  class="ttr_header_logo" src='"""),_display_(/*55.61*/routes/*55.67*/.Assets.at("images/logo.png")),format.raw/*55.96*/("""' >
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
                                <li class="ttr_menu_items_parent dropdown"><a href="/about" class="ttr_menu_items_parent_link_active"><span class="menuchildicon"></span>About</a>
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
            <div id="ttr_page" class="container">
                <div id="ttr_content_and_sidebar_container">
                    <div id="ttr_content">
                        <div id="ttr_content_margin"class="container-fluid">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="ttr_About_html_row0 row">
                                <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <div class="ttr_About_html_column00">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Times New Roman';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">A FEW WORDS ABOUT US</span></p><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:1.43em 0em 1.43em 0em;"><span style="margin:0em 0em 0.36em 0em;"><img class="ttr_uniform" src='"""),_display_(/*112.524*/routes/*112.530*/.Assets.at("images/80.jpg")),format.raw/*112.557*/("""' style="max-width:900px;max-height:325px;" /></span></span></p><p style="text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto','Arial';">Autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vuismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie cou feugiat nulla. Praesent vestibulum molestie lacusenean nonummy unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam remune aperiamen.Hendreritum mauris. Phasellus porta. Fusce suscipit varius mi. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. </span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                                </div>
                            </div>
                            <div class="ttr_About_html_row1 row">
                                <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <div class="ttr_About_html_column10">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Times New Roman';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">OUR ADVANTAGES</span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                                </div>
                                <div class="post_column col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                    <div class="ttr_About_html_column11">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">ALIQUAM VOLUTNA ERATFU</span></p><p style="margin:1.43em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Lorem ipsum dolor sit, consectetuer adipiscing elit. Prat vtibu molestie lacus Aenean nonummy hendrerit maura sellus port. magnis dis parturient montes, nascetur ridiculus musulla dui. Fusce feugiat mesuada odio. Morbi nunc odio, gravida at, cursus maecenas tristique oi ac sem.</span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-xs-block">
                                </div>
                                <div class="post_column col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                    <div class="ttr_About_html_column12">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">QUISQUE TELLUS NISVIRRA</span></p><p style="margin:1.43em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Duis ultricies pharetra magna. Donec accumsan males uada orci. Donec sit amet eros. Lorem ipsum dolor sit amet, conse ctetuer adipiscing elit. Mauris fermentum dictum magna. Sed laoreet aliquam leo. Ut tellus dolor, dapibus eget, element cursus eleifend, elit. Aenean auctor wisi et.</span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-xs-block">
                                </div>
                                <div class="post_column col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                    <div class="ttr_About_html_column13">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.571em;">NAM SOLLICITU NEQUE</span></p><p style="margin:1.43em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.54929577464789;"><span style="font-family:'Roboto','Arial';">Curabitur facilisis pellentesque pharetra. Donec justo urna, malesuada a viverra ac, pellentesque vitae nunc. Aenean ac leo eget nunc fringilla a non nulla! Nunc orci mi, venenatis quis ultrices vitae, congue non nibh. Nulla bibendum. bibendum, justo eget ultrices </span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                                </div>
                            </div>
                            <div class="ttr_About_html_row2 row">
                                <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <div class="ttr_About_html_column20">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Droid Serif','Droid Serif';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">HOTEL LEISURE ROOMS</span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                                </div>
                                <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                    <div class="ttr_About_html_column21">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*176.229*/routes/*176.235*/.Assets.at("images/81.jpg")),format.raw/*176.262*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-xs-block">
                                </div>
                                <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                    <div class="ttr_About_html_column22">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*186.229*/routes/*186.235*/.Assets.at("images/82.jpg")),format.raw/*186.262*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                                </div>
                                <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                    <div class="ttr_About_html_column23">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*196.229*/routes/*196.235*/.Assets.at("images/83.jpg")),format.raw/*196.262*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-xs-block">
                                </div>
                                <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                    <div class="ttr_About_html_column24">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*206.229*/routes/*206.235*/.Assets.at("images/84.jpg")),format.raw/*206.262*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                                </div>
                                <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                    <div class="ttr_About_html_column25">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*216.229*/routes/*216.235*/.Assets.at("images/85.jpg")),format.raw/*216.262*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-xs-block">
                                </div>
                                <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                    <div class="ttr_About_html_column26">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*226.229*/routes/*226.235*/.Assets.at("images/86.jpg")),format.raw/*226.262*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                                </div>
                                <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                    <div class="ttr_About_html_column27">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*236.229*/routes/*236.235*/.Assets.at("images/87.jpg")),format.raw/*236.262*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div style="clear:both;"></div>
                                    </div>
                                </div>
                                <div class="clearfix visible-xs-block">
                                </div>
                                <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                                    <div class="ttr_About_html_column28">
                                        <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                        <div class="html_content"><p style="text-align:Center;"><span class="ttr_image" style="float:none;display:block;text-align:center;overflow:hidden;margin:0em 0em 0em 0em;"><span><img src='"""),_display_(/*246.229*/routes/*246.235*/.Assets.at("images/88.jpg")),format.raw/*246.262*/("""' class="ttr_fill" style="max-width:300px;max-height:192px;" /></span></span></p></div>
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
                    <div class="ttr_footerAbout_html_row0 row">
                        <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                            <div class="ttr_footerAbout_html_column00">
                                <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;"><br style="font-family:'Arial';" /></p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">QUICK LINKS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="About.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">ABOUT</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Services.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SERVICES</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Events.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EVENTS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Blog.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">BLOG</span></a></p><p style="margin:0.71em 0em 0em 2.86em;"><br style="font-family:'Arial';" /></p></div>
                                <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            </div>
                        </div>
                        <div class="clearfix visible-xs-block">
                        </div>
                        <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                            <div class="ttr_footerAbout_html_column01">
                                <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">ROOMS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">STANDARD ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SUITE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">DELUXE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EXCUTIVE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 2.86em;">&nbsp;</p></div>
                                <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            </div>
                        </div>
                        <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                        </div>
                        <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                            <div class="ttr_footerAbout_html_column02">
                                <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">CONTACT US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">173A Nguyen Van Troi,</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">Ho Chi Minh City, USA</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">PHONE :-&nbsp;&nbsp;+44 (0) 1334 896578</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">MOBILE :-&nbsp;&nbsp;+44 (0) 1334 869548</span></p><p style="margin:0.36em 0em 0em 2.86em;"><br style="font-family:'Roboto';color:rgba(255,255,255,1);" /></p></div>
                                <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            </div>
                        </div>
                        <div class="clearfix visible-xs-block">
                        </div>
                        <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                            <div class="ttr_footerAbout_html_column03">
                                <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 3.21em;">&nbsp;</p><p style="margin:0em 0em 0em 2.86em;"><span style="font-family:'Droid Serif';font-size:1.429em;color:rgba(255,255,255,1);">&nbsp;&nbsp;</span><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">FOLLOW US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*293.534*/routes/*293.540*/.Assets.at("images/89.png")),format.raw/*293.567*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*293.754*/routes/*293.760*/.Assets.at("images/90.png")),format.raw/*293.787*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*293.974*/routes/*293.980*/.Assets.at("images/91.png")),format.raw/*293.1007*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*293.1194*/routes/*293.1200*/.Assets.at("images/92.png")),format.raw/*293.1227*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span></p></div>
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
                    WebFontConfig = """),format.raw/*313.37*/("""{"""),format.raw/*313.38*/("""
                        """),format.raw/*314.25*/("""google: """),format.raw/*314.33*/("""{"""),format.raw/*314.34*/(""" """),format.raw/*314.35*/("""families: [ 'Droid+Serif'] """),format.raw/*314.62*/("""}"""),format.raw/*314.63*/("""
                    """),format.raw/*315.21*/("""}"""),format.raw/*315.22*/(""";
                    (function() """),format.raw/*316.33*/("""{"""),format.raw/*316.34*/("""
                        """),format.raw/*317.25*/("""var wf = document.createElement('script');
                        wf.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://ajax.googleapis.com/ajax/libs/webfont/1.0.31/webfont.js';
                        wf.type = 'text/javascript';
                        wf.async = 'true';
                        var s = document.getElementsByTagName('script')[0];
                        s.parentNode.insertBefore(wf, s);
                    """),format.raw/*323.21*/("""}"""),format.raw/*323.22*/(""")();
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
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 11:41:18 PDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/about.scala.html
                  HASH: 022f8176529b7f4f1738ae199e95702746701373
                  MATRIX: 738->1|834->3|864->7|1004->121|1018->127|1083->172|1169->232|1183->238|1245->280|1332->340|1347->346|1409->387|1496->447|1511->453|1574->495|1661->555|1676->561|1734->598|1821->658|1836->664|1897->704|1984->764|1999->770|2069->818|2431->1153|2446->1159|2498->1190|2600->1265|2615->1271|2663->1298|2765->1373|2780->1379|2835->1413|3142->1693|3157->1699|3212->1733|3367->1860|3396->1861|3456->1893|3485->1894|3514->1896|3633->1988|3648->1994|3707->2032|3794->2092|3809->2098|3870->2138|4099->2340|4114->2346|4169->2379|4446->2629|4461->2635|4511->2664|8973->7097|8990->7103|9040->7130|17422->15483|17439->15489|17489->15516|18550->16548|18567->16554|18617->16581|19712->17647|19729->17653|19779->17680|20840->18712|20857->18718|20907->18745|22019->19828|22036->19834|22086->19861|23147->20893|23164->20899|23214->20926|24309->21992|24326->21998|24376->22025|25437->23057|25454->23063|25504->23090|32526->30083|32543->30089|32593->30116|32809->30303|32826->30309|32876->30336|33092->30523|33109->30529|33160->30556|33377->30743|33395->30749|33446->30776|34619->31920|34649->31921|34704->31947|34741->31955|34771->31956|34801->31957|34857->31984|34887->31985|34938->32007|34968->32008|35032->32043|35062->32044|35117->32070|35602->32526|35632->32527
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|40->9|40->9|40->9|42->11|42->11|42->11|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|65->34|65->34|65->34|69->38|69->38|69->38|69->38|70->39|73->42|73->42|73->42|75->44|75->44|75->44|81->50|81->50|81->50|86->55|86->55|86->55|143->112|143->112|143->112|207->176|207->176|207->176|217->186|217->186|217->186|227->196|227->196|227->196|237->206|237->206|237->206|247->216|247->216|247->216|257->226|257->226|257->226|267->236|267->236|267->236|277->246|277->246|277->246|324->293|324->293|324->293|324->293|324->293|324->293|324->293|324->293|324->293|324->293|324->293|324->293|344->313|344->313|345->314|345->314|345->314|345->314|345->314|345->314|346->315|346->315|347->316|347->316|348->317|354->323|354->323
                  -- GENERATED --
              */
          