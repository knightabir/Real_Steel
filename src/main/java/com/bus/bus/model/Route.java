package com.bus.bus.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Map;

public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String routeName;
    private String startPoint;
    private String endPoint;

//    private List<String> stoppage;
    private Map<String, Integer> stoppage;

    public Route() {
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", routeName='" + routeName + '\'' +
                ", startPoint='" + startPoint + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", stoppage=" + stoppage +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public Map<String, Integer> getStoppage() {
        return stoppage;
    }

    public void setStoppage(Map<String, Integer> stoppage) {
        this.stoppage = stoppage;
    }

    public Route(Long id, String routeName, String startPoint, String endPoint, Map<String, Integer> stoppage) {
        this.id = id;
        this.routeName = routeName;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.stoppage = stoppage;
    }
}
