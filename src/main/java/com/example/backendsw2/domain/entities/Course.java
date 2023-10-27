package com.example.backendsw2.domain.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name= "course")
@Data
public class Course {

    @OneToMany(mappedBy = "course")
    private List<Professor> professors;

    @OneToMany(mappedBy = "course")
    private List<Subjects> subjects;

    @OneToMany(mappedBy = "course")
    private List<Registry> registry;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Long idCourse;
    @Column(name = "courseName", length = 50, nullable = false)
    private String courseName;
    @Column(name = "cedula_course_director")
    private Long cedulaCourseDirector;
    @Column(name = "course_description", length = 250)
    private String courseDescription;
    @Column(name = "grade", nullable = false)
    private int course_grade;
    @Column(name = "course_estatus", length = 50, nullable = false)
    private String courseEstatus;

    //Constructor sin argumentos
    public Course() {

    }

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCedulaCourseDirector() {
        return cedulaCourseDirector;
    }
    public void setCourseDirector(Long courseDirector) {
        this.cedulaCourseDirector = courseDirector;
    }

    public String getCourseDescription() {
        return courseDescription;
    }
    public String getCourseEstatus() {
        return courseEstatus;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getCourse_grade() {
        return course_grade;
    }

    public void setCourse_grade(int course_grade) {
        this.course_grade = course_grade;
    }

    public String getCourse(){
        return courseEstatus;
    }

    public void setCourseEstatus(String courseEstatus) {
        this.courseEstatus = courseEstatus;
    }

    public void setCedulaCourseDirector(Long cedulaCourseDirector) {
        this.cedulaCourseDirector = cedulaCourseDirector;
    }

}
