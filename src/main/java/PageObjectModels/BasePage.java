package PageObjectModels;

import Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver = Driver.setUp();
    WebDriverWait wait = new WebDriverWait(driver,10);

    public void clickFunction(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }

    public void typeFunction(WebElement locator,String text) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        locator.sendKeys(text);
    }

    public void selectRadioElement(WebElement locator,String select) {
        wait.until(ExpectedConditions.visibilityOfAllElements(locator));
        Select slc = new Select(locator);
        slc.selectByVisibleText(select);
    }

    public void assertionText(WebElement locator,String equals) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        Assert.assertEquals(locator.getText(),equals);
        System.out.println("Given Message : "+locator.getText()+" | Correct Message : "+equals);
    }

    public void hoverFunction(WebElement locator) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        Actions actions = new Actions(driver);
        actions.moveToElement(locator).perform();
    }

    public WebElement selectLocator(By locator,int select) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
            return driver.findElements(locator).get(select);
    }

}
