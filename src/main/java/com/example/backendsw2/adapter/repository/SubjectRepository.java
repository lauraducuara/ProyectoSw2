package com.example.backendsw2.adapter.repository;

import com.example.backendsw2.domain.entities.Professor;
import com.example.backendsw2.domain.entities.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subjects, Long> {


    @Query(value = "SELECT s FROM Subjects s")
    List<Subjects> findAll();

    @Query(value = "SELECT COUNT(s) FROM Subjects s WHERE s.subjectName = :subjectname")
    Long existsSubject(@Param("subjectname") String subjectname);

    @Query(value = "SELECT COUNT (s) FROM Subjects s WHERE s.idSubject = :idSubject")
    Long existsSubjects(Long idSubject);


    @Query("SELECT s.idSubject, s.subjectName, p.professorCedula, p.professorName, p.professorLastName " +
            "FROM Subjects s " +
            "JOIN Professor p ON s.idCourseSubject = p.professorCedula " +
            "WHERE s.subjectName = :subjectName")
    List<Object[]> findProfessorCedulaBySubjectName(@Param("subjectName") String subjectName);


    /**  @Query(value = "SELECT s.id_subject, s.subject_name, p.cedula_professor, p.professor_name, p.professor_last_name " +
    "FROM subjects s " +
    "JOIN professor p ON s.professor_id = p.cedula_professor " +
    "WHERE s.subject_name = :subjectName", nativeQuery = true)
    List<Object[]> findProfessorCedulaBySubjectName(@Param("subjectName") String subjectName);
     **/

    @Query("UPDATE Professor p SET p.professorCedula = :professorCedula, " +
            "p.professorNameUser = :professorNameUser,  p.professorPassword= :professorPassword, " +
            "p.professorName = :professorName, p.professorLastName = :professorLastName, p.professorSalary = :professorSalary, " +
            "p.professorAddres = :professorAddres, p.professorSpecialization = :professorSpecialization, p.professorEstatus = :professorEstatus WHERE p.professorCedula = :professorCedula")
    void updateSubject(Professor professor);

    @Query(value = "SELECT COUNT(s) > 0 FROM Subjects s WHERE s.subjectName = :subjectName")
    boolean existSubjectString(@Param("subjectName") String subjectName);
    @Query(value = "DELETE FROM Subjects s WHERE s.idSubject = :idSubject")
    void deleteSubjectById(@Param("idSubject") Long idSubject);

    @Query(value = "SELECT COUNT(s) > 0 FROM Subjects s WHERE s.idSubject = :idSubject")
    boolean existUserL(@Param("idSubject") Long idSubject);
    @Query(value = "SELECT s FROM Subjects s WHERE s.idSubject = :idSubject")
    Professor findSubjectById(@Param("idSubject") Long idSubject);


}




