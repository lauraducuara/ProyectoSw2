package com.example.backendsw2.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @OneToOne
    private Registry registry;
    @Id
    @Column(name = "id_student")
    private Long idStudent;
    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_last_name")
    private String studentLastName;

    @Column(name = "student_email")
    private String studentEmail;

    @Column(name = "student_name_user")
    private String studentNameUser;

    @Column(name = "student_password")
    private String studentPassword;

    @Column(name = "student_address")
    private String studentAddress;

    @Column(name = "student_status")
    private String studentStatus;

    @Column(name = "student_birth_date")
    private String studentBirthDate;
    @Column(name = "notaStudent")
    private Long nota;

    @Column(name = "desempenio")
    private String desempenio;

    @Column(name = "periodo_academico")
    private String periodoAcademico;

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentNameUser() {
        return studentNameUser;
    }

    public void setStudentNameUser(String studentNameUser) {
        this.studentNameUser = studentNameUser;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public String getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(String studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    public Long getNota() {
        return nota;
    }

    public void setNota(Long nota) {
        this.nota = nota;
    }

    public String getDesempenio() {
        return desempenio;
    }

    public void setDesempenio(String desempenio) {
        this.desempenio = desempenio;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }
}