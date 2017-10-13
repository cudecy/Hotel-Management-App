package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

/**
 * Created by mistu on 10/11/2017.
 */
@Entity
public class AppUser extends Model {
    @Constraints.Required
    @GeneratedValue
    public Long id;
    public String firstName;
    public String lastName;
    public String password;
    public String gender;
    public Long mobileNumber;
    public Date date;

}
