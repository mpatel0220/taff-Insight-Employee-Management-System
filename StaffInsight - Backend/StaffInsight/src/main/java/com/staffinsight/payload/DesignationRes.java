package com.staffinsight.payload;

import com.staffinsight.entity.Designation;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DesignationRes {

    private Long designationId;

    private String designation;

    private LocalDateTime createdOn;

    private String createdByUser;

    public DesignationRes(Designation designation) {
        this.designationId = designation.getDesignationId();
        this.designation = designation.getDesignation();
        this.createdOn = designation.getCreatedOn();
    }
}
