package controllers;

import forms.AppUserForm;
import models.AppUser;
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
    Form <AppUserForm> appUserForm = Form.form(AppUserForm.class);
      return ok(registration.render());
    }

    public Result save(){
        System.out.println("in method o");
        Form <AppUserForm> appUserForm = Form.form(AppUserForm.class).bindFromRequest();

        if(appUserForm.hasErrors()){
            flash("danger", "Invalid form selection");
//            return badRequest(registration.render(appUserForm));
        }

        AppUserForm data = appUserForm.get();
        AppUser appUser = new AppUser();
        appUser.firstName = data.firstName;
        appUser.lastName = data.lastName;
        appUser.password = data.password;
        appUser.gender = data.gender;
        appUser.mobileNumber = data.mobileNumber;
        appUser.date = data.date;
        System.out.println("first name is: "+appUser.firstName);
        System.out.println("last name is: "+appUser.lastName);
        System.out.println("password is: "+appUser.password);
        System.out.println("gender is: "+appUser.gender);
        System.out.println("mobile number is: "+appUser.mobileNumber);
        System.out.println("date is: "+appUser.date);
        return ok("Mistura ti se oh!!");
    }
}
