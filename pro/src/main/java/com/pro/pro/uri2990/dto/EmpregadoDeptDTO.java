package com.pro.pro.uri2990.dto;

import com.pro.pro.uri2990.projection.EmpregadoDeptProjection;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EmpregadoDeptDTO {

    private String cpf;
    private String enome;
    private String dnome;

    public EmpregadoDeptDTO() {
    }

    public EmpregadoDeptDTO(String cpf, String enome, String dnome) {
        this.cpf = cpf;
        this.enome = enome;
        this.dnome = dnome;
    }

    public EmpregadoDeptDTO(EmpregadoDeptProjection projection) {
        cpf = projection.getCpf();
        enome = projection.getEnome();
        dnome = projection.GetDnome();
    }
}
