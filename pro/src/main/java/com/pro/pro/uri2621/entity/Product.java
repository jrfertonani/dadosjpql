package com.pro.pro.uri2621.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "id_providers")
    private Provider provider;

    public Product() {
    }

    public Product(Long id, String name, Integer amount, Double price, Provider provider) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.provider = provider;
    }
}
