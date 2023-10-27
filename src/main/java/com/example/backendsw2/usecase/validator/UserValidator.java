package com.example.backendsw2.usecase.validator;
import com.example.backendsw2.domain.dto.UserDto;
import com.example.backendsw2.domain.exception.ClassException;

import static java.util.Objects.isNull;

public class UserValidator {
    public static void validateInputDto(UserDto dto){
        if(isNull( dto ))
            throw new ClassException ("El usuario no puede ser nul");
        if(dto.getName () == null || dto.getName().trim().isEmpty())
            throw new ClassException("El nombre del usuario no puede ser nulo o vacio");
        if(dto.getEmail () == null || dto.getEmail().trim().isEmpty())
            throw new ClassException("El email del usuario no puede ser nula");
        if(dto.getPassword () == null || dto.getPassword().trim().isEmpty())
            throw new ClassException("La contraseña del usuario no puede ser nula o vacia");
    }
}