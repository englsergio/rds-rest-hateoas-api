package com.dio.rdsapirest.ApiRest.repository;

import com.dio.rdsapirest.ApiRest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
