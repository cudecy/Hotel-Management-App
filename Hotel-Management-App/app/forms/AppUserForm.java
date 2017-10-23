package forms;

import play.data.validation.Constraints;

import java.util.Date;

/**
 * Created by mistu on 10/11/2017.
 */
public class AppUserForm  {
    public String firstName;

    public String lastName;

    public String password;

    public String confirmPassword;

    public String gender;

    public Long mobileNumber;

    public Date date;

    public String userName;

    @Constraints.Email
    public String emailAddress;
}
