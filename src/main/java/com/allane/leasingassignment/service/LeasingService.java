package com.allane.leasingassignment.service;

import java.util.ArrayList;
import java.util.List;

import com.allane.leasingassignment.data.ContractEntity;
import com.allane.leasingassignment.data.LeasingRepository;
import com.allane.leasingassignment.model.ContractOverview;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LeasingService {

    private final LeasingRepository leasingRepository;

    public List<ContractOverview> getAllContracts() {
        List<ContractEntity> leasingEntities = leasingRepository.findAll();

        List<ContractOverview> response = new ArrayList<>();

        leasingEntities.forEach(c -> {
            ContractOverview contractOverview = ContractOverview.builder()
                                                                .contractNo(c.getContractNumber())
                                                                .customer(c.getCustomer().getFirstName() + " " + c.getCustomer().getLastName())
                                                                .vin(c.getVehicle().getVehicleIdentificationNo())
                                                                .vehiclePrice(c.getVehicle().getPrice())
                                                                .monthlyRate(c.getMonthlyRate())
                                                                .build();
            response.add(contractOverview);
        });

        return response;
    }
}
