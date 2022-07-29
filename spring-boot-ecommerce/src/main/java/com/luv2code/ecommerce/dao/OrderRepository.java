package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {
    Page<Order> findByCustomerEmail(@Param("email") String email, Pageable pageable);

   // @Query(value = "SELECT * FROM Orders LEFT OUTER JOIN Customer ON Orders.id=Customer.id WHERE Customer.email= ?1", nativeQuery = true)
   // Page<Order> findByEmailAddress(String emailAddress, Pageable pageable);

}
