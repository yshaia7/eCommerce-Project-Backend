package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* For add new entity support do the following:
* 	1. create new class name with @Entity & @Table & @Setter & @Getter
*	2. create new class interface that extends JpaRepository with @RepositoryRestResource & @CrossOrigin
* 	3.
*
*
* */
@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		//System.out.println("hello world");
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}

}
