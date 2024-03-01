package com.pro.pro.uri2621.dto;

import com.pro.pro.uri2621.projections.ProjectMinProjection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductMinDTO {

    private String name;

    public ProductMinDTO() {
    }

    public ProductMinDTO(String name) {
        this.name = name;
    }

    public ProductMinDTO(ProjectMinProjection projection) {
        name = projection.getName();
    }
}
