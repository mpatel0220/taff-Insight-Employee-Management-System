package com.staffinsight.common.repository;

import com.staffinsight.common.entity.EmploymentType;
import com.staffinsight.common.payload.EmploymentTypeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmploymentTypeRepository extends JpaRepository<EmploymentType, Long> {


    @Query("SELECT NEW com.staffinsight.common.payload.EmploymentTypeDto(e.employmentTypeId, e.employmentType) FROM EmploymentType e WHERE e.isActive = true")
    List<EmploymentTypeDto> findAllActiveEmploymentTypes();


}