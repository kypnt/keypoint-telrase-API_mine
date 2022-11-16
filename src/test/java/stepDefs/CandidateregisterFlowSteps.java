package stepDefs;

import io.cucumber.java.en.Given;
import requests.CandidatePersonalInfo;
import requests.CandidatePositionUpdate;

public class CandidateregisterFlowSteps {

    @Given("user should be able to give personal info")
    public void user_should_be_able_to_give_personal_info() {
        CandidatePersonalInfo.personalInfo();
    }
    @Given("user should be able to update personal positon")
    public void user_should_be_able_to_update_personal_positon() {
        CandidatePositionUpdate.personalInfo();
    }
}
