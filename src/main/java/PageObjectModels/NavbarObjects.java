package PageObjectModels;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavbarObjects extends BasePage{

    WebDriver driver;

    public NavbarObjects() {
        driver = Driver.setUp();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "sp-cc-accept")
    private WebElement acceptCookiesLocator;

    @FindBy(name = "field-keywords")
    private WebElement searchTextAreaLocator;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButtonLocator;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement accountListLocator;

    @FindBy(css = "a.nav-action-button")
    private WebElement signInButtonLocator;

    @FindBy(className = "hm-icon-label")
    private WebElement sideNavigateBarLocator;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")
    private WebElement sideBarAyakabiLocator;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[2]/li[8]/a")
    private WebElement sideBarEvterligiLocator;


    public void acceptCookies() {
        clickFunction(acceptCookiesLocator);
    }

    public void typeSearchProduct(String product) {
        typeFunction(searchTextAreaLocator,product);
    }

    public void clickSearchButton() {
        clickFunction(searchButtonLocator);
    }

    public void signInButton() {
        hoverFunction(accountListLocator);
        clickFunction(signInButtonLocator);
    }

    public void sideNavigateBar() {
        clickFunction(sideNavigateBarLocator);
    }

    public void selectSideBarAyakabi() {
        clickFunction(sideBarAyakabiLocator);
    }

    public void selectSideEvterligi() {
        clickFunction(sideBarEvterligiLocator);
    }

}
