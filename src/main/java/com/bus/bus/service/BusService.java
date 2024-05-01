package com.bus.bus.service;

import com.bus.bus.model.Bus;

import java.util.List;

public interface BusService {
    public Bus addBus(Bus bus);
    public Bus updateBus(Bus bus);
    public List<Bus> getBusses();
    public Bus getBusById(Long id);
    public Bus GetBusByNumber(String number);
    public void deleteById(Long id);
}
