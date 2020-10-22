/**
 * @Author:Otosun Tarih :15/10/2020
 */
package Runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions(
        tags = {"@Regression"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // to generate a extend report we need this plugin
        }
)
public class TestRunnerCrossBrowser extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browser")
    public static void beforeClass(String browser) {
        Driver.threadBrowserName.set(browser);
    }

    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/test/java/XMLFiles/ReportSetting.xml");
        Reporter.setSystemInfo("User Name", "Orhan TOSUN");
        Reporter.setSystemInfo("Aplication Name", "Basqar");
        Reporter.setSystemInfo("Operation System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setSystemInfo("Ek satır Adı", "Satır açıklaması");
        Reporter.setTestRunnerOutput("Test execution Cucumber report");

    }
}
