package com.staffinsight.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "company_branch")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyBranchId;

    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_type_id")
    private BranchType branchType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory createdByUser;

    private LocalDateTime createdOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by_user_history_id")
    private UserHistory modifiedByUser;

    private LocalDateTime modifiedOn;

    private Boolean isActive;

    private String email;

    private String mobile;

}
