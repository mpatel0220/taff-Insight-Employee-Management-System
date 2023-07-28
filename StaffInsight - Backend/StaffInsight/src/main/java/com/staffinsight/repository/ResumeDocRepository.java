package com.staffinsight.repository;

import com.staffinsight.entity.ResumeDoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeDocRepository extends JpaRepository<ResumeDoc, Long> {
}