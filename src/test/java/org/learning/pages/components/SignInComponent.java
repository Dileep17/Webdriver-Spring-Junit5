package org.learning.pages.components;

import org.learning.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "threadScope")
public class SignInComponent  extends BasePage {

    @FindBy(id = "login_form")
    WebElement signInSection;

    @FindBy(id = "email")
    WebElement emailAddressField;

    @FindBy(id = "passwd")
    WebElement passwordField;

    public boolean isTextDisplayedOnSignInSection(String textToBeDisplayed){
        waitForTextToBeDisplayed(textToBeDisplayed);
        return signInSection.findElement(By.xpath("//*[contains(text(), '" + textToBeDisplayed+"')]")).isDisplayed();
    }
}
