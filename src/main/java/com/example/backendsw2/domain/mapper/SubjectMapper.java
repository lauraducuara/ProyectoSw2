package com.example.backendsw2.domain.mapper;

import com.example.backendsw2.domain.dto.SubjectDto;
import com.example.backendsw2.domain.entities.Subjects;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface SubjectMapper {
    SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);

    SubjectDto toDto(Subjects subject);

    Subjects toEntity(SubjectDto subject);

    List<SubjectDto> toDto(List<Subjects> subject);

    List<Subjects> toEntity(List<SubjectDto> subject);

}
