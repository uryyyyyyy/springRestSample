package com.example.controller;

import com.example.model.Employee;
import com.example.repository.RepoFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiSampleController {

    @RequestMapping(value = "/di",headers="Accept=application/json")
    public @ResponseBody
    List<Employee> getAllEmployees() {
        return RepoFactory.employeeRepo.getAll();
    }

}