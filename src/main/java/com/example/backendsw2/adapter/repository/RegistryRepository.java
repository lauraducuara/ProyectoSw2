package com.example.backendsw2.adapter.repository;

import com.example.backendsw2.domain.entities.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Long> {

    @Query(value = "SELECT r FROM Registry r")
    List<Registry> findAllRegistries();

    @Query(value = "SELECT COUNT(r) FROM Registry r WHERE r.typeRegistry = :typeRegistry")
    Long existsTypeRegistry(@Param("typeRegistry") String typeRegistry);

    //  @Query(value ="SELECT COUNT (r) FROM Registry r WHERE r.idStudent = :idStudent")
    //  Long existsRegistry(Long registryCedula);

    /*@Query("UPDATE Registry r SET r.numberRegistry = :numberRegistry, " +
            "r.typeRegistry = :typeRegistry,  r.nameCourse= :nameCourse, " +
            "r.idStudent = :idStudent, r.nameStudent = :nameStudent, r.lastNameStudent = :lastNameStudent,  r.statusRegistry = :statusRegistry WHERE r.numberRegistry = :numberRegistry")
    void updateRegistry(Registry registry);
*/

    //  boolean existRegistryString(@Param("nameStudent") String nameStudent, @Param("lastNameStudent") String lastNameStudent);

    @Query(value = "DELETE FROM Registry r WHERE r.numberRegistry = :numberRegistry")
    void deleteRegistryById(@Param("numberRegistry") Long numberRegistry);

    //  @Query(value = "SELECT COUNT(r) > 0 FROM Registry r WHERE r.idStudent = :idStudent")
    //   boolean existRegistryL(@Param("idStudent") Long idStudent);



    @Query(value = "SELECT r FROM Registry r WHERE r.idStudent = :idStudent")
    Registry findRegistryById(@Param("idStudent") Long idStudent);
}
