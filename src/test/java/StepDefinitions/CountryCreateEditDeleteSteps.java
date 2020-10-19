/**
 * @Author:Otosun Tarih :07/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;

import cucumber.api.java.en.When;

public class CountryCreateEditDeleteSteps {

    DialogContent dialogContent = new DialogContent();
    FormContent formContent=new FormContent();

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_edit_the_to(String searchOfCountryName, String newCountryName) {
        //ulkeyi ara bul ve edite tiklat
        dialogContent.findElementAndSendKeysFunction("searchNameInput", searchOfCountryName);
        dialogContent.findElementAndClickFunction("searchButton");

        dialogContent.editAndDeleteFunction(searchOfCountryName, "edit");

        dialogContent.findElementAndSendKeysFunction("nameInput", newCountryName);
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @When("^User delete the \"([^\"]*)\"$")
    public void user_delete_the(String nameOfCountryToDelete) {

        dialogContent.findElementAndSendKeysFunction("searchNameInput", nameOfCountryToDelete);
        dialogContent.findElementAndClickFunction("searchButton");

        dialogContent.editAndDeleteFunction(nameOfCountryToDelete, "delete");
        dialogContent.findElementAndClickFunction("yesButton");
    }


    @When("^Delete all items of the list$")
    public void deleteAllItemsOfTheList() {
        dialogContent.deleteAllItemsOfList();
    }
}
