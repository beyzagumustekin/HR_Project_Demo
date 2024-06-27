package com.example.HR.service;

import com.example.HR.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Bu anotasyon, bu sınıfın bir control sınıfı/RESTful web servisi olduğunu belirtir.
@RequestMapping("/api/employees") // Temel URL'ini belirtir.

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/hire")// Bu anotasyon ile işaretlenen bu metot, bir çalışanı işe almak için kullanılır.
    public Employee hireEmployee(@RequestBody Employee employee) {
        return employeeService.hireEmployee(employee);
    }

    @GetMapping /* Çalışanları getirmek için service sınfımızdan oluşturduğumuz "getAllEmployees"
     metotu çağırarak döndürüyoruz.*/
    public List<Employee> getAllEmployees() {
        return employeeService.getEmployeesAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeByld(id);
    }

    @PutMapping("/{id}")/* Belitilen kimlikteki çalışan bilgilerini bu metot
    ile update/güncelliyoruz.*/
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return employeeService.updateEmployee(id, employeeDetails);
    }

    @DeleteMapping("/fire/{id}")
    public void fireEmployee(@PathVariable Long id) {
        employeeService.fireEmployee(id);
    }
}
