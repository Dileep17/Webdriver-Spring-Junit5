package org.learning.pages.utils;

import org.apache.commons.io.FileUtils;
import org.learning.config.Constants;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.test.util.AopTestUtils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

@Component
@Scope(value = "threadScope")
public class ScreenshotManager {

    WebDriver driver;
    TakesScreenshot screenshot;

    public  ScreenshotManager(WebDriver driver){
        this.driver = driver;
        screenshot = AopTestUtils.getTargetObject(driver);
    }

    public void takeScreenShot(String name) throws IOException {
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(Constants.SCREENSHOT_DIRECTORY + "/" + name + new Random().nextInt() + ".png"));
    }

}
