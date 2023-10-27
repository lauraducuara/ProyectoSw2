package com.example.backendsw2.usecase.course;

import com.example.backendsw2.adapter.repository.CourseRepository;
import com.example.backendsw2.domain.dto.CourseDto;
import com.example.backendsw2.domain.entities.Course;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.domain.mapper.CourseMapper;
import com.example.backendsw2.usecase.port.CipherInfo;
import com.example.backendsw2.usecase.validator.CourseValidator;

public class CreateCourseUseCase {


    private CourseRepository courseRepository;
    private CipherInfo cipherInfo;




    public CreateCourseUseCase (CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
        this.cipherInfo = cipherInfo;
    }




    public void execute(CourseDto dto) {
        // validar informacion de usuario
        CourseValidator.validateInputDto(dto);
        // validar que el usuario no exista
        if(this.courseRepository.existsCourse(dto.getCourseName().toString().trim()).intValue() > 0)
            throw new ClassException ("El curso ya existe");
        // convertir dto a entidad
        Course course = CourseMapper.INSTANCE.toEntity(dto);
        // guardar usuario
        this.courseRepository.save(course);

    }

}

