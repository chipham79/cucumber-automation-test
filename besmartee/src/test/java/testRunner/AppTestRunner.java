package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        monochrome = true,
        tags = "@msg") 
public class AppTestRunner  extends AbstractTestNGCucumberTests {

}