package com.example.reservation.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;

@Getter
@ToString
@EntityListeners(Auditing.class)
@MappedSuperclass
public class Auditing {

    // 메타정보

    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateTime createAt;  // 계정생성날짜

    @LastModifiedBy
    private LocalDateTime updateAt;

}
