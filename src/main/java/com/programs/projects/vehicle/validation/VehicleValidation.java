package com.programs.projects.vehicle.validation;

import com.programs.projects.vehicle.model.Vehicle;
import com.programs.projects.vehicle.repo.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class VehicleValidation {

    public void vehicleValidationConstraint(Vehicle vehicle) throws Exception {
        if (vehicle.getVehicleId()==null){
            throw new Exception("Please enter proper id");
        }

    }


}
