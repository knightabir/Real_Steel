package com.bus.bus.service.implentation;

import com.bus.bus.model.Employee;
import com.bus.bus.repository.EmployeeRepository;
import com.bus.bus.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Long id) {
        return this.employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void deleteEmployeeById(Long id) {
        this.employeeRepository.deleteById(id);
    }
}
