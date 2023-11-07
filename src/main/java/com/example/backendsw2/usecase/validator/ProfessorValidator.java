package com.example.backendsw2.usecase.validator;



import com.example.backendsw2.domain.dto.ProfessorDto;
import com.example.backendsw2.domain.exception.ClassException;

import static java.util.Objects.isNull;

public class ProfessorValidator {
    public static void validateInputDto(ProfessorDto dto){
        if(isNull( dto ))
            throw new ClassException ("El docente no puede ser nulo");
        if(dto.getProfessorCedula() == null || dto.getProfessorCedula() == 0)
            throw new ClassException("La cedula del profesor no puede ser nula");
        if(dto.getProfessorNameUser() == null || dto.getProfessorNameUser().trim().isEmpty())
            throw new ClassException("El nombre de usuario del profesor no puede ser nula");
        if(dto.getProfessorPassword() == null || dto.getProfessorPassword().trim().isEmpty())
            throw new ClassException("La contraseña del profesor no puede ser nula");
        if(dto.getProfessorName() == null || dto.getProfessorName().trim().isEmpty())
            throw new ClassException("El nombre del docente no puede ser nulo o vacio");
        if(dto.getProfessorLastName() == null || dto.getProfessorLastName().trim().isEmpty())
            throw new ClassException("El apellido del profesor no puede ser nula");
        if(dto.getProfessorSpecialization() == null || dto.getProfessorSpecialization().trim().isEmpty())
            throw new ClassException("La especializacion del docente no puede ser nulo o vacio");
        if(dto.getProfessorSalary() == 0)
            throw new ClassException("El salario no puede ser nulo ni vacio");
        if(dto.getProfessorEstatus() == null || dto.getProfessorEstatus().trim().isEmpty())
            throw new ClassException("El estado del docente no puede ser nulo o vacio");
        if(dto.getCourseName () == null || dto.getCourseName().trim().isEmpty())
            throw new ClassException("El curso del docente no puede ser nulo o vacio");
       }
}
