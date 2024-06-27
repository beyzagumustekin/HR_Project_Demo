package com.example.HR.service;

import com.example.HR.model.Employee;
import com.example.HR.model.repository.EmployeeRepossitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepossitory employeeRepossitory;

    public Employee hireEmployee(Employee employee){
        return employeeRepossitory.save(employee);
    }
    public List<Employee>getEmployeesAll(){
        return employeeRepossitory.findAll();
    }
    public Optional<Employee>getEmployeeByld(Long id){
        return employeeRepossitory.findById(id);
    }
    public Employee updateEmployee(Long id,Employee employeeDetails){
        Employee employee = employeeRepossitory.findById(id).orElseThrow(()->new RuntimeException("Çalışan bulunamadı"));
    employee.setName(employeeDetails.getName());
    employee.setPosition(employeeDetails.getPosition());
    return employeeRepossitory.save(employee);
    }
public void fireEmployee(Long id){
    Employee employee = employeeRepossitory.findById(id).orElseThrow(()-> new RuntimeException("Employee not found!"));
    employeeRepossitory.delete(employee);
    }
}
