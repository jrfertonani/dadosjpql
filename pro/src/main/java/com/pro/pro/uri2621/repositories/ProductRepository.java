package com.pro.pro.uri2621.repositories;

import com.pro.pro.uri2621.dto.ProductMinDTO;
import com.pro.pro.uri2621.entity.Product;
import com.pro.pro.uri2621.projections.ProjectMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query(nativeQuery = true, value = "SELECT products.name "
            + "FROM products "
            + "INNER JOIN providers ON products.id_providers = providers.id "
            + "WHERE products.amount BETWEEN :min AND :max "
            + "AND providers.name LIKE CONCAT(:beginName, '%')")
    List<ProjectMinProjection> search1(Integer min, Integer max, String beginName);


    @Query("SELECT new com.pro.pro.uri2621.dto.ProductMinDTO(obj.name) "
            + "FROM Product obj "
            + "WHERE obj.amount BETWEEN :min AND :max "
            + "AND obj.provider.name LIKE CONCAT(:beginName, '%')")
    List<ProductMinDTO> search2(Integer min, Integer max, String beginName);

}
