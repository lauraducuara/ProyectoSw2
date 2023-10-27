package com.example.backendsw2.domain.dto;


import jakarta.persistence.Column;

public class SubjectDto {
    private Long idSubject;
    private String subjectName;
    private String subjectDescription;
    private Double subjectPercentage;
    private String subjectStatus;
    private Long idCourseSubject;

    public Long getIdCourseSubject() {
        return idCourseSubject;
    }
    public void setIdCourseSubject(Long idCourseSubject) {
        this.idCourseSubject = idCourseSubject;
    }

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


}
