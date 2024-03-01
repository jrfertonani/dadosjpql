package com.pro.pro.uri2609;


import com.pro.pro.uri2609.dto.CategorySumDto;
import com.pro.pro.uri2609.projections.CategorySumProjection;
import com.pro.pro.uri2609.repositories.CategoryRepository;
import com.pro.pro.uri2621.dto.ProductMinDTO;
import com.pro.pro.uri2621.projections.ProjectMinProjection;
import com.pro.pro.uri2621.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class Uri2609Application implements CommandLineRunner {

	@Autowired
	private CategoryRepository repository;


	public static void main(String[] args) {

		SpringApplication.run(Uri2609Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<CategorySumProjection> list = repository.search1();
		List<CategorySumDto> result1 = list.stream().map(x -> new CategorySumDto(x)).collect(Collectors.toList());

		System.out.println("\n****Consulta nativeQuery" );

		for(CategorySumDto obj : result1){
			System.out.println(obj);
		}

		System.out.println("\n\n");

		List<CategorySumDto> result2 = repository.search2();

		System.out.println("\n****Consulta JPQL" );
		for(CategorySumDto obj : result2){
			System.out.println(obj);
		}


	}


}
