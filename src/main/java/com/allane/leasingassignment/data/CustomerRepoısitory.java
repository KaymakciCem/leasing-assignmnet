package com.allane.leasingassignment.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepoısitory  extends JpaRepository<CustomerEntity, Long> {
}