package com.demo.neha.controller;

import com.demo.neha.model.Employee;
import com.demo.neha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;

/**
 * Created by govind on 01-08-2018.
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

   @RequestMapping(value = "/govind")

    public String Employee(){

        return "HI Employee";

    }
    @RequestMapping(value = "/emp")
     public String m1(){

         return "hello";
}
     @RequestMapping(value = "/sa")
     public int m2(){

         return 2;

     }
    @RequestMapping(value = "/employee/{eid}")
    public Employee findById(@PathVariable("eid") int eid)
    {

      Employee employee=  employeeService.findById(eid);
        return  employee;

    }
    @RequestMapping(value = "/employee")
    public List<Employee> getAll()
    {
      return  employeeService.getAllEmployee();
    }


      }

