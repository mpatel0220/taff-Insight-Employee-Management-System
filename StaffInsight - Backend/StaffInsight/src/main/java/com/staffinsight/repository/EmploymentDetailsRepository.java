package com.staffinsight.repository;

import com.staffinsight.entity.EmploymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentDetailsRepository extends JpaRepository<EmploymentDetails, Long> {
}