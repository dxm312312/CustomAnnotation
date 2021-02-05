package example.controller;

import example.annotation.MyAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @MyAnnotation
    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        System.out.println(1111);
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2(@RequestParam String name){
        System.out.println(2222);
        return "hello";
    }
}
