package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}