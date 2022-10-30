package com.allane.leasingassignment.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allane.leasingassignment.model.VehicleInfo;
import com.allane.leasingassignment.service.VehicleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/leasing/vehicle")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addVehicle(@RequestBody final VehicleInfo vehicleInfo) {
        boolean result = vehicleService.addVehicle(vehicleInfo);
        return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

}
