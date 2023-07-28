package com.staffinsight.repository;

import com.staffinsight.entity.DailyAttendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyAttendanceRepository extends JpaRepository<DailyAttendance, Long> {
}