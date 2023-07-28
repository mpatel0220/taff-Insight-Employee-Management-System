package com.staffinsight.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payslip_doc")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaySlipDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paySlipDocId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professional_affiliation_id")
    private ProfessionalAffiliation professionalAffiliation;

    private String revisedFileName;

    private String actualFileName;

    private String filePath;

    private BigDecimal documentSize;

    private LocalDateTime uploadedOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory uploadedByUser;

    private Boolean isActive;
}
