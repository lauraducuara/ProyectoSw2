package com.example.backendsw2.usecase.validator;

import com.example.backendsw2.domain.dto.CourseDto;
import com.example.backendsw2.domain.exception.ClassException;

import static java.util.Objects.isNull;

public class CourseValidator {

    public static void validateInputDto(CourseDto dto){
        if(isNull( dto ))
            throw new ClassException ("El curso no puede ser nulo");
        if(dto.getCourseName()== null || dto.getCourseName().toString().trim().isEmpty())
            throw new ClassException("El nombre del curso no puede ser nulo o vacio");
        if(dto.getCedulaCourseDirector() == null || dto.getCedulaCourseDirector().toString().trim().isEmpty())
            throw new ClassException("La cedula del director de curso no puede ser nulo o vacio");
        if(dto.getCourseDescription() == null || dto.getCourseDescription().trim().isEmpty())
            throw new ClassException("La descripción no puede ser nulo o vacio");
        if(dto.getCourse_grade() == 0)
            throw new ClassException("El grado no puede ser nula o vacia");
        if(dto.getCourseEstatus() == null || dto.getCourseEstatus().trim().isEmpty())
            throw new ClassException("El estado del curso no puede ser nulo o vacio");
    }


}
