package com.ekan.inss.service;

import com.ekan.inss.model.Document;
import com.ekan.inss.repository.DocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;

    public List<Document> getDocumentsByBeneficiaryId(Long beneficiaryId) {
        return documentRepository.findByBeneficiaryId(beneficiaryId);
    }

    public void saveDocument(Document document) {
        documentRepository.save(document);
    }
}
