package com.example.backendsw2.usecase.course;

import com.example.backendsw2.adapter.repository.CourseRepository;
import com.example.backendsw2.domain.dto.CourseDto;
import com.example.backendsw2.domain.entities.Course;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.usecase.validator.CourseValidator;

public class UpdateCourseUseCase {

    private CourseRepository courseRepository;

    public UpdateCourseUseCase(CourseRepository userRepository) {
        this.courseRepository = userRepository;
    }

    public void execute(CourseDto dto) {
        // Verificar que el usuario exista
        Course existingCourse = courseRepository.findCourseById(dto.getIdCourse());
        if (existingCourse == null) {
            throw new ClassException ("Usuario no encontrado");
        }

        // Validar información del usuario
        CourseValidator.validateInputDto(dto);

        // Verificar si el nuevo nombre de usuario ya está en uso por otro usuario
        // Verificar si el nuevo nombre de usuario ya está en uso por otro usuario
        if (existingCourse.getCourseName() == dto.getCourseName()
                && courseRepository.existCourseString(dto.getCourseName().toString().trim())) {
            throw new ClassException("El nuevo nombre de usuario ya está en uso");
        }

        // Actualizar los campos del usuario existente
        existingCourse.setCourseName(dto.getCourseName());
        existingCourse.setCourseDirector(dto.getCedulaCourseDirector());
        existingCourse.setCourseDescription(dto.getCourseDescription());
        existingCourse.setCourse_grade(dto.getCourse_grade());
        existingCourse.setCourseEstatus(dto.getCourseEstatus());

        // Guardar los cambios en el repositorio
        courseRepository.updateCourse(existingCourse);
    }
}
