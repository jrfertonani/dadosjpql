package com.pro.pro.uri2990.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    private Long dnumero;
    private String dnome;

    @OneToMany(mappedBy = "departamento")
    private List<Empregado> empregados = new ArrayList<>();

    @ManyToMany
    @JoinColumn(name = "cpf_gerente")
    private Empregado gerente;

    public Departamento() {
    }
}
