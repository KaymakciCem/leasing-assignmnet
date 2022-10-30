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
@Table(name = "vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String brand;

    private String model;

    private int modelYear;

    private String vehicleIdentificationNo;

    private BigDecimal price;
//
//    @OneToOne(mappedBy = "vehicle")
//    private ContractEntity contract;


    @OneToOne(mappedBy = "vehicle", cascade = CascadeType.ALL,
              fetch = FetchType.LAZY, optional = false)
    private ContractEntity contract;

}
