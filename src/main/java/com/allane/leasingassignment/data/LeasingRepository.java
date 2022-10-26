package com.allane.leasingassignment.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LeasingRepository extends JpaRepository<LeasingEntity, Long> {
}