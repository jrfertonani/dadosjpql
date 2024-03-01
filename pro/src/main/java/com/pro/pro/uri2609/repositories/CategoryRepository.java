package com.pro.pro.uri2609.repositories;

import com.pro.pro.uri2609.dto.CategorySumDto;
import com.pro.pro.uri2609.entities.Category;
import com.pro.pro.uri2609.projections.CategorySumProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(nativeQuery = true, value = "SELECT categories.name, SUM(products.amount) " +
            "FROM categories " +
            "INNER JOIN products ON products.id_categories = categories.id " +
            "GROUP BY categories.name; ")
    List<CategorySumProjection> search1();

    @Query("SELECT new com.pro.pro.uri2609.dto.CategorySumDto(obj.category.name, SUM(obj.amount)) " +
            "FROM Product obj " +
            "GROUP BY obj.category.name ")
    List<CategorySumDto> search2();


}
