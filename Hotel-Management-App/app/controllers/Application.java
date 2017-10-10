package controllers;

import play.mvc.*;

import play.twirl.api.Html;
import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Hotel Management System Application"));
    }

}
