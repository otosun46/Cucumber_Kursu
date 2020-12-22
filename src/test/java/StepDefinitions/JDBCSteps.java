/**
 * @Author:Otosun Tarih :16/11/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class JDBCSteps {
    @Then("^Send The quary the database \"([^\"]*)\" and control match$")
    public void sendTheQuaryTheDatabaseAndControlMatch(String quary) {
        DialogContent dialogContent=new DialogContent();
        List<List<String>> dbLst = DBUtility.getData("ts_ismet1",quary);

        List<WebElement> uiLst=dialogContent.waitVisibleListAllElement(dialogContent.nameList);

        for (int i=0;i < dbLst.size();i++){
            Assert.assertEquals(dbLst.get(i).get(1),uiLst.get(i).getText());
            System.out.println(i+1+"- "+dbLst.get(i).get(1) +"--"+uiLst.get(i).getText());
        }
    }

    @Then("^Send The quary the database \"([^\"]*)\" and control match\\.$")
    public void sendTheQuaryTheDatabaseAndControlMatchCity(String quary){
        DialogContent dialogContent=new DialogContent();
        List<List<String>> dbLst = DBUtility.getData("ts_orhan46",quary);

        List<WebElement> uiLst=dialogContent.waitVisibleListAllElement(dialogContent.nameList);

        for (int i=0;i < dbLst.size();i++){
            Assert.assertEquals(dbLst.get(i).get(1),uiLst.get(i).getText());
            System.out.println(i+1+"- "+dbLst.get(i).get(1) +"--"+uiLst.get(i).getText());
        }
    }
}
