package com.example.backendsw2.domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProfessorDto {

    private Long professorCedula;
    private String professorNameUser;
    private String professorPassword;
    private String professorName;
    private String professorLastName;
    private double professorSalary;
    private String professorAddres;
    private String professorSpecialization;
    private String professorEstatus;
    private String courseName;

    public ProfessorDto(){

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

