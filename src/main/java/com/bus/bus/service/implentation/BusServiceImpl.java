package com.bus.bus.service.implentation;

import com.bus.bus.model.Bus;
import com.bus.bus.repository.BusRepository;
import com.bus.bus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus addBus(Bus bus) {
        return this.busRepository.save(bus);
    }

    @Override
    public Bus updateBus(Bus bus) {
        return this.busRepository.save(bus);
    }

    @Override
    public List<Bus> getBusses() {
        return this.busRepository.findAll();
    }

    @Override
    public Bus getBusById(Long id) {
        return this.busRepository.findById(id).get();
    }

    @Override
    public Bus GetBusByNumber(String number) {
        return this.busRepository.findBusByNumber(number);
    }

    @Override
    public void deleteById(Long id) {
        this.busRepository.deleteById(id);
    }
}
