package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinition"},tags = "@SmokeTest"
)

public class runner extends AbstractTestNGCucumberTests {

}
