package com.programs.projects.vehicle.repo;
import com.programs.projects.vehicle.model.Employee;
import com.programs.projects.vehicle.service.EmployeeService;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;
import static java.util.Optional.ofNullable;

@Repository
public class EmployeeRepository {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeRepository.class);

    private static List<Employee> Employees = new ArrayList<>(Arrays.asList(
            new Employee("101", "abc", "55000", "Satara", "Software Engineer", "Owned", "test"),
            new Employee("102", "pqr", "40000", "Pune", "Tester", "Rented", "test1")

    ));

    public List<Employee> getAllEmployee() {
        return Employees;
    }

    public void addEmployee(Employee employee) {
        Employees.add(employee);
    }

    public void updateEmployee(Employee employee) {
        logger.debug("Employee Details : {} ", employee);
        for (int i = 0; i < Employees.size(); i++) {
            Employee e = Employees.get(i);
            if (e.getEmpId().equals(employee.getEmpId())) {
                updateEmployeeObject(employee, e);
                break;
            }
        }
        logger.info("Employee is updated successfully. Employee Details : {}", employee);
    }

    public void deleteEmployee(Employee employee) {
        Employees.removeIf(e -> e.getEmpId().equals(employee.getEmpId()));
    }

    private void updateEmployeeObject(Employee employeeInput, Employee employeeOutput) {
        ofNullable(employeeInput.getEmployeeName()).ifPresent(value -> employeeOutput.setEmployeeName(value));
        ofNullable(employeeInput.getEmpAddress()).ifPresent(value -> employeeOutput.setEmpAddress(value));
        ofNullable(employeeInput.getEmpDesignation()).ifPresent(value -> employeeOutput.setEmpDesignation(value));
        ofNullable(employeeInput.getEmpSalary()).ifPresent(value -> employeeOutput.setEmpSalary(value));
        ofNullable(employeeInput.getEmpType()).ifPresent(value -> employeeOutput.setEmpType(value));
        ofNullable(employeeInput.getRemark()).ifPresent(value -> employeeOutput.setRemark(value));
    }
    public Employee getEmployeeByID(String id) {
      return Employees.stream().filter(e -> e.getEmpId().equals(id)).findFirst().get();
    }
}