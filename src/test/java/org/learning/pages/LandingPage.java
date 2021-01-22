package org.learning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy(id = "search_query_top")
    WebElement searchTextField;

    @FindBy(name = "submit_search")
    WebElement searchButton;

    @FindBy(className = "login")
    WebElement signInLink;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.navigate().to("http://automationpractice.com");
    }

    public void searchProduct(String productSearchPhrase){
        waitForToBeVisible(searchTextField);
        searchTextField.sendKeys(productSearchPhrase);
        searchButton.click();
    }

    public void clickSignInLink(){
        signInLink.click();
    }
}
