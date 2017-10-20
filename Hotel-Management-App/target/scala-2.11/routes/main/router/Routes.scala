
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Longbridge PC/Documents/HOTMGMT/Hotel-Management-App/Hotel-Management-App/conf/routes
// @DATE:Fri Oct 20 16:40:57 WAT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:8
  UserController_0: controllers.UserController,
  // @LINE:13
  ContactController_3: controllers.ContactController,
  // @LINE:18
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:8
    UserController_0: controllers.UserController,
    // @LINE:13
    ContactController_3: controllers.ContactController,
    // @LINE:18
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, UserController_0, ContactController_3, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, UserController_0, ContactController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registration""", """controllers.UserController.registration()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registration/save""", """controllers.UserController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.ContactController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_login1_invoker = createInvoker(
    UserController_0.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "GET",
      """ Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_registration2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registration")))
  )
  private[this] lazy val controllers_UserController_registration2_invoker = createInvoker(
    UserController_0.registration(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registration",
      Nil,
      "GET",
      """Registration""",
      this.prefix + """registration"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_save3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registration/save")))
  )
  private[this] lazy val controllers_UserController_save3_invoker = createInvoker(
    UserController_0.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "save",
      Nil,
      "GET",
      """""",
      this.prefix + """registration/save"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ContactController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_ContactController_index4_invoker = createInvoker(
    ContactController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactController",
      "index",
      Nil,
      "GET",
      """contact""",
      this.prefix + """contact"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index())
      }
  
    // @LINE:8
    case controllers_UserController_login1_route(params) =>
      call { 
        controllers_UserController_login1_invoker.call(UserController_0.login())
      }
  
    // @LINE:10
    case controllers_UserController_registration2_route(params) =>
      call { 
        controllers_UserController_registration2_invoker.call(UserController_0.registration())
      }
  
    // @LINE:11
    case controllers_UserController_save3_route(params) =>
      call { 
        controllers_UserController_save3_invoker.call(UserController_0.save())
      }
  
    // @LINE:13
    case controllers_ContactController_index4_route(params) =>
      call { 
        controllers_ContactController_index4_invoker.call(ContactController_3.index())
      }
  
    // @LINE:18
    case controllers_Assets_at5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_1.at(path, file))
      }
  }
}