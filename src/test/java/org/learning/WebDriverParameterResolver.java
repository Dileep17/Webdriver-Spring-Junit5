package org.learning;

import org.junit.jupiter.api.extension.*;
import org.learning.config.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverParameterResolver implements ParameterResolver {

    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType().equals(WebDriver.class);
    }

    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
        WebDriver driver =  new ChromeDriver();
        return driver;
    }
}
