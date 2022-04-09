package pl.pjatk.micsiwe;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/test")
public class BestRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/getEmptyCar")
    public ResponseEntity<Car> getEmptyCar() {
        return ResponseEntity.ok(new Car());
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
        return ResponseEntity.ok(Arrays.toString(someValues.toArray()));
    }

    @PostMapping("/createPOSTCar")
    public ResponseEntity<Car> createPOSTCar(String model, int productionYear) {
        Car car = new Car(model, productionYear);

        return ResponseEntity.ok(car);
    }

    @PostMapping("/createPOSTCar2")
    public ResponseEntity<Car> createPOSTCar2(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
}
