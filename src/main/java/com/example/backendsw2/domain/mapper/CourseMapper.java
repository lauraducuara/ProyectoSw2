package com.example.backendsw2.domain.mapper;


import com.example.backendsw2.domain.dto.CourseDto;
import com.example.backendsw2.domain.entities.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CourseMapper {
    //aqui solo se pasan los entities y dao
//solo va a haber una instancia pasarlo por parametro sin el objeto
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    CourseDto toDto(Course course);

    Course toEntity(CourseDto course);

    List<CourseDto> toDto(List<Course> course);

    List<Course> toEntity(List<CourseDto> course);
}