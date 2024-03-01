package com.pro.pro.uri2621.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "providers")
public class Provider {

    @Id
    private Long id;
    private String name;
    private String street;
    private String city;
    private String state;

    @OneToMany(mappedBy = "provider")
    private List<Product> products = new ArrayList<>();

    public Provider() {
    }

    public Provider(Long id, String name, String street, String city, String state, List<Product> products) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.products = products;
    }
}
