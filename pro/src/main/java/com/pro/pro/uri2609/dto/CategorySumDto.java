package com.pro.pro.uri2609.dto;

import com.pro.pro.uri2609.projections.CategorySumProjection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class CategorySumDto {

    private String name;
    private Long sum;

    public CategorySumDto() {
    }

    public CategorySumDto(String name, Long sum) {
        this.name = name;
        this.sum = sum;
    }

    public CategorySumDto(CategorySumProjection projection) {
        name = projection.getName();
        sum = projection.getSum();
    }


}
