package com.staffinsight.common.entity;

import com.staffinsight.entity.UserHistory;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserType extends CommonProperties{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userTypeId;

    private String userType;

    public UserType(String userType) {
        this.userType = userType;
    }
}
