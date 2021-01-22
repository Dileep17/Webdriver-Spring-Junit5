package org.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    @FindBy(className = "product_list")
    WebElement productList;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFirstSearchResult(){
        waitForToBeVisible(productList);
        productList.findElements(By.tagName("li")).get(0).click();
    }

    public void moveOverFirstSearchResult() {
        waitForToBeVisible(productList);
        Actions actions = new Actions(driver);
        WebElement firstSearchResult = productList.findElements(By.tagName("li")).get(0);
        actions.moveToElement(firstSearchResult).build().perform();
    }

    public boolean isAddToCartButtonDisplayedOnFirstSearchResult(){
        WebElement addToCartButtonOnFirstSearchResult = productList.findElements(By.tagName("li")).get(0).findElement(By.className("ajax_add_to_cart_button"));
        return addToCartButtonOnFirstSearchResult.isDisplayed();
    }

    public boolean isMoreButtonDisplayedOnFirstSearchResult(){
        WebElement moreButtonOnFirstSearchResult = productList.findElements(By.tagName("li")).get(0).findElement(By.className("lnk_view"));
        return moreButtonOnFirstSearchResult.isDisplayed();
    }

}
