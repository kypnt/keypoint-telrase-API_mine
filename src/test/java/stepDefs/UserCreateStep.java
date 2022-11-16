package stepDefs;

import io.cucumber.java.en.Given;
import requests.Create;

public class UserCreateStep {
    @Given("user should be able to be {string}")
    public void user_should_be_able_to_be(String role) {
        Create.userCreate(role);
    }
}
