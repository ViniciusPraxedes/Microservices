package com.example.inventoryservice.model;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String skuCode;
    private Integer quantity;
}