package com.example.backendsw2.domain.dto;

public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;

    // Constructor
    public UserDto(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter para id
    public Long getId() {
        return id;
    }

    // Setter para id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para nombre
    public String getName() {
        return name;
    }

    // Setter para nombre
    public void setName(String name) {
        this.name = name;
    }

    // Getter para email
    public String getEmail() {
        return email;
    }

    // Setter para email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    // Setter para email
    public void setPassword(String password) {
        this.password = password;
    }




}