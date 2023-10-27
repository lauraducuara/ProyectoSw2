package com.example.backendsw2.usecase.validator;

import com.example.backendsw2.domain.dto.RegistryDto;
import com.example.backendsw2.domain.exception.ClassException;

import static java.util.Objects.isNull;

public class RegistryValidator {

    public static void validateInputDto(RegistryDto dto) {
        if(isNull( dto ))
            throw new ClassException ("El registro no puede ser nulo");
        if(dto.getNumberRegistry() == null || dto.getNumberRegistry() == 0)
            throw new ClassException("El numero de registro no puede ser nulo");
        if(dto.getTypeRegistry() == null || dto.getTypeRegistry().trim().isEmpty())
            throw new ClassException("El tipo de registro no puede ser nulo");
        if(dto.getNameCourse() == null || dto.getNameCourse() == 0)
            throw new ClassException("El nombre del curso no puede ser nulo");
        if(dto.getIdStudent() == null || dto.getIdStudent() == 0)
            throw new ClassException("El id del estudiante no puede ser nulo");
        if(dto.getNameStudent() == null || dto.getNameStudent().trim().isEmpty())
            throw new ClassException("El nombre del estudiante no puede ser nulo");
        if(dto.getLastNameStudent() == null || dto.getLastNameStudent().trim().isEmpty())
            throw new ClassException("El apellido del estudiante no puede ser nulo");
        if(dto.getStatusRegistry() == null || dto.getStatusRegistry().trim().isEmpty())
            throw new ClassException("La direccion del registro no puede ser nulo");
    }
}
