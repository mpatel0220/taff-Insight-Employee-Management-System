package com.staffinsight.repository;

import com.staffinsight.entity.OrgType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgTypeRepository extends JpaRepository<OrgType, Long> {
}