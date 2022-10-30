package com.allane.leasingassignment.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allane.leasingassignment.model.ContractInfo;
import com.allane.leasingassignment.model.ContractOverview;
import com.allane.leasingassignment.model.CustomerInfo;
import com.allane.leasingassignment.model.VehicleInfo;
import com.allane.leasingassignment.service.LeasingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/leasing")
@RequiredArgsConstructor
public class ContractController {

    private final LeasingService leasingService;

    @GetMapping(value = "/contractOverview", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ContractOverview>> getAllContracts() {
//        ContractOverview overview1 = ContractOverview.builder()
//                                                     .customer("cem")
//                                                     .vehicle("BMW")
//                                                     .vin("12345")
//                                                     .contractNo(123L)
//                                                     .monthlyRate(BigDecimal.TEN)
//                                                     .vehiclePrice(BigDecimal.TEN)
//                                                     .build();
//
//        ContractOverview overview2 = ContractOverview.builder()
//                                                     .customer("elif")
//                                                     .vehicle("Mercedes")
//                                                     .vin("")
//                                                     .contractNo(124L)
//                                                     .monthlyRate(BigDecimal.TEN)
//                                                     .vehiclePrice(BigDecimal.TEN)
//                                                     .build();
//
//        List<ContractOverview> contractInfos = List.of(overview1, overview2);

        List<ContractOverview> allContracts = leasingService.getAllContracts();

        return ResponseEntity.ok(allContracts);
    }

    @GetMapping(value = "/contract/{contractId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ContractInfo> getContract(@PathVariable("contractId") final Long contractId) {
        List<ContractInfo> contractInfos = List.of(new ContractInfo(1L, CustomerInfo.builder()
                                                                                    .firstName("Cem")
                                                                                    .lastName("kkk")
                                                                                    .birthDate(LocalDate.now())
                                                                                    .build(),
                                                                    VehicleInfo.builder()
                                                                               .brand("brand")
                                                                               .model("model")
                                                                               .vin("")
                                                                               .year(1234)
                                                                               .price(BigDecimal.TEN)
                                                                               .build(),
                                                                    BigDecimal.valueOf(100),
                                                                    BigDecimal.valueOf(10_000)));
        return ResponseEntity.ok(contractInfos.get(0));
    }

    @GetMapping(value = "/contract/details/{contractId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ContractInfo> getContractDetails(@PathVariable("contractId") final Long contractId) {
        List<ContractInfo> contractInfos = List.of(new ContractInfo(1L, CustomerInfo.builder()
                                                                                    .firstName("Cem")
                                                                                    .lastName("kkk")
                                                                                    .birthDate(LocalDate.now())
                                                                                    .build(),
                                                                    VehicleInfo.builder()
                                                                               .brand("brand")
                                                                               .model("model")
                                                                               .vin("")
                                                                               .year(1234)
                                                                               .price(BigDecimal.TEN)
                                                                               .build(),
                                                                    BigDecimal.valueOf(100),
                                                                    BigDecimal.valueOf(10_000)));
        return ResponseEntity.ok(contractInfos.get(0));
    }



}
