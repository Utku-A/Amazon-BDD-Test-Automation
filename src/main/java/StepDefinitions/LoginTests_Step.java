package StepDefinitions;

import PageObjectModels.LoginPage;
import PageObjectModels.NavbarObjects;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTests_Step {

    NavbarObjects topNavbar = new NavbarObjects();
    LoginPage loginPage = new LoginPage();

    @And("Sign in button click")
    public void signInButtonClick() {
        topNavbar.signInButton();
    }

    @And("Enter email address {string}")
    public void enterEmailAddress(String email) {
        loginPage.typeEmail(email);
    }

    @And("Continue button click")
    public void continueButtonClick() {
        loginPage.continueButton();
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        loginPage.typePassword(password);
    }

    @When("Login button click")
    public void loginButtonClick() {
        loginPage.signInButton();
    }

    @Then("Verify message")
    public void verifyMessage() {
        loginPage.signInMessage();
    }

    @After
    public void quit() {
        Driver.tearDown();
    }
}
