package com.example.backendsw2.domain.mapper;


import com.example.backendsw2.domain.dto.RegistryDto;
import com.example.backendsw2.domain.entities.Registry;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RegistryMapper {

    RegistryMapper INSTANCE = Mappers.getMapper(RegistryMapper.class);

    RegistryDto toDto(Registry registry);

    Registry toEntity(RegistryDto user);

    List<RegistryDto> toDto(List<Registry> course);

    List<Registry> toEntity(List<RegistryDto> course);
}
