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
public class ContractOverview {
    private Long contractNo;
    private String customer;
    private String vehicle;
    private String vin;
    private BigDecimal monthlyRate;
    private BigDecimal vehiclePrice;
}
