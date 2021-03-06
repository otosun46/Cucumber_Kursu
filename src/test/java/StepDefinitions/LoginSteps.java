/**
 * @Author:Otosun Tarih :01/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button()  {

        DialogContent dialogContent = new DialogContent();

        dialogContent.findElementAndSendKeysFunction("username","daulet2030@gmail.com");
        dialogContent.findElementAndSendKeysFunction("password","TechnoStudy123@");

        dialogContent.findElementAndClickFunction("loginButton");

        if(dialogContent.cookieConsent.isDisplayed()) {
            dialogContent.findElementAndClickFunction("gotItBtn");
         //   System.out.println("gotItBtn butonuna tikladi");
        }

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

    }

}