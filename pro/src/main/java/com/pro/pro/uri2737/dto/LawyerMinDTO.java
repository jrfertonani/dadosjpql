package com.pro.pro.uri2737.dto;

import com.pro.pro.uri2737.projections.LawyerMinProjection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LawyerMinDTO {

    private String name;
    private Integer custumersNumber;

    public LawyerMinDTO() {
    }

    public LawyerMinDTO(String name, Integer custumersNumber) {
        this.name = name;
        this.custumersNumber = custumersNumber;
    }

    public LawyerMinDTO(LawyerMinProjection projection) {
        name = projection.getName();
        custumersNumber = projection.getCustomersNumber();
    }

}
