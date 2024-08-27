package org.example.model;

import lombok.*;

import javax.persistence.*;
import javax.transaction.Transactional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Transactional
@Table
public class FinancialDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long income;
    private Long rent;
    private Long insurance;
    private String other;

}
