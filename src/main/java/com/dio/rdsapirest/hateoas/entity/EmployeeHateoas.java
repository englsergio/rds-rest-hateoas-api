package com.dio.rdsapirest.hateoas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Entity
@Data
@NoArgsConstructor
public class EmployeeHateoas extends RepresentationModel<EmployeeHateoas> {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String role;
    private String address;

    public EmployeeHateoas(String name, String role, String address) {
        name = this.name;
        role = this.role;
        address = this.address;
    }
}