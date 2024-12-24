package com.example.reservation.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString(callSuper = true)
@Table(name = "reservation")
@Entity
public class Reservation {

    @Id @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_id") @ToString.Exclude
    private User user;

    @Column(nullable = false) @Setter private String description;
    @Column(nullable = false) @Setter private LocalDateTime dateTime;

    public void setUser(User user) {
        this.user = user;
    }

}