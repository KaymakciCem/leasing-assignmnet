package com.allane.leasingassignment.data;

import com.allane.leasingassignment.LeasingAssignmentApplication;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CustomerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    @OneToMany(mappedBy = "customer",
            cascade = CascadeType.ALL,
            fetch= FetchType.EAGER)
    Set<LeasingEntity> leasing;
}
