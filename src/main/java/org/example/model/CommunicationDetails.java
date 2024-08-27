package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Transactional
@Table
public class CommunicationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String primaryEmail;
    private String secondaryEmail;
    private String homePhone;
    private String workPhone;
}