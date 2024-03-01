package com.pro.pro.uri2602;


import com.pro.pro.uri2602.dto.CustomerMinDTO;
import com.pro.pro.uri2602.projections.CustomerMinProjection;
import com.pro.pro.uri2602.repository.CustomerReposiitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class Uri2602Application implements CommandLineRunner {

	@Autowired
	private CustomerReposiitory reposiitory;


	public static void main(String[] args) {
		SpringApplication.run(Uri2602Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<CustomerMinProjection> list = reposiitory.serach1("rs");
		List<CustomerMinDTO> result1 = list.stream().map(x -> new CustomerMinDTO(x)).collect(Collectors.toList());

		System.out.println("\n****Consulta nativeQuery" );
		for(CustomerMinDTO obj : result1){
			System.out.println(obj.getName());
		}

		System.out.println("\n\n");

		List<CustomerMinDTO> result2 = reposiitory.serach2("rs");
		System.out.println("\n****Consulta JPQL" );
		for(CustomerMinDTO obj : result2){
			System.out.println(obj);
		}

	}


}
