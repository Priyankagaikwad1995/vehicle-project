package com.programs.projects.vehicle.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Vehicle {

    @NotNull
    private  String vehicleId ;
    private String vehicleName;
    private String vehicleNo;
    private String contractNo;
    private String refDocumentNo;
    private String vehicleType;
    private String remark;
    @NotNull
    @Length(min=10,max=10,message = "Please enter 10 digit mobile no")
    private String mobileNo;
    @Email
    private String emailId;

    public Vehicle() {
    }

    public Vehicle(String vehicleId, String vehicleName, String vehicleNo, String contractNo, String refDocumentNo, String vehicleType, String remark, String mobileNo, String emailId) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleNo = vehicleNo;
        this.contractNo = contractNo;
        this.refDocumentNo = refDocumentNo;
        this.vehicleType = vehicleType;
        this.remark = remark;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getRefDocumentNo() {
        return refDocumentNo;
    }

    public void setRefDocumentNo(String refDocumentNo) {
        this.refDocumentNo = refDocumentNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "VehicleModel{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", contractNo='" + contractNo + '\'' +
                ", refDocumentNo='" + refDocumentNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", remark='" + remark + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
