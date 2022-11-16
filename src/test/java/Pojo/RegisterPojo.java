package Pojo;

public class RegisterPojo {
                    //swagger
    //Request URL
//http://54.194.180.243:9001/api/auth/register

    /*
    //Register Request Body
    {
  "confirmPassword": "string",
  "email": "string",
  "firstName": "string",
  "gdpr": true,
  "lastName": "string",
  "linkedIn": "string",
  "password": "string"
    }
     */
private String confirmPassword;
private String email;
private String firstName;
private boolean gdpr;
private String lastName;
private String linkedIn;
private String password;
//Alt+insert to open generate and constructor

    //this constructor for register
    public RegisterPojo(String confirmPassword, String email,
        String firstName, boolean gdpr, String lastName,
        String linkedIn, String password) {
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.firstName = firstName;
        this.gdpr = gdpr;
        this.lastName = lastName;
        this.linkedIn = linkedIn;
        this.password = password;
    }

//Alt+insert to open generate and constructor
    //this constructor for login
    public RegisterPojo(String email, String password) {
        this.email = email;
        this.password = password;
    }
//Alt+insert to open generate and constructor
    //this constructor is user default constructor
    // to reach any field which we want
    public RegisterPojo() {
    }


//Alt+insert to open generate and setter and getter
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean getGdpr() {
        return gdpr;
    }

    public void setGdpr(boolean gdpr) {
        this.gdpr = gdpr;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
