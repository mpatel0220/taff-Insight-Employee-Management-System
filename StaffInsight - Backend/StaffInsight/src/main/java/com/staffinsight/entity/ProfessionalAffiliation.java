package com.staffinsight.entity;

import com.staffinsight.common.entity.EmploymentType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "professional_affiliation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfessionalAffiliation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long professionalAffiliationId;

    private String organizationName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "designation_id")
    private Designation designation;

    private String descriptionOfWork;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employment_type_id")
    private EmploymentType employmentType;

    private LocalDate joinedDate;

    private LocalDateTime resignationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    private Boolean isActive;

    private LocalDateTime createdOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory createdByUser;
}
