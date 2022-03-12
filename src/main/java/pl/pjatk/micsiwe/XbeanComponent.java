package pl.pjatk.micsiwe;

public class XbeanComponent {
    public void introduceYourself() {
        System.out.println("Klasa: " + this.getClass().getName() + "; Metoda: " + this.getClass().getMethods()[0].getName());
    }
}
