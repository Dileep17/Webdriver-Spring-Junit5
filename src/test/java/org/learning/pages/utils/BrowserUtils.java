package org.learning.pages.utils;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "threadScope")
public class BrowserUtils {

    @Autowired
    WebDriver driver;

    public void reset() {
        driver.manage().deleteAllCookies();
    }
}
