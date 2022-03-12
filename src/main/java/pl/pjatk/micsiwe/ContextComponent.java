package pl.pjatk.micsiwe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ContextComponent {

    public ContextComponent(ApplicationContext applicationContext) {
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("Beans.xml");
        XbeanComponent xbeanComponent = applicationContext2.getBean("xbeanComponent", XbeanComponent.class);

        FirstComponent first = applicationContext.getBean("firstComponent", FirstComponent.class);
        SecondComponent second = applicationContext.getBean("secondComponent", SecondComponent.class);

        first.introduceYourself();
        second.introduceYourself();
        xbeanComponent.introduceYourself();
    }
}
