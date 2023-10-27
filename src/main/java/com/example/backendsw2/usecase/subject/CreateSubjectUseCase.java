package com.example.backendsw2.usecase.subject;


import com.example.backendsw2.adapter.repository.CourseRepository;
import com.example.backendsw2.adapter.repository.SubjectRepository;
import com.example.backendsw2.domain.dto.SubjectDto;
import com.example.backendsw2.domain.entities.Subjects;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.domain.mapper.SubjectMapper;
import com.example.backendsw2.usecase.validator.SubjectValidator;

public class CreateSubjectUseCase {

    private SubjectRepository subjectRepository;
    private CourseRepository courseRepository;



    public CreateSubjectUseCase(SubjectRepository subjectRepository, CourseRepository courseRepository){
        this.subjectRepository = subjectRepository;
        this.courseRepository = courseRepository;
    }

    public void execute(SubjectDto dto) {
        // validar informacion de usuario
        SubjectValidator.validateInputDto(dto);
        // validar que el usuario no exista
        if(this.subjectRepository.existsSubject(dto.getSubjectName().trim()).intValue() > 0)
            throw new ClassException ("El curso ya existe");
        // convertir dto a entidad
        Subjects subjects = SubjectMapper.INSTANCE.toEntity(dto);
        // guardar usuario
        this.subjectRepository.save(subjects);
        //validar pq entra nulll

    }


}

