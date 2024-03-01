package com.pro.pro.uri2990.repositories;

import com.pro.pro.uri2990.dto.EmpregadoDeptDTO;
import com.pro.pro.uri2990.entities.Empregado;
import com.pro.pro.uri2990.projection.EmpregadoDeptProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {


    @Query(nativeQuery = true, value = "SELECT empregados.cpf, empregados.enome, departamentos.dnome " +
            "FROM empregados, departamentos " +
            "WHERE empregados.dnumero = departamentos.dnumero AND empregados.cpf " +
            "NOT IN (SELECT trabalha.cpf_emp FROM trabalha) " +
            "ORDER BY empregados.cpf; ")
    List<EmpregadoDeptProjection> search1();


    @Query("SELECT new com.pro.pro.uri2990.dto.EmpregadoDeptDTO (obj.cpf, obj.enome, obj.departamento.dnome )" +
            "FROM Empregado obj, Departamento obj " +
            "WHERE obj.dnumero = obj.departamento.dnumero AND obj.cpf " +
            "NOT IN (SELECT obj.cpf_emp FROM obj) " +
            "ORDER BY obj.cpf ")
    List<EmpregadoDeptDTO> search2();



}
