package org.learning.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.learning.pages.*;

public class UserSignUpTest extends BaseTest {

    LandingPage landingPage;
    SignInPage signInPage;

    @BeforeEach
    void setUp(){
        landingPage = new LandingPage(driver);
        signInPage = new SignInPage(driver);
    }

    @Test
    void ShouldBeAbleToViewCreateNewAccountOptionInSignInPage(){
        landingPage.open();
        landingPage.clickSignInLink();
        Assertions.assertTrue(signInPage.getCreateNewAccountComponent().isTextDisplayedOnCreateAccountSection("Create an account"));
    }



}
