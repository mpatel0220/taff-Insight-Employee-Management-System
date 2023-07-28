package com.staffinsight.repository;

import com.staffinsight.entity.PaySlipDoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaySlipDocRepository extends JpaRepository<PaySlipDoc, Long> {
}