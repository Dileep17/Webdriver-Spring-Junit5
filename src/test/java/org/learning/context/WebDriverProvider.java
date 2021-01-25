package org.learning.context;

import org.learning.config.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class WebDriverProvider {

    @Autowired
    BeanRegister beanRegister;

    @Bean
    @Scope(value = "threadScope")
    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
        WebDriver driver =  new ChromeDriver();
        beanRegister.register(driver);
        return driver;
    }

}
