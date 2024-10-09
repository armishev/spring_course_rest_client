package com.kirillarmishev.spring.rest;

import com.kirillarmishev.spring.rest.configuration.MyConfig;
import com.kirillarmishev.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
//        Employee empByID=communication.getEmployee(1);
//        System.out.println(empByID);
//        Employee emp = new Employee("Sergei", "Ivanov", "IT", 1800);
//        emp.setId(13);
//        communication.deleteEmployee(5);
    }
}
