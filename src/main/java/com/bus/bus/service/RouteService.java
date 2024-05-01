package com.bus.bus.service;

import com.bus.bus.model.Route;

import java.util.List;

public interface RouteService {
    public Route addRoute(Route route);
    public Route updateRoute(Route route);
    public Route findRouteById(Long id);
    public List<Route> findAllRoute();
    public void deleteRouteById(Long id);
}
