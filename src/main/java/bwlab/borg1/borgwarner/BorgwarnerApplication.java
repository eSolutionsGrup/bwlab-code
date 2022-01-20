package bwlab.borg1.borgwarner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BorgwarnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BorgwarnerApplication.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "revision 1";
    }

}
