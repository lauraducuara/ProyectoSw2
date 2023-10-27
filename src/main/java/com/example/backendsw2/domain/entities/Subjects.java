package com.example.backendsw2.domain.entities;


import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "subjects")
public class Subjects {


    @ManyToOne
    public Course course;

    @ManyToOne
    public Professor professor;



    public Subjects(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincremental el ID
    @Column(name = "id_subject")
    private Long idSubject;
    @Column(name = "subjectName", length = 50, nullable = false)
    private String subjectName;
    @Column(name = "subjectDescription", length = 250)
    private String subjectDescription;
    @Column(name = "subjectPercentage")
    private Double subjectPercentage;
    @Column(name = "subjectStatus", length = 50)
    private String subjectStatus;

    @Column(name = "idCourseSubject", length = 50)
    private Long idCourseSubject;



    // Getters
    public Long getIdSubject() {
        return idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public Double getSubjectPercentage() {
        return subjectPercentage;
    }

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public Long getIdCourseSubject() {
        return idCourseSubject;
    }

    // Setters
    public void setIdSubject(Long idSubject) {
        this.idSubject = idSubject;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public void setSubjectPercentage(Double subjectPercentage) {
        this.subjectPercentage = subjectPercentage;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
    }


    public void setIdCourseSubject(Long professorSubjectCedula) {
        this.idCourseSubject = idCourseSubject;
    }


}
