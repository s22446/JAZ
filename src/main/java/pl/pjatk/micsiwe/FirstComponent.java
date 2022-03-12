package pl.pjatk.micsiwe;

import org.springframework.stereotype.Component;

@Component
public class FirstComponent {

    public FirstComponent() {
        System.out.println("First Component");
    }

    public void printHelloMessage() {
        System.out.println("First Component hello from second component");
    }

    public void introduceYourself() {
        System.out.println("Klasa: " + this.getClass().getName() + "; Metoda: " + this.getClass().getMethods()[1].getName());
    }
}
