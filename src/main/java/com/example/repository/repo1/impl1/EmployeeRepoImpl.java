package com.example.repository.repo1.impl1;

import com.example.model.Employee;
import com.example.repository.repo1.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo {

    private EmployeeRepoImpl() {}

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,"Lokesh","Gupta","howtodoinjava@gmail.com"));
        employees.add(new Employee(2,"Amit","Singhal","asinghal@yahoo.com"));
        employees.add(new Employee(3,"Kirti","Mishra","kmishra@gmail.com"));
        return employees;
    }
}
