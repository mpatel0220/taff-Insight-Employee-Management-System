package com.staffinsight.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "academic_qualification")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcademicQualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long academicQualificationId;

    private String qualification;

    private String institution;

    private Integer completionYear;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    private Boolean isActive;

    private LocalDateTime createdOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory createdByUser;

}
