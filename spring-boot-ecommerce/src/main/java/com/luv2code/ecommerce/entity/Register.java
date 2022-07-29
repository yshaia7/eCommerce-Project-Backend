package com.luv2code.ecommerce.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="register")
@Getter
@Setter
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;


}

