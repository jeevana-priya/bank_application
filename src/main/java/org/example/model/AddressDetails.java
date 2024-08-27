package org.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Transactional
@Table
//@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class AddressDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;
    private String addressline2;
    private String city;
    private String state;
    private String country;
    private Long zipcode;

}
