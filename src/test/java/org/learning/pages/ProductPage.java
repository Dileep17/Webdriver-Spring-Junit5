package org.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Scope(value = "threadScope")
public class ProductPage  extends BasePage{

    @FindBy(css = "#add_to_cart button")
    WebElement addToCartButton;

    @FindBy(id = "layer_cart")
    WebElement cartLayer;

    public void addProductToCart(){
        waitForElementToBeVisible(addToCartButton);
        new Actions(driver).moveToElement(addToCartButton).click().perform();
    }

    public boolean isTextDisplayedOnCartLayer(String text) throws IOException {
        waitForElementToBeVisible(cartLayer);
        return cartLayer.findElement(By.xpath("//*[contains(text(), '" + text+"')]")).isDisplayed();
    }
}
