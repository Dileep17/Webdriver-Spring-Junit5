package org.learning.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.learning.pages.LandingPage;
import org.learning.pages.ProductPage;
import org.learning.pages.SearchResultsPage;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;

public class SearchProductsTest extends BaseTest{

    @Autowired
    LandingPage landingPage;

    @Autowired
    SearchResultsPage searchResultsPage;

    @Autowired
    ProductPage productPage;

    @ParameterizedTest
    @ValueSource(strings = {"shirt", "skirt"})
    void ShouldBeAbleToSearchAProductAndAddToCart(String productSearchPhrase) throws IOException {
        landingPage.open();
        landingPage.searchProduct(productSearchPhrase);
        searchResultsPage.clickOnFirstSearchResult();
        productPage.addProductToCart();
        Assertions.assertTrue(productPage.isTextDisplayedOnCartLayer("There is 1 item in your cart."));
    }

}
