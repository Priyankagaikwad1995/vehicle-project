package com.programs.projects.vehicle.controller;

import com.programs.projects.vehicle.model.Vehicle;
import com.programs.projects.vehicle.repo.VehicleRepository;
import com.programs.projects.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    private static final String GET_ALL_VEHICLES = "/form/vehicles";
    private static final String GET_VEHICLES_BY_ID = "/form/vehicles/{id}";
    private static final String ADD_VEHICLES = "/form/add/vehicle";
    private static final String UPDATE_VEHICLES = "/form/update/vehicle";
    private static final String DELETE_VEHICLES ="/form/delete/vehicle";
    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleService vehicleService;

    @GetMapping(value = GET_ALL_VEHICLES, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping(value = GET_VEHICLES_BY_ID, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public Vehicle getVehicleByVehicleID(@PathVariable String id) {
        return vehicleService.getVehicleByID(id);
    }

    @PostMapping(value = ADD_VEHICLES, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public void addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);
    }

    @PutMapping (value = UPDATE_VEHICLES, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public void updateVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.updateVehicle(vehicle);

    }

    @DeleteMapping(value = DELETE_VEHICLES, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_XML_VALUE})
    public void deleteVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.deleteVehicle(vehicle);

    }
}

