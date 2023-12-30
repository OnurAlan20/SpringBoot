package com.onur.springDemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path ="/hello")
    public String hello(){
        return "Hello backend";
    }

}
