package com.example.backendsw2.usecase.course;

import com.example.backendsw2.adapter.repository.CourseRepository;
import com.example.backendsw2.domain.dto.CourseDto;
import com.example.backendsw2.domain.entities.Course;
import com.example.backendsw2.domain.mapper.CourseMapper;

import java.util.List;

public class ConsultCourseUseCase {

    private CourseRepository courseRepository;
    private Course course;

    public ConsultCourseUseCase(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseDto> execute() {
        List<Course> course = courseRepository.findAll();
        List<CourseDto> listUsers = CourseMapper.INSTANCE.toDto(course);

        return listUsers;
    }

    public Course executeTwo(Long id) {
        Course course = courseRepository.findCourseById(id);
        return course;
    }
}
