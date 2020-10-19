/**
 * @Author:Otosun Tarih :13/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class DataTableSteps {
    DialogContent dialogContent = new DialogContent();
    LeftNav leftNav = new LeftNav();
    FormContent formContent = new FormContent();

    @And("^Click on the element in the left class$")
    public void clickOnTheElementInTheLeftClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Click on the element in the content class$")
    public void clickOnTheElementInTheContentClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            formContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^User sending the keys in the dialog content class$")
    public void userSendingTheKeysInTheDialogContentClass(DataTable elements) {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            System.out.println(elementsNameAndValue.get(i).get(0)); // elemanın adı
            System.out.println(elementsNameAndValue.get(i).get(1)); // elemanın gönderilecek değeri

//             | nameInput | ismetCountry |    elementsNameAndValue.get(i).get(0)   i.satırdaki 0.eleman yani nameInput,
//                                             elementsNameAndValue.get(i).get(1)   i.satırdaki 1.eleman yani ismetCountry,
//             | codeInput | 123          |    elementsNameAndValue.get(i).get(0)   i.satırdaki 0.eleman yani codeInput,
//                                             elementsNameAndValue.get(i).get(1)   i.satırdaki 1.eleman yani 123,

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @When("^Click and Select options$")
    public void clickAndSelectOptions(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {
            System.out.println(elementsToClick.get(i));
            formContent.findElementAndClickFunction(elementsToClick.get(i));
            i++;
            formContent.findElementAndSelectOption("selectOptions", elementsToClick.get(i));
        }

    }

    @When("^Click and Select Date options$")
    public void clickAndSelectDateOptions(DataTable elements) {

//        List<String> elementsToClick = elements.asList(String.class);
        List<List<String>> elementsClickAndSelectIndex = elements.asLists(String.class);
        for (int i = 0; i < elementsClickAndSelectIndex.size(); i++) {

            System.out.println(elementsClickAndSelectIndex.get(i).get(0));
            formContent.findElementAndClickFunction(elementsClickAndSelectIndex.get(i).get(0));
            formContent.findElementAndSelectOption("selectDayOfMondy", elementsClickAndSelectIndex.get(i).get(1));
//            formContent.selectDayOfMondy(elementsClickAndSelectIndex.get(i).get(1));

        }

    }

    @When("^User delete the Exam\"([^\"]*)\"$")
    public void userDeleteTheExam(String arg0) {
//        formContent.findElementAndSendKeysFunction("searchName",arg0);
//        dialogContent.findElementAndClickFunction("searchButton");

        dialogContent.editAndDeleteFunction(arg0, "delete");
        dialogContent.findElementAndClickFunction("yesButton");
    }

    @And("^User sending the keys in the form content class$")
    public void userSendingTheKeysInTheFormContentClass(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            System.out.println(elementsNameAndValue.get(i).get(0)); // elemanın adı
            System.out.println(elementsNameAndValue.get(i).get(1)); // elemanın gönderilecek değeri

            formContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

}
