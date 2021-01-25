package org.learning.context;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;
import java.util.HashSet;
import java.util.Set;

@Component
public class BeanRegister {

    private Set<WebDriver> beans= new HashSet<WebDriver>();

    public void register(WebDriver bean) {
        beans.add(bean);
    }

    @PreDestroy
    public void clean() {
        for (WebDriver bean : beans) {
            bean.quit();
        }
    }
}
