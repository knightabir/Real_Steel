package com.bus.bus.service.implentation;

import com.bus.bus.model.Route;
import com.bus.bus.repository.RouteRepository;
import com.bus.bus.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Route addRoute(Route route) {
        return this.routeRepository.save(route);
    }

    @Override
    public Route updateRoute(Route route) {
        return this.routeRepository.save(route);
    }

    @Override
    public Route findRouteById(Long id) {
        return this.routeRepository.findById(id).get();
    }

    @Override
    public List<Route> findAllRoute() {
        return this.routeRepository.findAll();
    }

    @Override
    public void deleteRouteById(Long id) {
        this.routeRepository.deleteById(id);
    }
}
