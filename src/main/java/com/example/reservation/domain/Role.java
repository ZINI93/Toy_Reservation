package com.example.reservation.domain;


import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public enum Role {
    USER,ADMIN
}
