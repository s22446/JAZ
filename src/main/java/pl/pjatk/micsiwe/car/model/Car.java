package pl.pjatk.micsiwe.car.model;

public class Car {
    private String model;
    private int productionYear;

    public Car() {
        this.model = "";
        this.productionYear = 0;
    }

    public Car(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
