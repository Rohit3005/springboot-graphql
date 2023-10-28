package com.demo.controller;

import com.demo.exception.RecordNotFoundException;
import com.demo.model.Employee;
import com.demo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/saveData")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.saveData(employee), HttpStatus.CREATED);
    }

    @QueryMapping("getEmployee")
    public ResponseEntity<Optional<Employee>> getDataById(@Argument long empId){
        return ResponseEntity.ok(employeeService.getDataById(empId));
    }

    @QueryMapping("getAllEmployees")
    public List<Employee> getAllData(){
        return employeeService.getAllData();
    }

   /* @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee> updateData(@PathVariable long empId, @RequestBody Employee employee){
        Employee employee1 = employeeService.getDataById(empId).orElseThrow(()->new RecordNotFoundException("Record does not exist"));
        employee1.setEmpName(employee.getEmpName());
        employee1.setEmpAddress(employee.getEmpAddress());
        employee1.setEmpSalary(employee.getEmpSalary());
        employee1.setEmpContactNumber(employee.getEmpContactNumber());
        employee1.setEmpPassword(employee.getEmpPassword());

        return new ResponseEntity<>(employeeService.updateData(employee1), HttpStatus.CREATED);
    }

    @DeleteMapping("/deletedata/{empId}")
    public ResponseEntity<String> deleteDataById(@PathVariable long empId){
        employeeService.deleteDataById(empId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }*/

}
