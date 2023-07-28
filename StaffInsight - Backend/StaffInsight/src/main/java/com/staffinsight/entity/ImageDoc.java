package com.staffinsight.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "image_doc")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageDocId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    private String revisedFileName;

    private String actualFileName;

    private String filePath;

    private BigDecimal documentSize;

    private LocalDateTime uploadedOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_history_id")
    private UserHistory uploadedByUser;

}
