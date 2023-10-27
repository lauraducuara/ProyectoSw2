package com.example.backendsw2.adapter.repository;


import com.example.backendsw2.domain.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface Studentpository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT s FROM Student s")
    List<Student> findAll();

    @Query(value = "SELECT COUNT(s) FROM Student s WHERE s.studentNameUser = :studentNameUser")
    Long existsStudent(@Param("studentNameUser") String studentNameUser);

    @Query(value ="SELECT COUNT (s) FROM Student s WHERE s.idStudent = :studentCedula")
    Long existsStudent(@Param("studentCedula") Long studentCedula);

    @Query("UPDATE Student s SET s.idStudent = :idStudent, " +
            "s.studentNameUser = :studentNameUser,  s.studentPassword= :studentPassword, " +
            "s.studentName = :studentName, s.studentLastName = :studentLastName, s.studentEmail = :studentEmail, " +
            "s.studentAddress = :studentAddress, s.studentStatus = :studentStatus, s.studentBirthDate = :studentBirthDate WHERE s.idStudent = :idStudent")
    void updateStudent(Student student);

    @Query(value = "SELECT COUNT(s) > 0 FROM Student s WHERE s.studentNameUser = :studentNameUser")
    boolean existStudentString(@Param("studentNameUser") String studentNameUser);

    @Query(value = "DELETE FROM Student s WHERE s.idStudent = :studentCedula")
    void deleteStudentById(@Param("studentCedula") Long idStudent);

    @Query(value = "SELECT COUNT(s) > 0 FROM Student s WHERE s.idStudent = :studentCedula")
    boolean existUserL(@Param("studentCedula") Long idStudent);

    @Query(value = "SELECT s FROM Student s WHERE s.idStudent = :studentCedula")
    Student findStudentById(@Param("studentCedula") Long idStudent);
}