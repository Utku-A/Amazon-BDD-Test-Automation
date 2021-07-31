package PageObjectModels;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ProductPage extends BasePage{

    WebDriver driver;

    public ProductPage() {
        driver = Driver.setUp();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCardLocator;

    @FindBy(css = "h1.a-size-medium")
    private WebElement cardMessageLocator;

    @FindBy(id = "native_dropdown_selected_size_name")
    private WebElement selectSizeDropDownLocator;

    @FindBy(id = "submit.buy-now")
    private WebElement buyNowButtonLocator;



    public void addToCard() {
        clickFunction(addToCardLocator);
    }

    public void cartMessage() {
        assertionText(cardMessageLocator,"Sepete Eklendi");
    }

    public void selectSizeProduct(String size) {
        selectRadioElement(selectSizeDropDownLocator,size);
    }

    public void buyNowButton() {
        clickFunction(buyNowButtonLocator);
    }
}
