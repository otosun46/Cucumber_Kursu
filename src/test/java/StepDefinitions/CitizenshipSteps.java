/**
 * @Author:Otosun Tarih :08/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExcelUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

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

    @When("^User create ctizenship with ApachePOI$")
    public void userCreateCtizenshipWithApachePOI() {
        List<List<String>> gelenList= ExcelUtility.getListData("src/main/resources/ApacheExcelUtility.xlsx","Sayfa1",2);
        for (int i=0;i<gelenList.size();i++) {
            dialogContent.findElementAndClickFunction("addButton");
            dialogContent.findElementAndSendKeysFunction("nameInput", gelenList.get(i).get(0));
            dialogContent.findElementAndSendKeysFunction("shortName",  gelenList.get(i).get(1));
            dialogContent.findElementAndClickFunction("saveButton");
            dialogContent.beklet(1500);
        }
    }

    @Then("^Userdelete ctizenship with ApachiPOI$")
    public void userdeleteCtizenshipWithApachiPOI() {
        List<List<String>> gelenList= ExcelUtility.getListData("src/main/resources/ApacheExcelUtility.xlsx","Sayfa1",2);
        for (int i=0;i<gelenList.size();i++) {
            dialogContent.findElementAndSendKeysFunction("searchNameInput", gelenList.get(i).get(0));
            dialogContent.findElementAndClickFunction("searchButton");

            dialogContent.editAndDeleteFunction(gelenList.get(i).get(0), "delete");
            dialogContent.findElementAndClickFunction("yesButton");
            dialogContent.beklet(1500);
        }

    }

}
