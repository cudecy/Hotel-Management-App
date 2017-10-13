
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mistu/Downloads/htmgmtsys/Hotel-Management-App/Hotel-Management-App/conf/routes
// @DATE:Thu Oct 12 18:31:05 PDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
