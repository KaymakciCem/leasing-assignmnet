package com.allane.leasingassignment.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
