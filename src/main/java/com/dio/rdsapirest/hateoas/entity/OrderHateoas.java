package com.dio.rdsapirest.hateoas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;


@Entity
@Table(name="CUSTUMER_ORDER")
@Data
@NoArgsConstructor
public class OrderHateoas extends RepresentationModel<OrderHateoas> {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Status status;
    private String description;

    public OrderHateoas(Status status, String description) {
        this.status = status;
        this.description = description;
    }
}
