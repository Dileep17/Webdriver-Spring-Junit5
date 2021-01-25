package org.learning.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.learning.pages.*;
import org.springframework.beans.factory.annotation.Autowired;

public class UserSignUpTest extends BaseTest {

    @Autowired
    LandingPage landingPage;

    @Autowired
    SignInPage signInPage;

    @Test
    void ShouldBeAbleToViewCreateNewAccountOptionInSignInPage(){
        landingPage.open();
        landingPage.clickSignInLink();
        Assertions.assertTrue(signInPage.getCreateNewAccountComponent().isTextDisplayedOnCreateAccountSection("Create an account"));
    }

}
