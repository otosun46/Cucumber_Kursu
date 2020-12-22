/**
 * @Author:Otosun Tarih :06/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CountrySteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @Then("^Navigate to country page$")
    public void navigate_to_country_page(){
        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("country");
    }

    @When("^Create a country$")
    public void create_a_country() {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput","Sweden13");
        dialogContent.findElementAndSendKeysFunction("codeInput","46");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @Then("^Success message shuld be diplayed$")
    public void success_message_shuld_be_diplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");

    }

    @When("^Create a country name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void create_a_country_name_as_and_code_as(String name, String code){
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput",name);
        dialogContent.findElementAndSendKeysFunction("codeInput",code);
        dialogContent.findElementAndClickFunction("saveButton");
    }


    @And("^Navigate to cities page$")
    public void navigateToCitiesPage() {
        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("cities");
    }
}
