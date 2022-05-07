package pl.pjatk.micsiwe.car.service;

import org.springframework.stereotype.Service;
import pl.pjatk.micsiwe.car.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    public String getHelloWorldText() {
        return "Hello world";
    }

    public Car getEmptyCarObject() {
        return new Car();
    }

    public Car getCarObject(String model, int productionYear) {
        return new Car(model, productionYear);
    }

    public String getListString(List list) {
        return Arrays.toString(list.toArray());
    }
}
