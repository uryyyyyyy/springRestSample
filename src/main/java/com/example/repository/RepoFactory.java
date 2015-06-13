package com.example.repository;

import com.example.repository.repo1.EmployeeRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RepoFactory {

    private RepoFactory() {}

    private static final ApplicationContext context = new ClassPathXmlApplicationContext("repoDI.xml");

    public static final EmployeeRepo employeeRepo = (EmployeeRepo)context.getBean("employeeRepoImpl");

}
