package com.example.backendsw2.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
public class CourseDto implements Serializable {
    private Long idCourse;
    private String courseName;
    private Long cedulaCourseDirector;
    private String courseDescription;
    private int course_grade;
    private String courseEstatus;

    // Constructor sin argumentos
    public CourseDto() {
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

    public String getCourseDescription() {
        return courseDescription;
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

    public String getCourseEstatus() {
        return courseEstatus;
    }
    public void setCourseEstatus(String courseEstatus) {
        this.courseEstatus = courseEstatus;
    }


    public void setCedulaCourseDirector(Long cedulaCourseDirector) {
        this.cedulaCourseDirector = cedulaCourseDirector;
    }

}
