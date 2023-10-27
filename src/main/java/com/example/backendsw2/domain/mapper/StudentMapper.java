package com.example.backendsw2.domain.mapper;

import com.example.backendsw2.domain.dto.StudentDto;
import com.example.backendsw2.domain.entities.Student;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto toDto(Student student);

    Student toEntity(StudentDto student);

    List<StudentDto> toDto(List<Student> student);

    List<Student> toEntity(List<StudentDto> student);
}
