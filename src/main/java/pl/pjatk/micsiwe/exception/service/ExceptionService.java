package pl.pjatk.micsiwe.exception.service;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {
    public void throwRuntimeException() {
        throw new RuntimeException("You've got an error you fool");
    }
}
