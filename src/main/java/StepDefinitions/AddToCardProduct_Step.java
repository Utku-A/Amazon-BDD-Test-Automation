package StepDefinitions;

import PageObjectModels.ProductPage;
import PageObjectModels.SearchProductPage;
import PageObjectModels.NavbarObjects;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

 public class AddToCardProduct_Step {

    WebDriver driver;

    NavbarObjects topNavbar = new NavbarObjects();
    SearchProductPage searchProductPage = new SearchProductPage();
    ProductPage productPage = new ProductPage();

    @Given("Navigate go to website")
    public void navigateGoToWebsite() {
        driver = Driver.setUp();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("Cookies Accepted")
    public void cookiesAccepted() {
        topNavbar.acceptCookies();
    }

    @And("Search product enter {string}")
    public void searchProductEnter(String product) {
        topNavbar.typeSearchProduct(product);
    }

    @And("Click to search button")
    public void clickToSearchButton() {
        topNavbar.clickSearchButton();
    }

    @And("Select search product {string}")
    public void selectSearchProduct(String Select) {
        searchProductPage.selectSearchProduct(Select);
    }

    @When("Add to card")
    public void addToCard() {
        productPage.addToCard();
    }

    @Then("Success message")
    public void successMessage() {
        productPage.cartMessage();
    }

    @After
     public void quit() {
        Driver.tearDown();
    }
}
