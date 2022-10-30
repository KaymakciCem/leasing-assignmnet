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
@Table(name = "contract")
public class ContractEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long contractNumber;

    private BigDecimal monthlyRate;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "customer_id")
    CustomerEntity customer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    private VehicleEntity vehicle;

}
