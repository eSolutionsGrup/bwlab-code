package bwlab.borg1.borgwarner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class BorgwarnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BorgwarnerApplication.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

}
