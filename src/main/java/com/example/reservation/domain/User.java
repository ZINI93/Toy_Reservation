package com.example.reservation.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user")
@Entity
public class User extends Auditing{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String UserId;  // 병원에서 자동으로 발급

    @Column(nullable = false)
    private String password;  //병원에서 생년월일로 설정

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String userId, String password, String name, LocalDate birthDate, String phoneNumber, Role role) {
        UserId = userId;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    // DDD 원칙 도메인 주도 원칙으로 설계  도메인 관련 중요로직은 도메인에서 관리

    /**
     * 이름 변경 메서드
     */
    public void changeName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("이름은 비워둘수 없습니다.");
    }
    this.name = name;
    }
    /**
     *  비밀번호 변경 메서드
     */
    public void changePassword(String password) {
        if (password == null || name.isBlank()) {
            throw new IllegalArgumentException("비밀번호를 비워둘수 없습니다.");
        }
        this.password = password;
    }
    /**
     *  전화번호 변경 메서드
     */
    public void changePhoneNumber(String phoneNumber){
        if (phoneNumber == null || phoneNumber.isBlank()){
            throw new IllegalArgumentException("전화번호를 비워둘수 없습니다.");
        }
        this.phoneNumber = phoneNumber;
    }


}