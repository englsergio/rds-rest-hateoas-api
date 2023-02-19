package com.dio.rdsapirest.ApiRest.controller;

import com.dio.rdsapirest.ApiRest.entity.Employee;
import com.dio.rdsapirest.ApiRest.exception.EmployeeNotFoundException;
import com.dio.rdsapirest.ApiRest.repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        return ResponseEntity.ok(employeeRepository
                .findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id)));
    }
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.of(Optional.of(employeeRepository.findAll()));
    }
    @PostMapping
    public ResponseEntity<Employee> postEmployee(@RequestBody Employee employee) {
        return ResponseEntity.of(Optional.of(employeeRepository.save(employee)));
    }
    @DeleteMapping
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
