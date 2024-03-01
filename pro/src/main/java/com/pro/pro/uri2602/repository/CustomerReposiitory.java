package com.pro.pro.uri2602.repository;


import com.pro.pro.uri2602.dto.CustomerMinDTO;
import com.pro.pro.uri2602.entites.Customer;
import com.pro.pro.uri2602.projections.CustomerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerReposiitory extends JpaRepository<Customer, Long> {

    @Query(nativeQuery = true, value = "SELECT  name "
            + "FROM customers "
            + "WHERE state= UPPER(:state)")
    List<CustomerMinProjection> serach1(String state);

    @Query("SELECT new com.pro.pro.uri2602.dto.CustomerMinDTO(obj.name) "
            + "FROM Customer obj "
            + "WHERE UPPER(obj.state) = UPPER(:state)")
    List<CustomerMinDTO> serach2(String state);


}
