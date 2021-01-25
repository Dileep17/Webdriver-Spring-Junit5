package org.learning.listeners;

import org.learning.pages.utils.BrowserUtils;
import org.learning.pages.utils.ScreenshotManager;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class CustomTestExecutionListener extends AbstractTestExecutionListener {

    public void afterTestExecution(TestContext testContext) throws Exception {
        // clear browser cache btw test
        BrowserUtils browserUtils = testContext.getApplicationContext().getBean(BrowserUtils.class);
        browserUtils.reset();

        // take screenshot incase of failure
        if(testContext.getTestException() != null){
            ScreenshotManager screenshotManager =  testContext.getApplicationContext().getBean(ScreenshotManager.class);
            screenshotManager.takeScreenShot(testContext.getTestMethod().getName());
        }

    }
}
