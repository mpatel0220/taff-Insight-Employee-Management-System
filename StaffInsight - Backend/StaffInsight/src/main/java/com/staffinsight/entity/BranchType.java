package com.staffinsight.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "branch_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BranchType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchTypeId;

    private String branchType;

    private Boolean isActive;

    private LocalDateTime createdOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory createdByUser;

}
