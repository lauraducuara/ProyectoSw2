package com.example.backendsw2.adapter.repository;

import com.example.backendsw2.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT u FROM User u")
    List<User> findAll();
    @Query(value = "SELECT COUNT(u) FROM User u WHERE u.name = :name")
    Long existsUserByName(@Param("name") String name);
    @Query(value ="SELECT COUNT (u) FROM User u WHERE u.id = :id")
    Long existsUserById(Long id);

    @Modifying
    @Query("UPDATE User u SET u.name = :name, u.email = :email, u.password = :password WHERE u.id = :id")
    void updateUser(@Param("name") String name, @Param("email") String email, @Param("password") String password);


    @Query(value = "SELECT COUNT(u) > 0 FROM User u WHERE u.name = :name")
    boolean existUserString(@Param("name") String name);

    @Query(value = "SELECT COUNT(u) > 0 FROM User u WHERE u.id = :id")
    boolean existUserL(@Param("id") Long id);

    @Query("SELECT u FROM User u WHERE u.name = :name AND u.password = :password")
    List<User> findUserByNameAndPassword(@Param("name") String name, @Param("password") String password);
    @Query(value = "SELECT u FROM User u WHERE u.id = :id")
    User findUserById(@Param("id") Long id);
    @Query("SELECT u FROM User u WHERE u.name = :name")
    List<User> findByUserName(@Param("name") String name);
}