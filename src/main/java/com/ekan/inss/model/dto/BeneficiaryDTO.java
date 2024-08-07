package com.ekan.inss.model.dto;

import com.ekan.inss.model.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BeneficiaryDTO {
    private String name;
    private String phone;
    private Date birthDate;
    private List<Document> documents;
}

