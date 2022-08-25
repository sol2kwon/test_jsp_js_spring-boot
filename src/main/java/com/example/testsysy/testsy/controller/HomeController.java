package com.example.testsysy.testsy.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {
    @GetMapping("/")
    public String now(){
        return "Home";
//        return new SimpleDateFormat("YYYY-MM-dd hh:mm:ss").format(new Date());
    }
}
