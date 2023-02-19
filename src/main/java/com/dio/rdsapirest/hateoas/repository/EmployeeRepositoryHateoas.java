package com.dio.rdsapirest.hateoas.repository;

import com.dio.rdsapirest.hateoas.entity.EmployeeHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryHateoas extends JpaRepository<EmployeeHateoas, Long> {

}
