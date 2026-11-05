package com.library.libraryApp.dto;

import java.time.LocalDate;

public class ClientResponseDto {
    private Long id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private String role;

    public ClientResponseDto(){}

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public LocalDate getBirthDate() { return birthDate; }
    public String getRole() { return role; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public void setRole(String role) { this.role = role; }
}
