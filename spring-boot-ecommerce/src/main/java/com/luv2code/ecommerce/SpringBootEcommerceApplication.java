package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

<<<<<<< HEAD
=======

/*
* For add new entity support do the following:
* 	1. create new class name with @Entity & @Table & @Setter & @Getter
*	2. create new class interface that extends JpaRepository with @RepositoryRestResource & @CrossOrigin
* 	3.
*
*
* */
>>>>>>> c678729 (JpaRepository: add Country and State Http Get request support)
@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		//System.out.println("hello world");
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}

}
