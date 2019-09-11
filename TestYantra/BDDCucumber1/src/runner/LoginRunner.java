package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/featurefile"},glue= {"stepdefinition"},tags = {"@SmokeTest"},plugin = {"pretty","html:target/cucumber-reports"},monochrome = true)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
