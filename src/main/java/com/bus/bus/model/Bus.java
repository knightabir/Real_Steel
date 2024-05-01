package com.bus.bus.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private String busType;
    private String capacity;
    private String pricePerKm;

    public Bus() {
    }

    public Bus(Long id, String number, String busType, String capacity, String pricePerKm) {
        this.id = id;
        this.number = number;
        this.busType = busType;
        this.capacity = capacity;
        this.pricePerKm = pricePerKm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(String pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", busType='" + busType + '\'' +
                ", capacity='" + capacity + '\'' +
                ", pricePerKm='" + pricePerKm + '\'' +
                '}';
    }
}
