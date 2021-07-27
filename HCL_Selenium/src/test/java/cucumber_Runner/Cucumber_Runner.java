package cucumber_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(dryRun=false,
                 features="/HCL_Selenium/src/test/java/Cucumber_Features",
                 glue={"cucumber_StepDefs"},
                 monochrome=true)

public class Cucumber_Runner extends AbstractTestNGCucumberTests{

}
