package PageObjectModels;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchProductPage extends BasePage{

    WebDriver driver;

    public SearchProductPage() {
        driver = Driver.setUp();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "img.s-image")
    private WebElement selectSearchProductLocator;

    By selectSearchProductLocatorBy = By.cssSelector("img.s-image");
    By selectProductLocator = By.className("octopus-pc-item-image-section-v3");

    public void selectSearchProduct(String select) {
        int slc = Integer.parseInt(select);
        selectLocator(selectSearchProductLocatorBy,slc).click();
    }

    public void selectProduct(String select) {
        int slc = Integer.parseInt(select);
        slc--;
        selectLocator(selectProductLocator,slc).click();
    }

}
