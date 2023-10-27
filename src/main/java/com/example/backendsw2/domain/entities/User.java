package com.example.backendsw2.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long id;
    @Column(name = "userName", length = 50, nullable = false)
    private String name;
    @Column(name = "userEmail", length = 50, nullable = false)
    private String email;
    @Column(name = "userPassword", nullable = false)
    private String password;

    // Constructor
    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public User () {

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