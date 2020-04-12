package com.programs.projects.vehicle.service;
import com.programs.projects.vehicle.model.Employee;
import com.programs.projects.vehicle.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    public Employee getEmployeeByID(String id) {
        return employeeRepository.getEmployeeByID(id);
    }

    public void addEmployee(Employee employee) {
         employeeRepository.addEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
         employeeRepository.updateEmployee(employee);
    }

    public void deleteEmployee(Employee employee) {
         employeeRepository.deleteEmployee(employee);
    }
}
