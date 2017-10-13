package sharedfunctions

import play.data.Form
import views.html.b3

/** Scala Function for creating breadcrumb html for use with bootstrap
  * Created by Adewale Afolabi on 11/28/14.
  */
object BreadCrumbs {

  /** Generates breadcrumb html for the frontend
    *
    * @param lastItem The last breadcrumb item
    * @param menuItems A map of all the breadcrumb items except the last item
    * @return A <code>Html</code> string representing the breadcrumbs html/css to be used with bootstrap for displaying
    *         breadcrumbs.
    */
  def generate(lastItem: String, menuItems: Map[String, String]): String = {
    var breadCrumb: String = ""
    if (menuItems != null) {
      menuItems.keys.foreach {
        i => breadCrumb += "<li class='active'><a href='" + menuItems(i) + "'>" + i + "</a></li>"
      }
    }
    breadCrumb += "<li class='active'>" + lastItem + "</li>"
    return breadCrumb
  }
}
