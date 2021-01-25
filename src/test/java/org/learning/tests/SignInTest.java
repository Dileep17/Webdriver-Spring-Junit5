package org.learning.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.learning.pages.*;
import org.springframework.beans.factory.annotation.Autowired;

public class SignInTest extends BaseTest {

    @Autowired
    LandingPage landingPage;

    @Autowired
    SignInPage signInPage;

    @Test
    void ShouldDisplaySignInSection(){
        landingPage.open();
        landingPage.clickSignInLink();
        Assertions.assertTrue(signInPage.getSignInComponent().isTextDisplayedOnSignInSection("Already registered?"));
    }

}
