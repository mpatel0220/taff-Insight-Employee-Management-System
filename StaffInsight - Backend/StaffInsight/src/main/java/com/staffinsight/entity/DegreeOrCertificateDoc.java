package com.staffinsight.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "degree_or_certificate_doc")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DegreeOrCertificateDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long degreeOrCertificateDocId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "academic_qualification_id")
    private AcademicQualification academicQualification;

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
