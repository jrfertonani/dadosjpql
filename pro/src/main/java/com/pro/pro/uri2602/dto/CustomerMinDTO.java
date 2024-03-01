package com.pro.pro.uri2602.dto;

import com.pro.pro.uri2602.projections.CustomerMinProjection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerMinDTO {

    private String name;

    public CustomerMinDTO() {
    }

    public CustomerMinDTO(String name) {
        this.name = name;
    }

    public CustomerMinDTO(CustomerMinProjection projection) {
        this.name = projection.getName();
    }
}
