/**
 * @Author:Otosun Tarih :08/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CitizenshipSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @And("^Navigate to Citizenship page$")
    public void navigateToCitizenshipPage() {
        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("citizenships");
    }

    @When("^User Create a Citizenship name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void userCreateACitizenshipNameAsShortNameAs(String name, String shortName){
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput",name);
        dialogContent.findElementAndSendKeysFunction("shortName",shortName);
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @Then("^Error message shuld be diplayed$")
    public void errorMessageShuldBeDiplayed() {
        dialogContent.findElementAndVerifyContainsText("errorMessage","Error");
//        System.out.println("Error mesajina girdi");
    }

    @And("^Click on close button$")
    public void clickOnCloseButton() {
        dialogContent.findElementAndClickFunction("closeDialog");
    }
}
