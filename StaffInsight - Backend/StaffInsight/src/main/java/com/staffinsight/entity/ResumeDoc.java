package com.staffinsight.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "resume_doc")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResumeDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resumeDocId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    private String revisedFileName;

    private String actualFileName;

    private String filePath;

    private Long documentSize;

    private LocalDateTime uploadedOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uploaded_by_user_history_id")
    private UserHistory uploadedBy;

    private Boolean isActive;

}
