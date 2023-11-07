package com.example.backendsw2.adapter.repository;


import com.example.backendsw2.domain.dto.ProfessorBasicDto;
import com.example.backendsw2.domain.dto.ProfessorDto;
import com.example.backendsw2.domain.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Query(value = "SELECT p FROM Professor p")
    List<Professor> findAll();

    @Query(value = "SELECT COUNT(p) FROM Professor p WHERE p.professorNameUser = :professorNameUser")
    Long existsProfessor(@Param("professorNameUser") String professorNameUser);

    @Query(value ="SELECT COUNT (p) FROM Professor p WHERE p.professorCedula = :professorCedula")
    Long existsProfessor(Long professorCedula);

    @Query(value ="SELECT new com.example.backendsw2.domain.dto.ProfessorBasicDto(p.professorCedula, p.professorName, p.professorLastName) FROM Professor p")
    List<ProfessorBasicDto> searchProfessor();

    @Query("UPDATE Professor p SET p.professorCedula = :professorCedula, " +
            "p.professorNameUser = :professorNameUser,  p.professorPassword= :professorPassword, " +
            "p.professorName = :professorName, p.professorLastName = :professorLastName, p.professorSalary = :professorSalary, " +
            "p.professorAddres = :professorAddres, p.professorSpecialization = :professorSpecialization, p.professorEstatus = :professorEstatus WHERE p.professorCedula = :professorCedula")
    void updateProfessor(Professor professor);

    @Query(value = "SELECT COUNT(p) > 0 FROM Professor p WHERE p.professorNameUser = :professorNameUser")
    boolean existProfessorString(@Param("professorNameUser") String professorNameUser);
    @Query(value = "DELETE FROM Professor p WHERE p.professorCedula = :professorCedula")
    void deleteProfessorById(@Param("professorCedula") Long professorCedula);

    @Query(value = "SELECT COUNT(p) > 0 FROM Professor p WHERE p.professorCedula = :professorCedula")
    boolean existUserL(@Param("professorCedula") Long professorCedula);
    @Query(value = "SELECT p FROM Professor p WHERE p.professorCedula = :professorCedula")
    Professor findProfessorById(@Param("professorCedula") Long professorCedula);

}
