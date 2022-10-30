package com.allane.leasingassignment.service;

import java.util.Optional;

import com.allane.leasingassignment.data.CustomerEntity;
import com.allane.leasingassignment.data.CustomerRepoısitory;
import com.allane.leasingassignment.model.CustomerInfo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepoısitory customerRepository;

    @Transactional
    public void createUser() {
        customerRepository.save(new CustomerEntity());
    }

    @Transactional
    public boolean updateUser(Long customerId, CustomerInfo customerUpdateRequest) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
        if (customerEntity.isPresent()) {
            customerEntity.get().setFirstName(customerUpdateRequest.getFirstName());
            customerEntity.get().setLastName(customerUpdateRequest.getLastName());
            customerEntity.get().setBirthDate(customerUpdateRequest.getBirthDate());
            customerRepository.save(customerEntity.get());
        }

        return true;
    }
    @Transactional
    public Optional<CustomerInfo> retrieveUser(Long customerId) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
        return customerEntity.map(entity -> CustomerInfo.builder()
                                                        .firstName(entity.getFirstName())
                                                        .lastName(entity.getLastName())
                                                        .birthDate(entity.getBirthDate())
                                                        .build());

    }


}
