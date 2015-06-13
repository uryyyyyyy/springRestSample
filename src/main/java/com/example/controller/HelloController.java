package com.example.controller;

import com.example.model.Employee;
import lombok.val;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/",headers="Accept=application/json")
    public @ResponseBody Employee getEmployees() {
        val empOne = new Employee(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
        return empOne;
    }

}