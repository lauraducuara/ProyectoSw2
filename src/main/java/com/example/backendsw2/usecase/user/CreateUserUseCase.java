package com.example.backendsw2.usecase.user;


import com.example.backendsw2.adapter.repository.UserRepository;
import com.example.backendsw2.domain.dto.UserDto;
import com.example.backendsw2.domain.entities.User;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.domain.mapper.UserMapper;
import com.example.backendsw2.usecase.port.CipherInfo;
import com.example.backendsw2.usecase.validator.UserValidator;

public class CreateUserUseCase {

    private UserRepository userRepository;
    private CipherInfo cipherInfo;


    public CreateUserUseCase(UserRepository userRepository, CipherInfo cipherInfo){
        this.userRepository = userRepository;
        this.cipherInfo = cipherInfo;
    }
    public void execute(UserDto dto) {
        // validar informacion de usuario
        UserValidator.validateInputDto(dto);
        // validar que el usuario no exista
        if(this.userRepository.existsUserByName (dto.getName ().toString().trim()).intValue() > 0)
            throw new ClassException ("El usuario ya existe");
        // convertir dto a entidad
        User user = UserMapper.INSTANCE.toEntity(dto);
     //   user.setPassword(this.cipherInfo.encrypt(dto.getPassword()));
        // guardar usuario
        this.userRepository.save(user);

    }
}