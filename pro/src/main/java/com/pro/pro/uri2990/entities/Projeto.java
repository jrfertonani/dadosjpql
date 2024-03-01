package com.pro.pro.uri2990.entities;

import com.pro.pro.uri2990.entities.Departamento;
import com.pro.pro.uri2990.entities.Empregado;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "projetos")
public class Projeto {

    @Id
    private Long pnumero;
    private String pnome;

    @ManyToOne
    @JoinColumn(name = "dnumero")
    private Departamento departamento;

    @ManyToMany(mappedBy = "projetosOndeTrabalha")
    private Set<Empregado> empregados = new HashSet<>();

    public Projeto() {
    }
}
