package com.example.reservation.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Setter @Column(nullable = false) private String Userid;
    @Setter @Column(nullable = false) private String username;
    @Setter @Column(nullable = false) private String birthday;
    @Setter @Column(nullable = false) private String phoneNumber;  //
    @OneToMany(mappedBy = "reservation") private String reservation;

    public User() {
    }
}