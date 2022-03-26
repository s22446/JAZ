package pl.pjatk.micsiwe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstComponent {

    public FirstComponent(@Value("${my.custom.propertyy:my default property}") String valueFromProperties,
                          @Value("${my.property.yml}") String valueFromYmlProperties) {
        System.out.println(valueFromProperties);
        System.out.println(valueFromYmlProperties);
        System.out.println("First Component");
    }

    public void printHelloMessage() {
        System.out.println("First Component hello from second component");
    }

    public void introduceYourself() {
        System.out.println("Klasa: " + this.getClass().getName() + "; Metoda: " +
                "introduceYourself");
    }
}
