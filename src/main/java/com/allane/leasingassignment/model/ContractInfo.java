package com.allane.leasingassignment.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContractInfo {
    private Long contractNo;
    private CustomerInfo customer;
    private VehicleInfo vehicle;
    private BigDecimal monthlyRate;
    private BigDecimal vehiclePrice;
}
