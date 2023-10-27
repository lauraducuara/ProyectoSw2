package com.example.backendsw2.domain.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "registry")
public class Registry {
    @ManyToOne
    private Course course;

    @OneToOne
    private Student student;

    @Id
    @Column(name = "number_registry")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numberRegistry;
    @Column(name = "type_registry")
    private String typeRegistry;
    @Column(name = "name_course")
    private Long nameCourse;
    @Column(name = "id_student")
    private Long idStudent;
    @Column(name = "name_student")
    private String nameStudent;
    @Column(name = "last_name_student")
    private String lastNameStudent;
    @Column(name = "status_registry")
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
