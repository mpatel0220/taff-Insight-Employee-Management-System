package com.staffinsight.repository;

import com.staffinsight.entity.CompanyBranchHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyBranchHistoryRepository extends JpaRepository<CompanyBranchHistory, Long> {
}