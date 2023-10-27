package com.example.backendsw2.usecase.validator;


import com.example.backendsw2.domain.dto.SubjectDto;
import com.example.backendsw2.domain.exception.ClassException;

import static java.util.Objects.isNull;

public class SubjectValidator {
    public static void validateInputDto(SubjectDto dto){
        if(isNull( dto ))
            throw new ClassException ("La asignatura no puede ser nula");
        if(dto.getSubjectName() == null || dto.getSubjectName().trim().isEmpty())
            throw new ClassException("El nombre de la asignatura no puede ser nulo o vacio");
        if(dto.getSubjectDescription() == null || dto.getSubjectDescription().trim().isEmpty())
            throw new ClassException("La descripción de la asignatura no puede ser nula");
        if(dto.getSubjectPercentage() == 0)
            throw new ClassException("La asignatura debe tener un porcentaje");
        if(dto.getSubjectStatus() == null || dto.getSubjectStatus().trim().isEmpty())
            throw new ClassException("El estado de la asignatura no puede ser nulo o vacio");
        if(dto.getIdCourseSubject() == null || dto.getIdCourseSubject() == 0)
            throw new ClassException("El id del curso no debe ser nula");

    }
}
