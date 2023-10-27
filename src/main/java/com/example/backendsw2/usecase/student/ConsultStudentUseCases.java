package com.example.backendsw2.usecase.student;


import com.example.backendsw2.adapter.repository.Studentpository;
import com.example.backendsw2.domain.dto.StudentDto;
import com.example.backendsw2.domain.entities.Student;
import com.example.backendsw2.domain.mapper.StudentMapper;

import java.util.List;

public class ConsultStudentUseCases {
    private Studentpository studentpository;


    public ConsultStudentUseCases(Studentpository studentpository) {
        this.studentpository = studentpository;
    }

    public List<StudentDto> execute() {
        List<Student> students = studentpository.findAll();
        List<StudentDto> listStudent = StudentMapper.INSTANCE.toDto(students);


        return listStudent;
    }
}
