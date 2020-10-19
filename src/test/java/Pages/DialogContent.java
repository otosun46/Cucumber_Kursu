/**
 * @Author:Otosun Tarih :05/10/2020
 */
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;


public class DialogContent extends _Parent {
// Tanimlama _Parent Classta yapildigi ve bu Class _Parent Classtan extend yapildigindan burada constructur ihtiyaci kalmamistir
//    public DialogContent() {
//        PageFactory.initElements(driver, this);
//    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    public WebElement gotItBtn;

    @FindBy(id = "cookieconsent")
    public WebElement cookieConsent;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton; //sorun olursa bunu kullan

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCodeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement priorityInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(css = "div[role=alertdialog]")
    private WebElement alertdialog;

    @FindAll(
            {
                    @FindBy(xpath = "//span[@class='mat-option-text']")
            }
    )
    public List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
// "//button[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement userTypeDropdown;
    /*
        @FindAll({
                @FindBy(xpath = "//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']")
        })
        public List<WebElement> userTypeAllOptions;

    */
    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    private List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement> editButtonList;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    public List<WebElement> gotItBtns;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;


    public void findElementAndClickFunction(String ElementName) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":    //Buradaki sorunu LoginStepste cookieConsent elemaninin gorunur olmasini sorgulayarak cozdum
                // bu eleman yok ise çoklu olarak yinede bulduk
                // eğer gerçekten yok ise size 0 olacağı için
                // bekletmeye düşmesin diye fonksiyonu geri gönderdik.
//                if (gotItBtns.size() == 0)
//                    return;
                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "UserTypeDropdown":
                myElement = userTypeDropdown;
                break;
        }
        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "codeInput":
                myElement = codeInput;
                break;

            case "shortName":
                myElement = shortName;
                break;

            case "searchNameInput":
                myElement = searchNameInput;
                break;
            case "integrationCodeInput":
                myElement = integrationCodeInput;
                break;
            case "priorityInput":
                myElement = priorityInput;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findElementAndVerifyContainsText(String elementName, String msg) {
        switch (elementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "errorMessage":
                myElement = errorMessage;
                break;
        }
        verifyElementContainsText(myElement, msg);
    }

    public void editAndDeleteFunction(String countryName, String editOrDelete) {
        List<WebElement> btnList = new ArrayList<>();
//        wait.until(ExpectedConditions.invisibilityOf(msjContainer));
         beklet(500);
        if (editOrDelete.equalsIgnoreCase("delete")) {
            btnList = waitVisibleListAllElement(deleteButtonList);
        } else btnList = waitVisibleListAllElement(editButtonList);

        for (int i = 0; i < waitVisibleListAllElement(nameList).size(); i++) {
            System.out.println(waitVisibleListAllElement(nameList).get(i).getText());
            if (waitVisibleListAllElement(nameList).get(i).getText().equalsIgnoreCase(countryName)) {
                clickFunction(btnList.get(i));
            }
        }
    }

    public void deleteAllItemsOfList() {
        List<WebElement> btnList = new ArrayList<>();
        beklet(100);
        for (WebElement e : nameList) {
            beklet(300);
            clickFunction(deleteButtonList.get(0));
            clickFunction(yesButton);
            waitUntilVisible(alertdialog);
            if (alertdialog.getText().contains("You can not delete")) break;
            System.out.println(alertdialog.getText());
        }
    }

    public void findElementAndSelectOption(String listName, String secenek) {
        switch (listName) {
            case "userTypeAllOptions":
                myList = userTypeAllOptions;
                break;
            case "deleteButtonList":
                myList = deleteButtonList;
                break;
            case "editButtonList":
                myList = editButtonList;
                break;
            case "nameList":
                myList = nameList;
                break;

        }
        selectOptionByString(myList, secenek);
    }

}
