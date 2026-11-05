package com.library.libraryApp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id",nullable = false)
    private Long id;

    @Column(name = "client_name",nullable = false, unique = true)
    private String name;

    @Column(name="client_email",nullable = false,unique = true)
    private String email;

    @Column(name="client_hash_password",nullable = false)
    private String hashPassword;

    @Column(name="client_bd")
    private LocalDate birthDate;

    @Column(name="client_role",nullable = false)
    private String role;

    public Client(){}

    public void setId(Long id) {this.id = id;}
    public void setName(String name){this.name=name;}
    public void setEmail(String email){this.email=email;}
    public void setHashPassword(String hashPassword){this.hashPassword=hashPassword;}
    public void setClientBd(LocalDate birthDate) {this.birthDate = birthDate;}
    public void setRole(String role){this.role=role;}

    public Long getId(){return id;}
    public String getName(){return name;}
    public String getEmail(){return  email;}
    public String getHashPassword() {return hashPassword;}
    public LocalDate getClientBd() {return birthDate;}
    public String getRole() {return role;}

}
/**
 * client_id INT AUTO_INCREMENT PRIMARY KEY ,
 * client_name VARCHAR(80) NOT NULL UNIQUE ,
 * client_email VARCHAR(255) NOT NULL UNIQUE,
 * client_hash_password varchar(300) NOT NULL,
 * client_bd DATE,
 * client_role varchar(20) not null
 */