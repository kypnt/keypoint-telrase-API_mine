package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={""},
        features={"src/test/resources/Features"},
        glue = {"src/test/java/stepDef"},
        dryRun = false,
        tags = "@register"

)

public class CukesRunner {
}
