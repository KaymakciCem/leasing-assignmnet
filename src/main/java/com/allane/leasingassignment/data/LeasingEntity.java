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
public class LeasingEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long contractNumber;

    private BigDecimal monthlyRate;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "customer_id")
    CustomerEntity customer;

    @OneToOne(mappedBy = "leasing", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private VehicleEntity vehicle;
}
