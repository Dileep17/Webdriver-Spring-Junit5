package org.learning.pages.components;

import org.learning.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateNewAccountComponent extends BasePage {

    @FindBy(id = "create-account_form")
    WebElement createAccountSection;

    public CreateNewAccountComponent(WebDriver driver) {
        super(driver);
    }

    public boolean isTextDisplayedOnCreateAccountSection(String textToBeDisplayed){
        return createAccountSection.findElement(By.xpath("//*[contains(text(), '" + textToBeDisplayed+"')]")).isDisplayed();
    }

}
