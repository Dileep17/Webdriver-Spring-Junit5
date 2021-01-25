package org.learning.tests;

import org.junit.jupiter.api.extension.ExtendWith;
import org.learning.config.ComponentScanConfig;
import org.learning.config.CustomScopeRegisteringBean;
import org.learning.listeners.CustomTestExecutionListener;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ComponentScanConfig.class, CustomScopeRegisteringBean.class})
@TestExecutionListeners(value = {
        CustomTestExecutionListener.class,
        DependencyInjectionTestExecutionListener.class
})
public class BaseTest {

}
