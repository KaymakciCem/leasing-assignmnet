package com.allane.leasingassignment.service;

import com.allane.leasingassignment.data.LeasingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LeasingService {
    private final LeasingRepository leasingRepository;
}
