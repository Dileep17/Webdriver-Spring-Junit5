package org.learning.pages;

import org.learning.config.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;

    WebDriverWait webDriverWait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, Constants.WEBDRIVER_WAIT_IN_SECONDS);
    }

    public void waitForToBeVisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

}
