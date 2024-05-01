package com.bus.bus.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;


@Entity
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

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastname, String gender, String phone, String location, String qualification, String age, String panNumber, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.gender = gender;
        this.phone = phone;
        this.location = location;
        this.qualification = qualification;
        this.age = age;
        this.panNumber = panNumber;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", qualification='" + qualification + '\'' +
                ", age='" + age + '\'' +
                ", panNumber='" + panNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
