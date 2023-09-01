package com.example.orderservice.model;

import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}