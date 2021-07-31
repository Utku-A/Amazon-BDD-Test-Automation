package PageObjectModels;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    WebDriver driver;

    public LoginPage() {
        driver = Driver.setUp();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ap_email")
    private WebElement emailTextAreaLocator;

    @FindBy(id = "ap_password")
    private WebElement passwordTextAreaLocator;

    @FindBy(id = "continue")
    private WebElement emailContinueButtonLocator;

    @FindBy(id = "signInSubmit")
    private WebElement signInButtonLocator;

    @FindBy(css = "h4.a-alert-heading")
    private WebElement signInMessageLocator;

    public void typeEmail(String email) {
        typeFunction(emailTextAreaLocator,email);
    }

    public void continueButton() {
        clickFunction(emailContinueButtonLocator);
    }

    public void typePassword(String password) {
        typeFunction(passwordTextAreaLocator,password);
    }

    public void signInButton() {
        clickFunction(signInButtonLocator);
    }

    public void signInMessage() {
        assertionText(signInMessageLocator,"Önemli Mesaj!");
    }

}
