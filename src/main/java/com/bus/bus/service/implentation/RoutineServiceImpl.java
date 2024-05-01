package com.bus.bus.service.implentation;

import com.bus.bus.model.Routine;
import com.bus.bus.repository.RoutineRepository;
import com.bus.bus.service.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutineServiceImpl implements RoutineService {

    @Autowired
    private RoutineRepository routineRepository;

    @Override
    public Routine addRoutine(Routine routine) {
        return this.routineRepository.save(routine);
    }

    @Override
    public Routine updateRoutine(Routine routine) {
        return this.routineRepository.save(routine);
    }

    @Override
    public Routine findById(Long id) {
        return this.routineRepository.findById(id).get();
    }

    @Override
    public List<Routine> findAllRoutine() {
        return this.routineRepository.findAll();
    }

    @Override
    public void deleteRoutineById(Long id) {
        this.routineRepository.deleteById(id);
    }
}
