package com.bus.bus.controller;

import com.bus.bus.helper.HttpMyResponse;

import com.bus.bus.model.Bus;
import com.bus.bus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping()
    public HttpMyResponse getAll(){
        HttpMyResponse resp = new HttpMyResponse();

        List<Bus> busses = busService.getBusses();

        if (busses.isEmpty()){
            resp.setStatus(false);
            resp.setCode(4020);
            resp.setMessage("No Busses are there.");

        }else {
            resp.setCode(200);
            resp.setStatus(true);
            resp.setMessage("Busses Found.");
            resp.setResult(busses);
        }

        return resp;
    }

    @GetMapping("/{id}")
    public HttpMyResponse findById(@PathVariable Long id){
        HttpMyResponse resp = new HttpMyResponse();
        List<Bus> result = new ArrayList<>();
        try {
            Bus bus = busService.getBusById(id);
            result.add(bus);
        }catch (Exception e){
            resp.setCode(4010);
            resp.setStatus(false);
            resp.setMessage(e.getMessage());
            return resp;
        }
        resp.setStatus(true);
        resp.setCode(200);
        resp.setMessage("Bus Found.");
        resp.setResult(result);
        return resp;
    }

    @PostMapping()
    public HttpMyResponse save(@RequestBody Bus bus){
        HttpMyResponse resp = new HttpMyResponse();

        //Validation


        //Check the number is unique or not


        List<Bus> result = new ArrayList<>();
        result.add(this.busService.addBus(bus));
        resp.setCode(200);
        resp.setStatus(true);
        resp.setMessage("Buss Added Successfully.");
        resp.setResult(result);

        return resp;
    }

    @PutMapping("/{id}")
    public HttpMyResponse<Bus> update(@RequestBody Bus bus, @PathVariable Long id) {
        HttpMyResponse<Bus> resp = new HttpMyResponse<>();

        // Validation
        if (id == null) {
            resp.setCode(400);
            resp.setStatus(false);
            resp.setMessage("Bus ID is required.");
            return resp;
        }

        // Check if the bus exists
        Bus existingBus = busService.getBusById(id);
        if (existingBus == null) {
            resp.setCode(404);
            resp.setStatus(false);
            resp.setMessage("Bus not found.");
            return resp;
        }

        // Update the bus
        bus.setId(id); // Ensure the ID is set for the updated bus
        Bus updatedBus = busService.updateBus(bus);
        if (updatedBus == null) {
            resp.setCode(500);
            resp.setStatus(false);
            resp.setMessage("Failed to update bus.");
            return resp;
        }

        List<Bus> result = new ArrayList<>();
        result.add(updatedBus);

        resp.setCode(200);
        resp.setStatus(true);
        resp.setMessage("Bus updated successfully.");
        resp.setResult(result);

        return resp;
    }

    @DeleteMapping("/{id}")
    public HttpMyResponse delete(@PathVariable Long id){
        HttpMyResponse resp = new HttpMyResponse();

        //Validate
        if (id == null) {
            resp.setCode(400);
            resp.setStatus(false);
            resp.setMessage("Bus ID is required.");
            return resp;
        }

        try {
            Bus existingBus = busService.getBusById(id);
        }catch (Exception e){
            resp.setCode(404);
            resp.setStatus(false);
            resp.setMessage(e.getMessage());
            return resp;
        }


        busService.deleteById(id);
        resp.setStatus(true);
        resp.setMessage("Bus Deleted Successfully.");
        resp.setCode(200);

        return resp;
    }

}
