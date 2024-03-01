package com.pro.pro.uri2737.repositories;

import com.pro.pro.uri2737.entities.Lawyer;
import com.pro.pro.uri2737.projections.LawyerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LawyerRepository extends JpaRepository<Lawyer, Long>{

    @Query(nativeQuery = true, value = "(SELECT name, customers_number AS customersNumber " +
            "FROM lawyers " +
            "ORDER BY customers_number DESC " +
            "LIMIT 1) " +
            "UNION ALL " +
            "(SELECT name, customers_number " +
            "FROM lawyers " +
            "ORDER BY customers_number ASC " +
            "LIMIT 1) " +
            "UNION ALL " +
            "(SELECT 'Average', round(AVG(customers_number), 0) " +
            "FROM lawyers)")
    List<LawyerMinProjection> search1();



}
