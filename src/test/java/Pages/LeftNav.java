/**
 * @Author:Otosun Tarih :06/10/2020
 */
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _Parent {
// Tanimlama _Parent Classta yapildigi ve bu Class _Parent Classtan extend yapildigindan burada constructur ihtiyaci kalmamistir
//    public LeftNav() {
//        PageFactory.initElements(driver, this);
//    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenships;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationality;

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupButtonUnderInventory;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategory;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExams;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setup2;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExam2;

    @FindBy(xpath = "//span[text()='Student']")
    private WebElement student;

    @FindBy(xpath = "//span[text()='Students']")
    private WebElement students;

    WebElement myElement;

    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {
            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "country":
                myElement = country;
                break;
            case "citizenships":
                myElement = citizenships;
                break;
            case "nationality":
                myElement = nationality;
                break;
            case "inventory":
                myElement = inventory;
                break;
            case "setupButtonUnderInventory":
                myElement = setupButtonUnderInventory;
                break;
            case "ItemCategory":
                myElement = ItemCategory;
                break;
            case "fees":
                myElement = fees;
                break;
            case "entranceExams":
                myElement = entranceExams;
                break;
            case "setup2":
                myElement = setup2;
                break;
            case "entranceExam2":
                myElement = entranceExam2;
                break;
            case "student":
                myElement = student;
                break;
            case "students":
                myElement = students;
                break;
        }

        return myElement;
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

}
