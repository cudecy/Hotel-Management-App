package controllers;

import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.*;

/**
 * Created by Longbridge PC on 9/26/2017.
 */
public class UserController extends Controller{

    public Result login() {
        return ok(login.render());
    }

    public Result registration(){
        return ok(registration.render());
    }
}
