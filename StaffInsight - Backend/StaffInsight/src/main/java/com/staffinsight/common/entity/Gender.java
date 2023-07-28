package com.staffinsight.common.entity;

import com.staffinsight.entity.UserHistory;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "gender")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Gender extends CommonProperties{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genderId;

    private String gender;


    public Gender(String gender) {
        this.gender = gender;
    }
}
