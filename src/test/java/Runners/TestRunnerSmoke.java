/**
 * @Author:Otosun Tarih :15/10/2020
 */
package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java/FeaturesFiles/01_Login.feature","src/test/java/FeaturesFiles/09_Exams.feature"},
        glue = {"StepDefinitions"},
        dryRun = false
)

public class TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
