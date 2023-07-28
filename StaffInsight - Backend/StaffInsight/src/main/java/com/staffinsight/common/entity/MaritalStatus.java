package com.staffinsight.common.entity;

import com.staffinsight.entity.UserHistory;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "marital_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MaritalStatus extends CommonProperties{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maritalStatusId;


    private String maritalStatus;

    public MaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


}
