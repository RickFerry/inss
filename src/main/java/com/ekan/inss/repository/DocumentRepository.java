package com.ekan.inss.repository;

import com.ekan.inss.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByBeneficiaryId(Long beneficiaryId);
}
