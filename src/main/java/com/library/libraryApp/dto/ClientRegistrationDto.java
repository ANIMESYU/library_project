package com.library.libraryApp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientRegistrationDto {

    @NotBlank(message = "ник не может быть пустым")
    @Size(min = 3, max = 80, message = "имя от 3 до 80 символов")
    private String name;

    @NotBlank(message = "email не может быть пустым")
    @Email(message = "заполните корректно")
    private String email;

    @NotBlank(message = "пароль не может быть пустым")
    @Size(min = 6, message = "минимальное кол-во символов 6")
    private String password;

    private LocalDate birthDate;

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public LocalDate getBirthDate() { return birthDate; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
}
