package org.learning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "threadScope")
public class LandingPage extends BasePage{

    @FindBy(id = "search_query_top")
    WebElement searchTextField;

    @FindBy(name = "submit_search")
    WebElement searchButton;

    @FindBy(className = "login")
    WebElement signInLink;

    public void open(){
        driver.navigate().to("http://automationpractice.com");
    }

    public void searchProduct(String productSearchPhrase){
        waitForElementToBeVisible(searchTextField);
        searchTextField.sendKeys(productSearchPhrase);
        searchButton.click();
    }

    public void clickSignInLink(){
        signInLink.click();
    }
}
