package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class myController {

    @RequestMapping("m")
    public static String myMethod(){
        return "<h1>Welcome to app<h1>";
    }

    // @GetMapping("process-formate")
    // public static String getData(@RequestParam int num1,@RequestParam int num2) {
    //     int res = num1 + num2;
    //     // return "hello world process form" + String.valueOf(res);
    //     return "<h1> Resul =  " +  res + "</h1>";
    // }

    @PostMapping("process-formate")
    public static String getData(@RequestParam int num1,@RequestParam int num2) {
        int res = num1 + num2;
        // return "hello world process form" + String.valueOf(res);
        return "<h1> Resul =  " +  res + "</h1>";
    }
    
}
