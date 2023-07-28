package com.staffinsight.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "daily_attendance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DailyAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dailyAttendanceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    private LocalDateTime clockIn;

    private LocalDateTime clockOut;

    private LocalDateTime late;

    private LocalDateTime overtime;

    private LocalDateTime createdOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory createdByUser;

    private Boolean isActive;
}
