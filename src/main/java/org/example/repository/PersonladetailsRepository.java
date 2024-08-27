package org.example.repository;


import org.example.model.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonladetailsRepository extends JpaRepository<PersonalDetails,Long> {
}
