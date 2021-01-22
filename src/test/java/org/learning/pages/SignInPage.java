package org.learning.pages;


import org.learning.pages.components.CreateNewAccountComponent;
import org.learning.pages.components.SignInComponent;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

    CreateNewAccountComponent createNewAccountComponent;
    SignInComponent signInComponent;

    public SignInPage(WebDriver driver) {
        super(driver);
        createNewAccountComponent = new CreateNewAccountComponent(driver);
        signInComponent = new SignInComponent(driver);
    }

    public CreateNewAccountComponent getCreateNewAccountComponent() {
        return createNewAccountComponent;
    }

    public SignInComponent getSignInComponent(){
        return signInComponent;
    }
}
