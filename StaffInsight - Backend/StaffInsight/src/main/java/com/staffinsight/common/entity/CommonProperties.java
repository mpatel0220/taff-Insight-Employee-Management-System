package com.staffinsight.common.entity;

import com.staffinsight.entity.UserHistory;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@MappedSuperclass
public abstract class CommonProperties {

    private Boolean isActive;

    private LocalDateTime createdOn;

   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory createdByUser;*/

    public CommonProperties(/*UserHistory createdByUser*/) {
        this.isActive = true;
        this.createdOn = LocalDateTime.now();
//        this.createdByUser = createdByUser;
    }
}
