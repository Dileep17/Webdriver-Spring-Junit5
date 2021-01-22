package org.learning.pages.components;

import org.learning.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInComponent extends BasePage {
    @FindBy(id = "login_form")
    WebElement signInSection;

    @FindBy(id = "email")
    WebElement emailAddressField;

    @FindBy(id = "passwd")
    WebElement passwordField;

    public SignInComponent(WebDriver driver) {
        super(driver);
    }

    public boolean isTextDisplayedOnSignInSection(String textToBeDisplayed){
        return signInSection.findElement(By.xpath("//*[contains(text(), '" + textToBeDisplayed+"')]")).isDisplayed();
    }

    public void login(String userName, String password){
        emailAddressField.sendKeys(userName);
        passwordField.sendKeys(password);
    }
}
