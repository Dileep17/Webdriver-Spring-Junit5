package org.learning.pages;

import org.learning.config.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class BasePage {
    @Autowired
    WebDriver driver;

    WebDriverWait webDriverWait;

    @PostConstruct
    public void setUp(){
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, Constants.WEBDRIVER_WAIT_IN_SECONDS);
    }

    public void waitForElementToBeVisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element) {
        waitForElementToBeVisible(element);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForTextToBeDisplayed(String textToBeDisplayed){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + textToBeDisplayed+ "')]")));
    }

}
