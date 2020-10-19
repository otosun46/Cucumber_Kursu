/**
 * @Author:Otosun Tarih :15/10/2020
 */
package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        tags = {"@Regression"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        dryRun = false
)

public class TestRunnerRegression extends AbstractTestNGCucumberTests {
}
