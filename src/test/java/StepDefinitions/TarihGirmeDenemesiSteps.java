/**
 * @Author:Otosun Tarih :16/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

import java.util.Calendar;

public class TarihGirmeDenemesiSteps {
    DialogContent dialogContent = new DialogContent();
    LeftNav leftNav = new LeftNav();
    FormContent formContent = new FormContent();

    @When("^Click \"([^\"]*)\" and \"([^\"]*)\" and Send \"([^\"]*)\" Date options$")
    public void clickAndSendDateOptions(String arg0, String arg1, String arg2) {
      //  formContent.findElementAndClickFunction(arg0);
       // formContent.findElementAndSendKeysFunction(arg1, arg2);
        formContent.beklet(1000);
     //   formContent.findElementAndClickFunction(arg0);
     //   formContent.switchToWindow();
//        formContent.findElementAndSelectOption("selectDayOfMondy", "10");


    }
}
