/**
 * @Author:Otosun Tarih :15/10/2020
 */
package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/**
        * Aşağıdaki seçenekde tags eklendi içinde grup adına
        * sahip senaryolar çalıştıralacak sadece tüm senaryolardan
        * tags etiketi sınırlama yaptı sadece bu etikete veya grup adına sahip
        * olanlar çalışacak
        */
@CucumberOptions(
        tags = {"  @SmokeTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        dryRun = false

)

public class TestRunnerBelirliTestler extends AbstractTestNGCucumberTests {
}
