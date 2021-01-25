package org.learning.pages;

import org.learning.pages.components.CreateNewAccountComponent;
import org.learning.pages.components.SignInComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "threadScope")
public class SignInPage  extends BasePage{

    @Autowired
    CreateNewAccountComponent createNewAccountComponent;

    @Autowired
    SignInComponent signInComponent;

    public CreateNewAccountComponent getCreateNewAccountComponent() {
        return createNewAccountComponent;
    }

    public SignInComponent getSignInComponent(){
        return signInComponent;
    }
}
