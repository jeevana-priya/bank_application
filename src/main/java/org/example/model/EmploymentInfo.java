package org.example.model;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Transactional
@Table
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT ,use = JsonTypeInfo.Id.NAME)
public class EmploymentInfo extends Response implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column(name = "companyAddress")
    private String companyAddress;

    @NotNull
    @Column(name = "designation")
    private String designation;

    @NotNull
    @Column(name = "employerName")
    private String employerName;

    @OneToOne(
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private FinancialDetails financialDetails;
}



