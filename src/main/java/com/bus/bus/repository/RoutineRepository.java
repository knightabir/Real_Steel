package com.bus.bus.repository;

import com.bus.bus.model.Route;
import com.bus.bus.model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineRepository extends JpaRepository<Routine, Long> {

}
