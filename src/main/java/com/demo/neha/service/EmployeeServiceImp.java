package com.demo.neha.service;

import com.demo.neha.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by govind on 01-08-2018.
 */
@Service("employeeService")
public class EmployeeServiceImp implements EmployeeService {





    @Override
    public Employee findById(int eid) {
        for (Employee employee:getdummydata())
        {
            if(employee.getEid()==eid)
                return  employee;
        }

        return null;
    }

    @Override
    public Employee findByName(String ename) {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public List<Employee> getAllEmployee() {
        return getdummydata();
    }

     private static List<Employee> getdummydata(){
      List<Employee>  employees = new ArrayList<>();
        employees.add(new Employee(1,"Hyd","na",10000));
        employees.add(new Employee(2,"Hyd","go",10000));
        employees.add(new Employee(3,"Hyd","vi",10000));
        employees.add(new Employee(4,"Hyd","nd",10000));

        return employees;





    }



}














