package com.example.backendsw2.app.rest;


import com.example.backendsw2.adapter.repository.UserRepository;
import com.example.backendsw2.domain.dto.UserDto;
import com.example.backendsw2.usecase.user.ConsultUserUseCase;
import com.example.backendsw2.usecase.user.CreateUserUseCase;
import com.example.backendsw2.usecase.user.UpdateUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*") // Indica el origen permitido
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CreateUserUseCase createUserUseCase;
    @Autowired
    private ConsultUserUseCase consultUserUseCase;
    @Autowired
    private UpdateUserUseCase updateUserUseCase;



    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody UserDto UserDto) {
        //se neceista el caso de uso
        this.createUserUseCase.execute(UserDto);
    }


    @GetMapping("/login")
    public List<UserDto> login(
            @RequestParam String username,
            @RequestParam String password
    ) {
        List<UserDto> userList = consultUserUseCase.executeTwo (username, password);
        // return this.consultCourseUseCase.execute();
        return userList;
        // Compara las credenciales con un usuario en una lista o base de datos
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDto> showUser() {
        List<UserDto> userList = consultUserUseCase.execute();
        // return this.consultCourseUseCase.execute();
        return userList;
    }
    @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public void updateUser(@RequestBody UserDto userDto) {
        //se neceista el caso de uso
        this.updateUserUseCase.execute(userDto);
    }

}