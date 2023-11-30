package com.example.User.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class UserRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String job;
    private String experience;
    private String location;
}
