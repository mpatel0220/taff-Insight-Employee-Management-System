package com.staffinsight.common.entity;

import com.staffinsight.entity.UserHistory;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "employment_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmploymentType extends CommonProperties{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employmentTypeId;

    private String employmentType;

    public EmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }
}
