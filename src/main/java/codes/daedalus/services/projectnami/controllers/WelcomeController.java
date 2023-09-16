package codes.daedalus.services.projectnami.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/welcome", produces = MediaType.APPLICATION_JSON_VALUE)
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Nami: If you think I'm just another cute girl, you're dead wrong!");
    }

}
