
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
    <body class="Contact">
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
                                <li class="ttr_menu_items_parent dropdown"><a href="/services" class="ttr_menu_items_parent_link"><span class="menuchildicon"></span>Services</a>
                                    <hr class ="horiz_separator"/>
                                </li>
                                <li class="ttr_menu_items_parent dropdown"><a href="/contact" class="ttr_menu_items_parent_link_active"><span class="menuchildicon"></span>Contact</a>
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
                        <div class="ttr_Contact_html_row0 row">
                            <div class="post_column col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="ttr_Contact_html_column00">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="text-align:Center;line-height:2.11267605633803;"><span style="font-family:'Droid Serif','Droid Serif';font-style:italic;font-size:2.286em;color:rgba(142,91,34,1);text-decoration:underline">CONTACT INFO</span></p><p style="margin:1.43em 0.36em 0.36em 0.36em;text-align:Center;line-height:1.76056338028169;"><span style="font-family:'Roboto';">It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</span></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
                            </div>
                            <div class="post_column col-lg-6 col-md-5 col-sm-5 col-xs-12">
                                <div class="ttr_Contact_html_column01">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="line-height:1.97183098591549;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">ADDRESS</span></p><p style="margin:1.43em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Roboto';">173A Nguyen Van Troi,</span></p><p style="margin:0.36em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Roboto';">Ho Chi Minh City, USA</span></p><p style="margin:1.43em 0em 0em 0em;line-height:1.97183098591549;"><span style="font-family:'Droid Serif','Droid Serif';font-size:1.571em;">CONTACT NUMBER</span></p><p style="margin:1.43em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Roboto';">PHONE :- +44 (0) 1334 896578</span></p><p style="margin:0em 0em 0em 0em;line-height:1.76056338028169;"><span style="font-family:'Roboto';">MOBILE :- +44 (0) 1334 869548</span></p><p><br style="font-family:'Droid Serif';font-size:1.571em;" /></p></div>
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div style="clear:both;"></div>
                                </div>
                            </div>
                            <div class="clearfix visible-xs-block">
                            </div>
                            <div class="post_column col-lg-6 col-md-7 col-sm-7 col-xs-12">
                                <div class="ttr_Contact_html_column02">
                                    <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                                    <div class="html_content"><p style="line-height:1.97183098591549;"><span style="font-family:'Droid Serif','Droid Serif','Droid Serif';font-size:1.571em;">FEEDBACK</span></p><p style="margin:1.43em 0.36em 0.36em 0.36em;"><form id="ContactForm0" class="form-horizontal" role="form" method="post" action="" style="padding:0px 0px 0px 0px;float:left;"><div class="form-group"><label class="col-sm-4 control-label">Name</label><div class="col-sm-8"><input type="text" class="form-control" data-vali="novalidation" /></div></div><div class="form-group"><label class="col-sm-4 control-label required">Email</label><div class="col-sm-8"><input type="text" class="form-control required" data-vali="email" /></div></div><div class="form-group"><label class="col-sm-4 control-label">Message</label><div class="col-sm-8"><textarea class="form-control comment" name="message" rows="4"></textarea></div></div><div class="form-group"><div class="col-sm-4 col-sm-offset-8"><input type="submit" class="pull-right btn btn-md btn-default" rows="4" id="submit" name="submit" value="Send Message" /></div></div><div class="clearfix"></div><div class="success"></div><div class="req_field"></div><div class="clearfix"></div></form></p></div>
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
                <div class="ttr_footerContact_html_row0 row">
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerContact_html_column00">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;"><br style="font-family:'Arial';" /></p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">QUICK LINKS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="About.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">ABOUT</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Services.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SERVICES</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Events.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EVENTS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Blog.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">BLOG</span></a></p><p style="margin:0.71em 0em 0em 2.86em;"><br style="font-family:'Arial';" /></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerContact_html_column01">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">ROOMS</span></p><p style="margin:1.43em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">STANDARD ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">SUITE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">DELUXE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 4.29em;"><a HREF="Rooms.html" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">EXCUTIVE ROOMS</span></a></p><p style="margin:0.71em 0em 0em 2.86em;">&nbsp;</p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-sm-block visible-md-block visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerContact_html_column02">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 1.79em;">&nbsp;</p><p style="margin:0em 0em 0em 3.57em;"><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">CONTACT US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">173A Nguyen Van Troi,</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">Ho Chi Minh City, USA</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">PHONE :-&nbsp;&nbsp;+44 (0) 1334 896578</span></p><p style="margin:0.36em 0em 0em 4.29em;"><span style="font-family:'Arial';font-size:0.857em;color:rgba(255,255,255,1);">MOBILE :-&nbsp;&nbsp;+44 (0) 1334 869548</span></p><p style="margin:0.36em 0em 0em 2.86em;"><br style="font-family:'Roboto';color:rgba(255,255,255,1);" /></p></div>
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                        </div>
                    </div>
                    <div class="clearfix visible-xs-block">
                    </div>
                    <div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="ttr_footerContact_html_column03">
                            <div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
                            <div class="html_content"><p style="margin:0.36em 0.36em 0.36em 3.21em;">&nbsp;</p><p style="margin:0em 0em 0em 2.86em;"><span style="font-family:'Droid Serif';font-size:1.429em;color:rgba(255,255,255,1);">&nbsp;&nbsp;</span><span style="font-family:'Droid Serif','Times New Roman';font-size:1.429em;color:rgba(255,255,255,1);">FOLLOW US</span></p><p style="margin:1.43em 0em 0em 4.29em;"><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*179.530*/routes/*179.536*/.Assets.at("images/76.png")),format.raw/*179.563*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*179.750*/routes/*179.756*/.Assets.at("images/77.png")),format.raw/*179.783*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*179.970*/routes/*179.976*/.Assets.at("images/78.png")),format.raw/*179.1003*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span><span class="ttr_image" style="float:Left;overflow:hidden;margin:0.36em 0.36em 0.36em 0.36em;"><span><img src='"""),_display_(/*179.1190*/routes/*179.1196*/.Assets.at("images/79.png")),format.raw/*179.1223*/("""' class="ttr_fill" style="max-width:32px;max-height:32px;" /></span></span></p></div>
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
                WebFontConfig = """),format.raw/*199.33*/("""{"""),format.raw/*199.34*/("""
                    """),format.raw/*200.21*/("""google: """),format.raw/*200.29*/("""{"""),format.raw/*200.30*/(""" """),format.raw/*200.31*/("""families: [ 'Droid+Serif'] """),format.raw/*200.58*/("""}"""),format.raw/*200.59*/("""
                """),format.raw/*201.17*/("""}"""),format.raw/*201.18*/(""";
                (function() """),format.raw/*202.29*/("""{"""),format.raw/*202.30*/("""
                    """),format.raw/*203.21*/("""var wf = document.createElement('script');
                    wf.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://ajax.googleapis.com/ajax/libs/webfont/1.0.31/webfont.js';
                    wf.type = 'text/javascript';
                    wf.async = 'true';
                    var s = document.getElementsByTagName('script')[0];
                    s.parentNode.insertBefore(wf, s);
                """),format.raw/*209.17*/("""}"""),format.raw/*209.18*/(""")();
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
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 11:41:20 PDT 2017
                  SOURCE: C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/app/views/contact.scala.html
                  HASH: bdf4e773b0675c5605a7f78eca380d765ebfefb7
                  MATRIX: 742->1|838->3|868->7|1008->121|1022->127|1087->172|1173->232|1187->238|1249->280|1336->340|1351->346|1413->387|1500->447|1515->453|1578->495|1665->555|1680->561|1738->598|1825->658|1840->664|1901->704|1988->764|2003->770|2073->818|2435->1153|2450->1159|2502->1190|2604->1265|2619->1271|2667->1298|2769->1373|2784->1379|2839->1413|3146->1693|3161->1699|3216->1733|3371->1860|3400->1861|3460->1893|3489->1894|3518->1896|3637->1988|3652->1994|3711->2032|3798->2092|3813->2098|3874->2138|4093->2330|4108->2336|4163->2369|4483->2662|4498->2668|4548->2697|19550->17670|19567->17676|19617->17703|19833->17890|19850->17896|19900->17923|20116->18110|20133->18116|20184->18143|20401->18330|20419->18336|20470->18363|21563->19427|21593->19428|21644->19450|21681->19458|21711->19459|21741->19460|21797->19487|21827->19488|21874->19506|21904->19507|21964->19538|21994->19539|22045->19561|22506->19993|22536->19994
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|40->9|40->9|40->9|42->11|42->11|42->11|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|65->34|65->34|65->34|69->38|69->38|69->38|69->38|70->39|73->42|73->42|73->42|75->44|75->44|75->44|81->50|81->50|81->50|87->56|87->56|87->56|210->179|210->179|210->179|210->179|210->179|210->179|210->179|210->179|210->179|210->179|210->179|210->179|230->199|230->199|231->200|231->200|231->200|231->200|231->200|231->200|232->201|232->201|233->202|233->202|234->203|240->209|240->209
                  -- GENERATED --
              */
          