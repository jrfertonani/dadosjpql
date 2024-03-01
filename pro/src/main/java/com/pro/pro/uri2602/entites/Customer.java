package com.pro.pro.uri2602.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private Long id;
    private String name;
    private String street;
    private String city;
    private String state;
    private Double creditLimit;

    public Customer() {
    }

    public Customer(Long id, String name, String street, String city, String state, Double creditLimit) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.creditLimit = creditLimit;
    }
}
