package com.pro.pro.uri2609.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "id_categories")
    private Category category;

    public Product(){

    }

    public Product(Long id, String name, Integer amount, BigDecimal price, Category category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.category = category;
    }


}
