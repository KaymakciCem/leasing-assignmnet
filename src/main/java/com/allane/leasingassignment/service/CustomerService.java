package com.allane.leasingassignment.service;

import com.allane.leasingassignment.data.CustomerEntity;
import com.allane.leasingassignment.data.CustomerRepoısitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepoısitory customerRepoısitory;

    @Transactional
    public void createUser() {
        customerRepoısitory.save(new CustomerEntity());
    }

    @Transactional
    public void retrieveUser() {
        customerRepoısitory.findById(1L);
    }


}
