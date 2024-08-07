package com.ekan.inss.service;

import com.ekan.inss.model.Beneficiary;
import com.ekan.inss.model.Document;
import com.ekan.inss.model.dto.BeneficiaryDTO;
import com.ekan.inss.repository.BeneficiaryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BeneficiaryService {
    private BeneficiaryRepository beneficiaryRepository;
    private DocumentService documentService;

    public Beneficiary createBeneficiary(BeneficiaryDTO beneficiaryDTO) {
        Beneficiary beneficiary = new Beneficiary();
        beneficiary.setName(beneficiaryDTO.getName());
        beneficiary.setPhone(beneficiaryDTO.getPhone());
        beneficiary.setBirthDate(beneficiaryDTO.getBirthDate());
        beneficiary.setInclusionDate(new Date());
        beneficiary.setUpdateDate(new Date());

        Beneficiary savedBeneficiary = beneficiaryRepository.save(beneficiary);

        for (Document document : beneficiaryDTO.getDocuments()) {
            document.setBeneficiary(savedBeneficiary);
            document.setInclusionDate(new Date());
            document.setUpdateDate(new Date());
            documentService.saveDocument(document);
        }

        return savedBeneficiary;
    }

    public List<Beneficiary> getAllBeneficiaries() {
        return beneficiaryRepository.findAll();
    }

    public Beneficiary getBeneficiaryById(Long id) {
        return beneficiaryRepository.findById(id).orElseThrow(() -> new RuntimeException("Beneficiary not found"));
    }

    public Beneficiary updateBeneficiary(Long id, BeneficiaryDTO beneficiaryDTO) {
        Optional<Beneficiary> optionalBeneficiary = beneficiaryRepository.findById(id);

        if (optionalBeneficiary.isPresent()) {
            Beneficiary beneficiary = optionalBeneficiary.get();
            beneficiary.setName(beneficiaryDTO.getName());
            beneficiary.setPhone(beneficiaryDTO.getPhone());
            beneficiary.setBirthDate(beneficiaryDTO.getBirthDate());
            beneficiary.setUpdateDate(new Date());

            return beneficiaryRepository.save(beneficiary);
        } else {
            throw new RuntimeException("Beneficiary not found");
        }
    }

    public void deleteBeneficiary(Long id) {
        beneficiaryRepository.deleteById(id);
    }
}
