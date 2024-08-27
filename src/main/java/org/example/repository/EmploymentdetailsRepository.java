package org.example.repository;

import org.example.model.EmploymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentdetailsRepository extends JpaRepository<EmploymentInfo, Long> {
}
