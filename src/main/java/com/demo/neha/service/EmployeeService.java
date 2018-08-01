package com.demo.neha.service;

import com.demo.neha.model.Employee;

import java.util.List;

/**
 * Created by govind on 01-08-2018.
 */
public interface EmployeeService {

    Employee findById(int eid);
    Employee findByName(String ename);
    void saveEmployee(Employee employee);

    List<Employee> getAllEmployee();






}
