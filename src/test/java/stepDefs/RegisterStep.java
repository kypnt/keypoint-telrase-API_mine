package stepDefs;

import io.cucumber.java.en.*;
import requests.Register;


public class RegisterStep {


    @Given("Sending request with valid information")
    public void sending_request_with_valid_information() {

        Register.registerRequest();
    }

    @Then("Response body should be taken and status code should be {int}")
    public void response_body_should_be_taken_and_status_code_should_be(Integer int1) {
        Register.verifyRegistration(int1);
    }
}
