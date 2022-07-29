package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RegisterRepository extends JpaRepository<Register, Long> {
    Register findByEmail(@Param("email") String email);
}
