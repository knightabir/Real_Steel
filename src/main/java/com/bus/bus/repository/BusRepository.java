package com.bus.bus.repository;

import com.bus.bus.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Long> {
    public Bus findBusByNumber(String busNumber);
}
