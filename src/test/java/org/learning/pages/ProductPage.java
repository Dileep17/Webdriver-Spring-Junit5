package org.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(css = "#add_to_cart button")
    WebElement addToCartButton;

    @FindBy(id = "layer_cart")
    WebElement cartLayer;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(){
        waitForToBeVisible(addToCartButton);
        addToCartButton.click();
    }

    public boolean isTextDisplayedOnCartLayer(String text){
        waitForToBeVisible(cartLayer);
        return cartLayer.findElement(By.xpath("//*[contains(text(), '" + text+"')]")).isDisplayed();
    }
}
