package com.example.backendsw2.adapter.repository;

import com.example.backendsw2.domain.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRepository extends JpaRepository <Course, Long> {

    @Query(value = "SELECT c FROM Course c")
    List<Course> findAll();
    @Query(value = "SELECT COUNT(c) FROM Course c WHERE c.courseName = :coursename")
    Long existsCourse(@Param("coursename") String coursename);
    @Query(value ="SELECT COUNT (c) FROM Course c WHERE c.idCourse = :idCourse")
    Long existsCourse(Long idCourse);

    @Query("UPDATE Course c SET c.courseName = :courseName, c.cedulaCourseDirector = :cedulaCourseDirector, " +
            "c.courseDescription = :courseDescription, c.course_grade = :courseGrade, " +
            "c.courseEstatus = :courseEstatus WHERE c.idCourse = :id")
    void updateCourse(Course course);

    @Query(value = "SELECT COUNT(c) > 0 FROM Course c WHERE c.courseName = :courseName")
    boolean existCourseString(@Param("courseName") String courseName);
    @Query(value = "DELETE FROM Course c WHERE c.idCourse = :idCourse")
    void deleteCourseByIdCourse(@Param("idCourse") Long idCourse);

    @Query(value = "SELECT COUNT(c) > 0 FROM Course c WHERE c.idCourse = :id")
    boolean existUserL(@Param("id") Long id);
    @Query(value = "SELECT c FROM Course c WHERE c.idCourse = :idCourse")
    Course findCourseById(@Param("idCourse") Long idCourse);
    @Query("SELECT c FROM Course c WHERE c.courseName = :courseName")
    List<Course> findByCourseName(@Param("courseName") String courseName);
}
