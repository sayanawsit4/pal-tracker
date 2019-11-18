package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    //comments
    public String msg;

    public WelcomeController(@Value("${welcome.test:Hello from test}") String test) {
        this.msg = test;
    }

    @GetMapping("/")
    public String sayHello() {
        return msg;
    }

}
