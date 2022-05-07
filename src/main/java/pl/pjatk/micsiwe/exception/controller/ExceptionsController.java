package pl.pjatk.micsiwe.exception.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.micsiwe.exception.service.ExceptionService;

@RestController
@RequestMapping("/exception")
public class ExceptionsController {
    private final ExceptionService exceptionService;

    public ExceptionsController(ExceptionService exceptionService) {
        this.exceptionService = exceptionService;
    }

    @GetMapping("/runtime")
    public ResponseEntity<String> throwException() {
        this.exceptionService.throwRuntimeException();

        return ResponseEntity.ok().build();
    }
}
