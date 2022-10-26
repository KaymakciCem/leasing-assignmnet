package com.allane.leasingassignment.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class VehicleEntity {

    @Id
    private long id;

    private String brand;

    private String model;

    private int modelYear;

    private String vehicleIdentificationNo;

    private BigDecimal price;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private LeasingEntity leasing;
}
