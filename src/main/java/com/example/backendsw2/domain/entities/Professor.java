package com.example.backendsw2.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name= "professor")
@Data
public class Professor {


    @ManyToOne
    private Course course;

    @OneToMany(mappedBy = "professor")
    private List<Subjects> subjects;


    @Id
    @Column(name = "cedulaProfessor")
    private Long professorCedula;
    @Column(name = "professorNameUser", length = 50, nullable = false)
    private String professorNameUser;
    @Column(name = "professorPassword")
    private String professorPassword;
    @Column(name = "professorName", length = 250)
    private String professorName;
    @Column(name = "professorLastName", length = 250)
    private String professorLastName;
    @Column(name = "professorSalary", nullable = false)
    private double professorSalary;
    @Column(name = "professorAddres", length = 250)
    private String professorAddres;
    @Column(name = "professorSpecialization", length = 250)
    private String professorSpecialization;
    @Column(name = "professorEstatus", length = 50, nullable = false)
    private String professorEstatus;
    @Column(name = "courseName", length = 50, nullable = false)
    private String courseName;

    public Professor(){

    }

    public Long getProfessorCedula() {
        return professorCedula;
    }

    public String getProfessorNameUser() {
        return professorNameUser;
    }

    public String getProfessorPassword() {
        return professorPassword;
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getProfessorLastName() {
        return professorLastName;
    }

    public double getProfessorSalary() {
        return professorSalary;
    }

    public String getProfessorAddres() {
        return professorAddres;
    }

    public String getProfessorSpecialization() {
        return professorSpecialization;
    }


    public String getProfessorEstatus() {
        return professorEstatus;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Métodos SET


    public void setProfessorCedula(Long professorCedula) {
        this.professorCedula = professorCedula;
    }

    public void setProfessorNameUser(String professorNameUser) {
        this.professorNameUser = professorNameUser;
    }

    public void setProfessorPassword(String professorPassword) {
        this.professorPassword = professorPassword;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public void setProfessorLastName(String professorLastName) {
        this.professorLastName = professorLastName;
    }

    public void setProfessorSalary(double professorSalary) {
        this.professorSalary = professorSalary;
    }

    public void setProfessorAddres(String professorAddres) {
        this.professorAddres = professorAddres;
    }

    public void setProfessorSpecialization(String professorSpecialization) {
        this.professorSpecialization = professorSpecialization;
    }

    public void setProfessorEstatus(String professorEstatus) {
        this.professorEstatus = professorEstatus;
    }

}


