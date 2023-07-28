package com.staffinsight.repository;

import com.staffinsight.entity.BranchType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchTypeRepository extends JpaRepository<BranchType, Long> {
}