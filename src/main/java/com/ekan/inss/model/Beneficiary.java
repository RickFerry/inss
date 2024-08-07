package com.ekan.inss.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private Date birthDate;
    private Date inclusionDate;
    private Date updateDate;

    @OneToMany(mappedBy = "beneficiary", cascade = CascadeType.ALL)
    private List<Document> documents;
}
