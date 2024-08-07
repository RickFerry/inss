package com.ekan.inss.controller;

import com.ekan.inss.model.Document;
import com.ekan.inss.service.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/documents")
public class DocumentController {
    private DocumentService documentService;

    @GetMapping("/beneficiary/{beneficiaryId}")
    public List<Document> getDocumentsByBeneficiaryId(@PathVariable Long beneficiaryId) {
        return documentService.getDocumentsByBeneficiaryId(beneficiaryId);
    }
}
