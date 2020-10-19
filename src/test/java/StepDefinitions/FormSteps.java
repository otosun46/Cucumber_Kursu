/**
 * @Author:Otosun Tarih :17/10/2020
 */
package StepDefinitions;

import Pages.FormContent;
import Pages.StudentFormContent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class FormSteps {
    FormContent formContent = new FormContent();
    StudentFormContent studentFormContent=new StudentFormContent();

    @Then("^Click on the element in the form class$")
    public void clickOnTheElementInTheFormClass(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            studentFormContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^User sending the keys in the form class$")
    public void userSendingTheKeysInTheFormClass(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        System.out.println("List size= "+elementsNameAndValue.size());

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            System.out.println(elementsNameAndValue.get(i).get(0)); // elemanın adı
            System.out.println(elementsNameAndValue.get(i).get(1)); // elemanın gönderilecek değeri
            studentFormContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @When("^Click and Select Date options form class$")
    public void clickAndSelectDateOptionsFormClass() {
    }
    @When("^Click and Select options form class$")
    public void clickAndSelectOptionsFormClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {
            System.out.println(elementsToClick.get(i));
            studentFormContent.findElementAndClickFunction(elementsToClick.get(i));
            i++;
            studentFormContent.findElementAndSelectOption("option", elementsToClick.get(i));
        }

    }

    @When("^Click to \"([^\"]*)\" form class$")
    public void clickToFormClass(String arg0){
       studentFormContent.findElementAndClickFunction(arg0);
    }
}
