package az.ingress.devopsdemo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsDemoController {

    @RequestMapping("/api/devops")
    public String sayHello() {
        return "Hello DevOps!";
    }
}
