package com.programs.projects.vehicle.controller;
import com.programs.projects.vehicle.model.Employee;
import com.programs.projects.vehicle.service.EmployeeService;
import com.programs.projects.vehicle.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository employeeRepository;


    @Autowired
    private EmployeeService employeeService;

    private static final String GET_ALL_EMPLOYEES = "/form/employee";
    private static final String GET_EMPLOYEE_BY_ID = "/form/employee/{id}";
    private static final String ADD_EMPLOYEE = "/form/add/employee";
    private static final String UPDATE_EMPLOYEE = "/form/update/employee";
    private static final String DELETE_EMPLOYEE ="/form/delete/employee";

    @GetMapping(value = GET_ALL_EMPLOYEES, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public List<Employee> getAllEmployee() {
        logger.debug("Get All Employees api called.");
        return employeeService.getAllEmployee();
    }

    @GetMapping(value = GET_EMPLOYEE_BY_ID, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public Employee getEmployeeByEmployeeID(@PathVariable String id) {
        logger.debug("Get Employee Api called for employee Id: {}", id);
        return employeeService.getEmployeeByID(id);
    }
    @PostMapping(value = ADD_EMPLOYEE, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public void addVehicle(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping (value = UPDATE_EMPLOYEE, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public void updateVehicle(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);

    }

    @DeleteMapping(value = DELETE_EMPLOYEE, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public void deleteVehicle(@RequestBody Employee employee) {
        employeeService.deleteEmployee(employee);

    }

}
