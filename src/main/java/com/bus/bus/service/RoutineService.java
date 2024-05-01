package com.bus.bus.service;

import com.bus.bus.model.Routine;

import java.util.List;

public interface RoutineService {
    public Routine addRoutine(Routine routine);
    public Routine updateRoutine(Routine routine);
    public Routine findById(Long id);
    public List<Routine> findAllRoutine();
    public void deleteRoutineById(Long id);
}
