package lazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * https://dev.to/gofabian/dockerize-spring-boot-80mb-58m9
 */

@SpringBootApplication
@RestController
public class SpringBootApp {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

}

