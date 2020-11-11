/**
 * @Author:Otosun Tarih :13/10/2020
 */
package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FormContent extends _Parent {

//    public FormContent() {
//        PageFactory.initElements(driver, this);
//    }

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExams;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setup2;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExam2;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton; //sorun olursa bunu kullan

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindAll({
                    @FindBy(xpath = "//span[@class='mat-option-text']")
            })
    private List<WebElement> selectOptions;

    @FindAll({
                    @FindBy(css = "td[role=gridcell]")
            })
    private List<WebElement> selectDayOfMondy;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement documentType;

    @FindBy(css = "button[class='mat-focus-indicator mat-tooltip-trigger mat-raised-button mat-button-base']")
    private WebElement documentAddButton;

    @FindBy(css = "input[data-placeholder='Reg.Start']")
    private WebElement regStartInput;

    @FindBy(css = "ms-date[formcontrolname='registrationStartDate']")
    private WebElement regStart;

    @FindBy(css = "input[data-placeholder='Reg.End']")
    private WebElement regEndInput;

    @FindBy(css = "ms-date[formcontrolname='registrationEndDate']")
    private WebElement regEnd;

    @FindBy(xpath = "//div[@class='cdk-overlay-pane']")
    private WebElement listBox;

    @FindBy(css = "input[data-placeholder='Name']")
    private WebElement searchName;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[@aria-label='Open calendar'])[1]")
    private WebElement startOpenCloseCalender;

    @FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]")
    private WebElement endOpenCloseCalender;

    @FindBy(css = "input[name='datePickerControl']")
    private WebElement regStartInput1;

    public WebElement findWebElement(String webElementName) {

        switch (webElementName) {
            case "entranceExams":
                myElement = entranceExams;
                break;
            case "setup2":
                myElement = setup2;
                break;
            case "entranceExam2":
                myElement = entranceExam2;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "academicPeriod":
                myElement = academicPeriod;
                break;
            case "gradeLevel":
                myElement = gradeLevel;
                break;
            case "documentAddButton":
                myElement = documentAddButton;
                break;
            case "documentType":
                myElement = documentType;
                break;
            case "regStart":
                myElement = regStart;
                break;
            case "regStartInput":
                myElement = regStartInput;
                break;
            case "regStartInput1":
                myElement = regStartInput1;
                break;
            case "regEndInput":
                myElement = regEndInput;
                break;
            case "regEnd":
                myElement = regEnd;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "startOpenCloseCalender":
                myElement = startOpenCloseCalender;
                break;
            case "endOpenCloseCalender":
                myElement = endOpenCloseCalender;
                break;
            case "nameInput":
                myElement = nameInput;
                break;

            case "searchName":
                myElement = searchName;
                break;
        }
        beklet(200);
        return myElement;
    }

    /**
     * Parametre olarak ismi girilen WebElementListi dondurur.
     *
     * @param webElementListName
     * @return
     */
    public List<WebElement> findWebElementList(String webElementListName) {
        switch (webElementListName) {
            case "selectOptions":
                myList = selectOptions;
                break;
            case "selectDayOfMondy":
                myList = selectDayOfMondy;
                break;
        }
        return myList;
    }
    /**
     * Bu metod steps classtan calistirilacak parametre olarak string olarak tiklanacak WebElementin ismini alir.
     *
     * @param element
     */
    public void findElementAndClickFunction(String element) {
        clickFunction(findWebElement(element));
    }

    /**
     * Parametre olarak ismi gonderilen WebElementi bulur ve value parametresini secilen WebElemente gonderir.
     *
     * @param element
     * @param value
     */
    public void findElementAndSendKeysFunction(String element, String value) {
        sendKeysFunction(findWebElement(element), value);
    }

    /**
     * Bu metod steps classindan cagrilir.
     * Parametre olarak seceneklerin oldugu WebElementListesinin adini ve secim kriterini string olarak alir.
     * Secim parametresi sayi olursa index olarak degerlendirilir ve o indexli WebElement secilir.
     * Parametre sayi degilse WebElementin texti ile karsilastirilir ve kapsayan WebElement secilir.
     * @param listName
     * @param secenek
     */
    public void findElementAndSelectOption(String listName, String secenek) {
        selectOptionByString(findWebElementList(listName), secenek);
    }

}
