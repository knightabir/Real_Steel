package com.bus.bus.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastname;
    private String gender;
    @Column(unique = true)
    private String phone;
    private String location;
    private String qualification;
    private String age;
    @Column(unique = true)
    private String panNumber;
    @Column(unique = true)
    private String email;
    private String password;

}
