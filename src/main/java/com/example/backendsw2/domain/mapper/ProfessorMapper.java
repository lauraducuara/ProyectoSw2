package com.example.backendsw2.domain.mapper;

import com.example.backendsw2.domain.dto.ProfessorDto;
import com.example.backendsw2.domain.entities.Professor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProfessorMapper  {
    ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);

    ProfessorDto toDto(Professor user);

    Professor toEntity(ProfessorDto user);

    List<ProfessorDto> toDto(List<Professor> course);

    List<Professor> toEntity(List<ProfessorDto> course);
}
