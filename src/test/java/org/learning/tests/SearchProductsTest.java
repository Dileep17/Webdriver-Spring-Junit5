package org.learning.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.learning.pages.LandingPage;
import org.learning.pages.ProductPage;
import org.learning.pages.SearchResultsPage;

public class SearchProductsTest extends BaseTest{

    LandingPage landingPage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;

    @BeforeEach
    public void setUp(){
        landingPage = new LandingPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productPage = new ProductPage(driver);
    }

    @ParameterizedTest
    @ValueSource(strings = {"shirt", "skirt"})
    void ShouldBeAbleToSearchAProductAndAddToCart(String productSearchPhrase) {
        landingPage.open();
        landingPage.searchProduct(productSearchPhrase);
        searchResultsPage.clickOnFirstSearchResult();
        productPage.addProductToCart();
        Assertions.assertTrue(productPage.isTextDisplayedOnCartLayer("There is 1 item in your cart."));
    }

}
