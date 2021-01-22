package org.learning.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.learning.WebDriverParameterResolver;
import org.openqa.selenium.WebDriver;

@ExtendWith(WebDriverParameterResolver.class)
public class BaseTest {

    WebDriver driver;

    @BeforeEach
    void setUp(WebDriver driver) {
        this.driver = driver;
    }

    @AfterEach
    void tearDown(){
        this.driver.quit();
    }

}
