package com.example.backendsw2.usecase.validator;


import com.example.backendsw2.domain.dto.StudentDto;
import com.example.backendsw2.domain.exception.ClassException;

import static java.util.Objects.isNull;

public class StudentValidator {

    public static void validateInputDto(StudentDto dto){
        if(isNull( dto ))
            throw new ClassException ("El docente no puede ser nulo");
        if(isNull( dto.getStudentName() ) || dto.getStudentName().trim().isEmpty())
            throw new ClassException("El nombre del estudiante no puede ser nulo o vacio");
        if(isNull( dto.getStudentLastName() ) || dto.getStudentLastName().trim().isEmpty())
            throw new ClassException("El apellido del estudiante no puede ser nulo o vacio");
        if(isNull( dto.getStudentEmail() ) || dto.getStudentEmail().trim().isEmpty())
            throw new ClassException("El correo del estudiante no puede ser nulo o vacio");
        if(isNull( dto.getStudentNameUser() ) || dto.getStudentNameUser().trim().isEmpty())
            throw new ClassException("El nombre de usuario del estudiante no puede ser nulo o vacio");
        if(isNull( dto.getStudentPassword() ) || dto.getStudentPassword().trim().isEmpty())
            throw new ClassException("La contraseña del estudiante no puede ser nulo o vacio");
        if(isNull( dto.getStudentAddress() ) || dto.getStudentAddress().trim().isEmpty())
            throw new ClassException("La direccion del estudiante no puede ser nulo o vacio");
        if(isNull( dto.getStudentStatus() ) || dto.getStudentStatus().trim().isEmpty())
            throw new ClassException("El estado del estudiante no puede ser nulo o vacio");
        if(isNull( dto.getStudentBirthDate() ) || dto.getStudentBirthDate().trim().isEmpty())
            throw new ClassException("La fecha de nacimiento del estudiante no puede ser nulo o vacio");
        if (isNull(dto.getNota()) || dto.getNota().toString().trim().isEmpty())
            throw new ClassException("La nota del estudiante no puede ser nulo o vacio");
        if (isNull(dto.getDesempenio()) || dto.getDesempenio().trim().isEmpty())
            throw new ClassException("El desempeño del estudiante no puede ser nulo o vacio");
        if (isNull(dto.getPeriodoAcademico()) || dto.getPeriodoAcademico().trim().isEmpty())
            throw new ClassException("El periodo academico del estudiante no puede ser nulo o vacio");
    }

}

