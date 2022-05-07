package pl.pjatk.micsiwe.exception.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionsController {
    @GetMapping("/runtime")
    public ResponseEntity<String> throwException() {
        throw new RuntimeException("You've got an error you fool");
    }
}
