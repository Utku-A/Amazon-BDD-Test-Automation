package StepDefinitions;

import PageObjectModels.NavbarObjects;
import PageObjectModels.ProductPage;
import PageObjectModels.SearchProductPage;
import io.cucumber.java.en.And;

public class SelectProductFromNavigate_Step {

    NavbarObjects navbarObjects = new NavbarObjects();
    SearchProductPage searchProductPage = new SearchProductPage();
    ProductPage productPage = new ProductPage();

    @And("Open side navigate bar")
    public void openSideNavigateBar() {
        navbarObjects.sideNavigateBar();
    }

    @And("Select ayakabi")
    public void selectAyakabi() {
        navbarObjects.selectSideBarAyakabi();
    }

    @And("Select Ev terligi")
    public void selectEvTerligi() {
        navbarObjects.selectSideEvterligi();
    }

    @And("Select product {string}")
    public void selectProduct(String Select) {
        searchProductPage.selectProduct(Select);
    }

    @And("Select choose size {string}")
    public void selectChooseSize(String size) {
        productPage.selectSizeProduct(size);
    }

    @And("Buy now button click")
    public void buyNowButtonClick() {
        productPage.buyNowButton();
    }


}
