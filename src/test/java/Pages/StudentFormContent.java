/**
 * @Author:Otosun Tarih :15/10/2020
 */
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class StudentFormContent extends _Parent {
    // Tanimlama _Parent Classta yapildigi ve bu Class _Parent Classtan extend yapildigindan burada constructur ihtiyaci kalmamistir
//    public StudentFormContent() {
//        PageFactory.initElements(driver, this);
//    }
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']/input")
    private WebElement firstName;

    @FindBy(css = "ms-text-field[formcontrolname='lastName']>input")
    private WebElement lastName;

    @FindBy(css = "input[formcontrolname='studentId']")
    private WebElement studentId;

    @FindBy(css = "mat-select[formcontrolname='gender']")
    private WebElement gender;

    @FindBy(css = "mat-form-field[formgroupname='currentGradeLevel']")
    private WebElement gradeLevel;

    @FindBy(css = "mat-form-field[formgroupname='department']")
    private WebElement department;

    @FindBy(css = "mat-select[formcontrolname='section']")
    private WebElement section;

    @FindBy(css = "ms-masked-text-field[formcontrolname='phone']>input")
    private WebElement mobilePhone;

    @FindBy(css = "input[formcontrolname='email']")
    private WebElement email;

    @FindBy(css = "mat-form-field[formgroupname='citizenship']")
    private WebElement citizenship;

    @FindBy(css = "mat-form-field[formgroupname='nationality']")
    private WebElement nationality;

    @FindBy(css = "input[formcontrolname='previousSchoolName']")
    private WebElement previousSchoolName;

    @FindBy(xpath = "(//div[@role='tab'])[1]")
    private WebElement documentInfoTab;

    @FindBy(css = "mat-select[formcontrolname='type']")
    private WebElement documentType;

    @FindBy(css = "input[formcontrolname='documentNumber']")
    private WebElement documentNumber;

    @FindBy(xpath = "(//div[@role='tab'])[2]")
    private WebElement representativeTab;

    @FindBy(css = "ms-add-button[tooltip='GENERAL.BUTTON.ADD_REPRESENTATIVE']")
    private WebElement addButtonRepresentative;

    @FindBy(css = "mat-select[formcontrolname='type']")
    private WebElement representativeType;

    @FindBy(css = "input[formcontrolname='firstName']")
    private WebElement representativeFirstName;

    @FindBy(css = "input[formcontrolname='lastName']")
    private WebElement representativeLastName;

    @FindBy(css = "input[formcontrolname='middleName']")
    private WebElement representativeMiddleName;

    @FindBy(css = "input[formcontrolname='phone']")
    private WebElement representativePhone;

    @FindBy(css = "mat-form-field[formgroupname='country']")
    private WebElement representativeCountry;

    @FindBy(css = "mat-form-field[formgroupname='city']")
    private WebElement representativeCity;

    @FindBy(css = "div[fxlayoutalign='start stretch']>button[mat-button]")
    private WebElement representativeAddButton;

    @FindBy(css = "ms-save-button>button")
    private WebElement saveButton;


    @FindAll({
            @FindBy(css = "mat-option[role='option']")
    })
    private List<WebElement> option;

    @FindAll({
            @FindBy(css = "div[role='tab']")
    })
    private List<WebElement> tabOption;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "addButton":
                myElement = addButton;
                break;
            case "gender":
                myElement = gender;
                break;
            case "gradeLevel":
                myElement = gradeLevel;
                break;
            case "department":
                myElement = department;
                break;
            case "section":
                myElement = section;
                break;
            case "citizenship":
                myElement = citizenship;
                break;
            case "nationality":
                myElement = nationality;
                break;
            case "documentType":
                myElement = documentType;
                break;
            case "addButtonRepresentative":
                myElement = addButtonRepresentative;
                break;
            case "representativeType":
                myElement = representativeType;
                break;
            case "representativeCountry":
                myElement = representativeCountry;
                break;
            case "representativeCity":
                myElement = representativeCity;
                break;
            case "representativeAddButton":
                myElement = representativeAddButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "documentInfoTab":
                myElement = documentInfoTab;
                break;
            case "representativeTab":
                myElement = representativeTab;
                break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "firstName":
                myElement = firstName;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "studentId":
                myElement = studentId;
                break;
            case "gender":
                myElement = gender;
                break;
            case "mobilePhone":
                myElement = mobilePhone;
                break;
            case "email":
                myElement = email;
                break;
            case "previousSchoolName":
                myElement = previousSchoolName;
                break;
            case "documentNumber":
                myElement = documentNumber;
                break;
            case "representativeFirstName":
                myElement = representativeFirstName;
                break;
            case "representativeLastName":
                myElement = representativeLastName;
                break;
            case "representativeMiddleName":
                myElement = representativeMiddleName;
                break;
            case "representativePhone":
                myElement = representativePhone;
                break;
        }
        beklet(50);
        sendKeysFunction(myElement, value);
    }

    public void findElementAndSelectOption(String listName, String secenek) {
        switch (listName) {
            case "option":
                myList = option;
                break;
            case "tabOption":
                myList = tabOption;
                break;

        }
        beklet(200);
        selectOptionByString(myList, secenek);
    }
}
