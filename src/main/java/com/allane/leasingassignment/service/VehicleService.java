package com.allane.leasingassignment.service;

import com.allane.leasingassignment.data.VehicleEntity;
import com.allane.leasingassignment.data.VehicleRepository;
import com.allane.leasingassignment.model.VehicleInfo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public boolean addVehicle(VehicleInfo vehicleInfo) {

        VehicleEntity vehicle = new VehicleEntity();
        vehicle.setBrand(vehicleInfo.getBrand());
        vehicle.setModel(vehicleInfo.getModel());
        vehicle.setModelYear(vehicleInfo.getYear());
        vehicle.setVehicleIdentificationNo(vehicleInfo.getVin());
        vehicle.setPrice(vehicleInfo.getPrice());

        vehicleRepository.save(vehicle);
        return true;
    }
}
