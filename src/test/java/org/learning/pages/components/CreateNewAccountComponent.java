package org.learning.pages.components;

import org.learning.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "threadScope")
public class CreateNewAccountComponent extends BasePage {

    @FindBy(id = "create-account_form")
    WebElement createAccountSection;

    public boolean isTextDisplayedOnCreateAccountSection(String textToBeDisplayed){
        waitForTextToBeDisplayed(textToBeDisplayed);
        return createAccountSection.findElement(By.xpath("//*[contains(text(), '" + textToBeDisplayed+"')]")).isDisplayed();
    }

}
