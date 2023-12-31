package com.demo.service;

import com.demo.model.Employee;
import com.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee saveData(Employee employee){
        return employeeRepo.save(employee);
    }

    public List<Employee> getAllData(){
        return employeeRepo.findAll();
    }

    public Optional<Employee> getDataById(long empId){
        return employeeRepo.findById(empId);
    }

    public Employee updateData(Employee employee){
        return employeeRepo.save(employee);
    }

    public String deleteDataById(long empId){
        employeeRepo.deleteById(empId);
        return "Data Deleted Successfully";
    }
}
