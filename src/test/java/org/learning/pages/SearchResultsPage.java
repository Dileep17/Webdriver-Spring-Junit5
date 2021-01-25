package org.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "threadScope")
public class SearchResultsPage  extends BasePage{

    @FindBy(className = "product_list")
    WebElement productList;

    public void clickOnFirstSearchResult(){
        waitForElementToBeVisible(productList);
        WebElement element = productList.findElements(By.tagName("li")).get(0);
        waitForElementToBeClickable(element);
        new Actions(driver).moveToElement(element).click(element).perform();
    }

}
