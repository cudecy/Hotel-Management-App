package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * Created by Longbridge PC on 8/15/2017.
 */
public class AboutController extends Controller {

    public Result index() {
        return ok(about.render());
    }

}
