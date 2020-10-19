/**
 * @Author:Otosun Tarih :12/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ItemCategories {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @And("^Navigate to Categories page$")
    public void navigateToCategoriesPage() {
        leftNav.findElementAndClickFunction("inventory");
        leftNav.findElementAndClickFunction("setupButtonUnderInventory");
        leftNav.findElementAndClickFunction("ItemCategory");

    }

    @When("^User Create item Categories name as \"([^\"]*)\"user type as \"([^\"]*)\"$")
    public void userCreateItemCategoriesNameAsUserTypeAs(String name, String userType){
        dialogContent.findElementAndClickFunction("addButton");

        dialogContent.findElementAndSendKeysFunction("nameInput",name);
      //  dialogContent.findElementAndSendKeysFunction("UserTypeDropdown",type);
        dialogContent.findElementAndClickFunction("UserTypeDropdown");
//        dialogContent.selectUserType(userType);
        dialogContent.findElementAndSelectOption("userTypeAllOptions",userType);
        dialogContent.findElementAndClickFunction("saveButton");

    }
}
