package pl.pjatk.micsiwe;

import org.springframework.stereotype.Component;

@Component
public class SecondComponent {
    public SecondComponent(FirstComponent firstComponent) {
        firstComponent.printHelloMessage();
        System.out.println("Second Component");
    }

    public void introduceYourself() {
        System.out.println("Klasa: " + this.getClass().getName() + "; Metoda: " + this.getClass().getMethods()[0].getName());
    }
}
