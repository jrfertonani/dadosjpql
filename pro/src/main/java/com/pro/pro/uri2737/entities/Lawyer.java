package com.pro.pro.uri2737.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "lawyers")
public class Lawyer {

    @Id
    private Long id;
    private String name;
    private Integer customersNumber;

    public Lawyer(){}

    public Lawyer(Long id, String name, Integer customersNumber) {
        this.id = id;
        this.name = name;
        this.customersNumber = customersNumber;
    }
}
