package com.programs.projects.vehicle.model;

public class Employee {

    private  String empId ;
    private String employeeName;
    private String empSalary;
    private String empAddress;
    private String empDesignation;
    private String empType;
    private String remark;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Employee(String empId, String employeeName, String empSalary, String empAddress, String empDesignation, String empType, String remark) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.empSalary = empSalary;
        this.empAddress = empAddress;
        this.empDesignation = empDesignation;
        this.empType = empType;
        this.remark = remark;
    }


    public Employee() {
    }



}
