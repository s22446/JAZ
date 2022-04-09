package pl.pjatk.micsiwe;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/homework")
public class EvenBetterController {

    @GetMapping({"/methodGET/{pathValue}", "/methodGET"})
    public ResponseEntity<String> methodGET(
            @PathVariable(name="pathValue") Optional<String> pathValue,
            @RequestParam(required=false) Optional<String> requestValue
    ) {

    }
}
