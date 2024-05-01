package com.bus.bus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String busName;
    private String routeName;
    private String date;
    private String time;

    public Routine() {
    }

    @Override
    public String toString() {
        return "Routine{" +
                "id=" + id +
                ", busName='" + busName + '\'' +
                ", routeName='" + routeName + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Routine(Long id, String busName, String routeName, String date, String time) {
        this.id = id;
        this.busName = busName;
        this.routeName = routeName;
        this.date = date;
        this.time = time;
    }
}
