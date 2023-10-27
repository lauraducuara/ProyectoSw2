package com.example.backendsw2.domain.dto;


public class RegistryDto {

    private Long numberRegistry;
    private String typeRegistry;
    private Long nameCourse;

    private Long idStudent;
    private String nameStudent;
    private String lastNameStudent;

    private String statusRegistry;



    public String getStatusRegistry() {
        return statusRegistry;
    }
    public void setStatusRegistry(String statusRegistry) {
        this.statusRegistry = statusRegistry;
    }
    public Long getNumberRegistry() {
        return numberRegistry;
    }

    public void setNumberRegistry(Long numberRegistry) {
        this.numberRegistry = numberRegistry;
    }

    public String getTypeRegistry() {
        return typeRegistry;
    }

    public void setTypeRegistry(String typeRegistry) {
        this.typeRegistry = typeRegistry;
    }

    public Long getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(Long nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }
}

