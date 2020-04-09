package com.programs.projects.vehicle.repo;

import com.programs.projects.vehicle.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.*;

import static java.util.Optional.*;

@Repository
public class VehicleRepository {

    private static List<Vehicle> vehicles = new ArrayList<>(Arrays.asList(
            new Vehicle("101", "abc", "0001", "10001", "VH-333", "Owned", "test", "1234567890", "as@gmail.com"),
            new Vehicle("102", "pqr", "0002", "10002", "VH-444", "Rented", "test1", "1289867890", "ads@gmail.com")

    ));

    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void updateVehicle(Vehicle vehicle) {
        System.out.println("Vehicle details : " + vehicle);
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            if (v.getVehicleId().equals(vehicle.getVehicleId())) {
                updateVehicleObject(vehicle, v);
                break;
            }
        }
    }

    private void updateVehicleObject(Vehicle vehicleInput, Vehicle vehicleOutput) {
        ofNullable(vehicleInput.getVehicleNo()).ifPresent(value -> vehicleOutput.setVehicleNo(value));
        ofNullable(vehicleInput.getVehicleName()).ifPresent(value -> vehicleOutput.setVehicleName(value));
        ofNullable(vehicleInput.getVehicleType()).ifPresent(value -> vehicleOutput.setVehicleType(value));
        ofNullable(vehicleInput.getMobileNo()).ifPresent(value -> vehicleOutput.setMobileNo(value));
        ofNullable(vehicleInput.getContractNo()).ifPresent(value -> vehicleOutput.setContractNo(value));
        ofNullable(vehicleInput.getEmailId()).ifPresent(value -> vehicleOutput.setEmailId(value));
        ofNullable(vehicleInput.getRefDocumentNo()).ifPresent(value -> vehicleOutput.setRefDocumentNo(value));
        ofNullable(vehicleInput.getRemark()).ifPresent(value -> vehicleOutput.setRemark(value));

//
//        if (Objects.nonNull(vehicleInput.getMobileNo())) {
//            vehicleOutput.setMobileNo(vehicleInput.getMobileNo());
//        }
//        if (vehicleInput.getContractNo() != null) {
//            vehicleOutput.setContractNo(vehicleInput.getContractNo());
//        }
//        if (vehicleInput.getEmailId() != null) {
//            vehicleOutput.setEmailId(vehicleInput.getEmailId());
//        }
//        if (vehicleInput.getRefDocumentNo() != null) {
//            vehicleOutput.setRefDocumentNo(vehicleInput.getRefDocumentNo());
//        }
//        if (vehicleInput.getRemark() != null) {
//            vehicleOutput.setRemark(vehicleInput.getRemark());
//        }
//        if (vehicleInput.getVehicleName() != null) {
//            vehicleOutput.setVehicleName(vehicleInput.getVehicleName());
//        }
//        if (vehicleInput.getVehicleNo() != null) {
//            vehicleOutput.setVehicleNo(vehicleInput.getVehicleNo());
//        }
//        if (vehicleInput.getVehicleType() != null) {
//            vehicleOutput.setVehicleType(vehicleInput.getVehicleType());
//        }
    }

    public void deleteVehicle(Vehicle vehicle) {
        vehicles.removeIf(v -> v.getVehicleId().equals(vehicle.getVehicleId()));
    }
}
