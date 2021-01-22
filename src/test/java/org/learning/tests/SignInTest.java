package org.learning.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.learning.pages.*;

public class SignInTest extends BaseTest {

    LandingPage landingPage;
    SignInPage signInPage;

    @BeforeEach
    void setUp(){
        landingPage = new LandingPage(driver);
        signInPage = new SignInPage(driver);
    }

    @Test
    void ShouldDisplaySignInSection(){
        landingPage.open();
        landingPage.clickSignInLink();
        Assertions.assertTrue(signInPage.getSignInComponent().isTextDisplayedOnSignInSection("Already registered?"));
    }

}
