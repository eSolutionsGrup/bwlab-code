package bwlab.borg1.borgwarner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BorgwarnerApplication {



    @GetMapping
    public String helloWorld() {
        return "revision 1 ";
    }

}
