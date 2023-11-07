package com.example.backendsw2.app.rest;

import com.example.backendsw2.adapter.repository.CourseRepository;
import com.example.backendsw2.domain.dto.CourseDto;
import com.example.backendsw2.domain.entities.Course;
import com.example.backendsw2.usecase.course.ConsultCourseUseCase;
import com.example.backendsw2.usecase.course.CreateCourseUseCase;
import com.example.backendsw2.usecase.course.DeleteCourseUseCase;
import com.example.backendsw2.usecase.course.UpdateCourseUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@CrossOrigin(origins = "*") // Indica el origen permitido

public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CreateCourseUseCase createCourseUseCase;
    @Autowired
    private ConsultCourseUseCase consultCourseUseCase;
    @Autowired
    private UpdateCourseUseCase updateCourseUseCase;
    @Autowired
    private DeleteCourseUseCase deleteCourseUseCase;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody CourseDto courseDto) {
        //se neceista el caso de uso
        this.createCourseUseCase.execute(courseDto);
    }

    @GetMapping(value = "/show", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CourseDto> showUser() {
        List<CourseDto> courseList = consultCourseUseCase.execute();
        // return this.consultCourseUseCase.execute();
        return courseList;
    }

    @GetMapping(value = "/search/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Course findId(@PathVariable(value="id") Long idCourse) {
        Course c = consultCourseUseCase.executeTwo (idCourse);
        return c;
    }
    @PutMapping(value = "/update/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public void updateUser(@PathVariable(value="id") Long idCourse, @RequestBody CourseDto courseDto) {
        //se neceista el caso de uso
        this.updateCourseUseCase.execute(idCourse, courseDto);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCourse(@PathVariable(value="id") Long idCourse) {
        // Necesitas el caso de uso para eliminar el curso
        this.deleteCourseUseCase.execute(idCourse);
    }

}
