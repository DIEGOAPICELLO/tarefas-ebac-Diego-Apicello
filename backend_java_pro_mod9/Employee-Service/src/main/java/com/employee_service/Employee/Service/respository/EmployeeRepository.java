package com.employee_service.Employee.Service.respository;

import com.employee_service.Employee.Service.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
