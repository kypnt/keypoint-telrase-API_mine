package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Node;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.reset;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){

        if (scenario.getSourceTagNames().contains("@service9001")){
            baseURI = ConfigurationReader.get("baseURL1");
        }
        else{
            baseURI = ConfigurationReader.get("baseURL2");
        }
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getUri());// Returns: the uri of the Scenario.
        System.out.println(scenario.getLine());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");

    }
    @After
    public void teardown(){
        reset();
        System.out.println("AFTER");
    }
}
