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
public class VehicleInfo {
    private String brand;
    private String model;
    private int year;
    private String vin;
    private BigDecimal price;
}