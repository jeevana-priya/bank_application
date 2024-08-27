package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Transactional
@Table
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT ,use = JsonTypeInfo.Id.NAME)
public class PersonalDetails extends Response implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="firstname",nullable=false)
    private String firstName;
    private String middleName;
    @Column(name="lastname",nullable = false)
    private String lastName;
    @Column(name="gender",nullable = false)
    private String gender;
    @Column(name="dob")
    private Date dob;

    @OneToOne(
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private AddressDetails addressDetails;
    @OneToOne(
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private CommunicationDetails communicationDetails;
}