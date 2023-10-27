package com.example.backendsw2.usecase.user;


import com.example.backendsw2.adapter.repository.UserRepository;
import com.example.backendsw2.domain.dto.UserDto;
import com.example.backendsw2.domain.entities.User;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.usecase.validator.UserValidator;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UpdateUserUseCase {

    private UserRepository userRepository;

    public UpdateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(UserDto dto) {
        // Verificar que el usuario exista
        User existingUser = userRepository.findUserById(dto.getId());
        if (existingUser == null) {
            throw new ClassException ("Usuario no encontrado");
        }

        // Validar información del usuario
        UserValidator.validateInputDto(dto);

        // Verificar si el nuevo nombre de usuario ya está en uso por otro usuario
        if (!existingUser.getName ().equalsIgnoreCase(dto.getName())
                && userRepository.existUserString(dto.getName().trim())) {
            throw new ClassException ("El nuevo nombre de usuario ya está en uso");
        }

        // Actualizar los campos del usuario existente
        existingUser.setName (dto.getName ());
        existingUser.setEmail(dto.getEmail());
        existingUser.setPassword(dto.getPassword());

        // Guardar los cambios en el repositorio
        userRepository.updateUser (existingUser.getName (), existingUser.getEmail (), existingUser.getPassword ());
    }

}