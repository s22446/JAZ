package pl.pjatk.micsiwe.car.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.micsiwe.car.model.Car;
import pl.pjatk.micsiwe.car.service.CarService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/test")
public class CarController {
    public final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(this.carService.getHelloWorldText());
    }

    @GetMapping("/getEmptyCar")
    public ResponseEntity<Car> getEmptyCar() {
        return ResponseEntity.ok(this.carService.getEmptyCarObject());
    }

    @GetMapping("/getInputParam/{someValue}")
    public ResponseEntity<String> getInputParam(@PathVariable("someValue") String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/getRequestInputParam")
    public ResponseEntity<String> getRequestInputParam(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/getRequestInputParamList")
    public ResponseEntity<String> getRequestInputParamList(@RequestParam List<String> someValues) {
        return ResponseEntity.ok(this.carService.getListString(someValues));
    }

    @PostMapping("/createPOSTCar")
    public ResponseEntity<Car> createPOSTCar(String model, int productionYear) {
        return ResponseEntity.ok(this.carService.getCarObject(model, productionYear));
    }

    @PostMapping("/createPOSTCar2")
    public ResponseEntity<Car> createPOSTCar2(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
}
