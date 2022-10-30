package com.allane.leasingassignment.controller;

import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allane.leasingassignment.model.CustomerInfo;
import com.allane.leasingassignment.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/leasing/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PutMapping(value = "/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateCustomer(@PathVariable("customerId") Long customerId,
                                               @RequestBody CustomerInfo customerUpdateRequest) {
        boolean result = customerService.updateUser(customerId, customerUpdateRequest);
        return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerInfo retrieveCustomer(@PathVariable("customerId") Long customerId) {
        return customerService.retrieveUser(customerId).get();
    }

}
