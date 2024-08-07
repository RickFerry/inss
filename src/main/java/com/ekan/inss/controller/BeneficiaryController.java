package com.ekan.inss.controller;

import com.ekan.inss.model.Beneficiary;
import com.ekan.inss.model.dto.BeneficiaryDTO;
import com.ekan.inss.service.BeneficiaryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/beneficiaries")
public class BeneficiaryController {
    private BeneficiaryService beneficiaryService;

    @PostMapping
    public Beneficiary createBeneficiary(@RequestBody BeneficiaryDTO beneficiaryDTO) {
        return beneficiaryService.createBeneficiary(beneficiaryDTO);
    }

    @GetMapping
    public List<Beneficiary> getAllBeneficiaries() {
        return beneficiaryService.getAllBeneficiaries();
    }

    @GetMapping("/{id}")
    public Beneficiary getBeneficiaryById(@PathVariable Long id) {
        return beneficiaryService.getBeneficiaryById(id);
    }

    @PutMapping("/{id}")
    public Beneficiary updateBeneficiary(@PathVariable Long id, @RequestBody BeneficiaryDTO beneficiaryDTO) {
        return beneficiaryService.updateBeneficiary(id, beneficiaryDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteBeneficiary(@PathVariable Long id) {
        beneficiaryService.deleteBeneficiary(id);
    }
}
