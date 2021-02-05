package example.controller;

import example.annotation.MyAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @MyAnnotation
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
