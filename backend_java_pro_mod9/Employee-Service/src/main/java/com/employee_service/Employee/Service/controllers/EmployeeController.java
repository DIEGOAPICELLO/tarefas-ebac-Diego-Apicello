package com.employee_service.Employee.Service.controllers;

import com.employee_service.Employee.Service.entities.Employee;
import com.employee_service.Employee.Service.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllFuncionarios() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> findById (@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public Employee createFuncionario (@RequestBody Employee employee) {
        return employeeService.saveFuncionario(employee);
    }

    @PutMapping("/{id}")
    public Employee updateFuncionario (@PathVariable Long id , @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.saveFuncionario(employee);
    }

    @DeleteMapping("/{id}")
    public void deletarFuncionar (@PathVariable Long id) {
        employeeService.deleteById(id);
    }

}
