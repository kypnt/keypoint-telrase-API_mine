package stepDefs;

import io.cucumber.java.en.Given;
import requests.Login;

public class LoginStep {
    @Given("user should be able to login with valid credentials")
    public void user_should_be_able_to_login_with_valid_credentials() {
        Login.loginRequest();

    }

}
