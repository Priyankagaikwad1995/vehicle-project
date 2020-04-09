package com.programs.projects.vehicle.service;

import com.programs.projects.vehicle.model.Vehicle;
import com.programs.projects.vehicle.repo.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle getVehicleByID(String id) {
        return null;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.getAllVehicles();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.addVehicle(vehicle);
    }

    public void updateVehicle(Vehicle vehicle) {
        vehicleRepository.updateVehicle(vehicle);
    }

    public void deleteVehicle(Vehicle vehicle) {
        vehicleRepository.deleteVehicle(vehicle);
    }
    }

