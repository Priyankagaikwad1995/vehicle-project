package com.programs.projects.vehicle.controller;

import com.programs.projects.vehicle.model.Vehicle;
import com.programs.projects.vehicle.repo.VehicleRepository;
import com.programs.projects.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/form/vehicles")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/form/vehicles/{id}")
    public Vehicle getVehicleByVehicleID(@PathVariable String id) {
        return vehicleService.getVehicleByID(id);
    }

    @PostMapping("/form/add/vehicle")
    public void addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);
    }

    @PutMapping ("/form/update/vehicle")
    public void updateVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.updateVehicle(vehicle);

    }

    @DeleteMapping("/form/delete/vehicle")
    public void deleteVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.deleteVehicle(vehicle);

    }
}

