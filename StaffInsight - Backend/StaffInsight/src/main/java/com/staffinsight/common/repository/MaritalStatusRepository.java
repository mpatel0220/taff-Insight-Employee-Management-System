package com.staffinsight.common.repository;

import com.staffinsight.common.entity.MaritalStatus;
import com.staffinsight.common.payload.MaritalStatusDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaritalStatusRepository extends JpaRepository<MaritalStatus,Long> {


    @Query("SELECT NEW com.staffinsight.common.payload.MaritalStatusDto(m.maritalStatusId,m.maritalStatus) FROM MaritalStatus m WHERE m.isActive = true")
    List<MaritalStatusDto> findAllActiveMaritalStatus();

}
