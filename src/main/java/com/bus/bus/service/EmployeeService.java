package com.bus.bus.service;

import com.bus.bus.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public Employee findById(Long id);
    public List<Employee> getAllEmployee();
    public void deleteEmployeeById(Long id);
}
