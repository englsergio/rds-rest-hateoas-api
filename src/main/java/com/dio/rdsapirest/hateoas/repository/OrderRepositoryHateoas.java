package com.dio.rdsapirest.hateoas.repository;

import com.dio.rdsapirest.hateoas.entity.OrderHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryHateoas extends JpaRepository<OrderHateoas, Long> {
}
