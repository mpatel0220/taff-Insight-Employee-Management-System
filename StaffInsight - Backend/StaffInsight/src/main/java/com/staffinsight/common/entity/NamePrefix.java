package com.staffinsight.common.entity;

import com.staffinsight.entity.UserHistory;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "name_prefix")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NamePrefix extends CommonProperties{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long namePrefixId;

    private String namePrefix;


    public NamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }
}
