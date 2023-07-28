package com.staffinsight.entity;

import com.staffinsight.common.entity.Gender;
import com.staffinsight.common.entity.MaritalStatus;
import com.staffinsight.common.entity.NamePrefix;
import com.staffinsight.common.entity.UserType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String loginId;

    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_type_id")
    private UserType userType;

    private String firstName;

    private String lastName;

    private String middleName;

    private String email;

    private String mobile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marital_status_id")
    private MaritalStatus maritalStatus;

    private LocalDate dateOfBirth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "name_prefix_id")
    private NamePrefix namePrefix;

    private Short failedLoginAttempt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id")
    private Gender gender;

    private Boolean isAccountLocked;

    private LocalDateTime accountLockedOn;

    private String lastLoginIpAddress;

    private LocalDateTime lastLoginDate;

    private Boolean isPasswordChanged;

    private LocalDateTime passwordExpiryDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory createdByUser;

    private LocalDateTime createdOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by_user_history_id")
    private UserHistory modifiedByUser;

    private LocalDateTime modifiedOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activate_by_user_history_id")
    private UserHistory activateByUser;

    private LocalDateTime activatedOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deactivated_by_user_history_id")
    private UserHistory deactivatedByUser;

    private LocalDateTime deactivatedOn;

    private String remarks;

    private Boolean isActive;

    private Short xStatus; // 1. Pending 2. Activated 3. Deactivated

}
