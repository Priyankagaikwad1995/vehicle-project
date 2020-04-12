 package com.programs.projects.vehicle.service;
import com.programs.projects.vehicle.model.Employee;
import com.programs.projects.vehicle.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class EmployeeService {
        private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

        @Autowired
        private EmployeeRepository employeeRepository;

        public List<Employee> getAllEmployee() {
            return employeeRepository.getAllEmployee();
        }

        public Employee getEmployeeByID(String id) {
            return employeeRepository.getEmployeeByID(id);
        }


        public void addEmployee(Employee employee) {
            logger.debug("Employee Details : {} ", employee);
            employeeRepository.addEmployee(employee);
            logger.info("Employee is added successfully. Employee Details : {}", employee);
        }

        public void updateEmployee(Employee employee) {
            employeeRepository.updateEmployee(employee);
        }

        public void deleteEmployee(Employee employee) {
            employeeRepository.deleteEmployee(employee);
        }
    }