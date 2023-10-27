package com.example.backendsw2.domain.mapper;


import com.example.backendsw2.domain.dto.UserDto;
import com.example.backendsw2.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto toDto(User course);

    User toEntity(UserDto course);

    List<UserDto> toDto(List<User> course);

    List<User> toEntity(List<UserDto> course);


}