package cucumberOption;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
 @CucumberOptions(features="src/test/java/feature", glue="stepDefination" )
 public class TestNgRunner extends AbstractTestNGCucumberTests{
 
}
 