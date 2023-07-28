package com.staffinsight.repository;

import com.staffinsight.entity.CompanyHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyHistoryRepository extends JpaRepository<CompanyHistory, Long> {
}