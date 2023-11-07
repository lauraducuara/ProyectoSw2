package com.example.backendsw2.usecase.course;


import com.example.backendsw2.adapter.repository.CourseRepository;

public class DeleteCourseUseCase {
    private CourseRepository courseRepository;

    public  DeleteCourseUseCase(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void execute(Long id){
        if(!courseRepository.existUserL(id)){
            throw new RuntimeException("Curso no se encuentra");
        }
        this.courseRepository.deleteById (id);
    }
}
