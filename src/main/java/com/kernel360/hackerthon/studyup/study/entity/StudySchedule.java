package com.kernel360.hackerthon.studyup.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger scheduleId;

    @Column(nullable = false)
    private BigInteger studyId;

    @Column(nullable = false)
    private LocalDate studyDate;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @Column(nullable = false, length = 500)
    private String studyTask;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    private LocalDateTime deletedAt;
}