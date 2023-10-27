package com.example.backendsw2.usecase.subject;


import com.example.backendsw2.adapter.repository.SubjectRepository;
import com.example.backendsw2.domain.dto.SubjectDto;
import com.example.backendsw2.domain.entities.Subjects;
import com.example.backendsw2.domain.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultSubjectUseCase {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    public ConsultSubjectUseCase(
            SubjectRepository subjectRepository
    ) {
        this.subjectRepository = subjectRepository;
    }

    public List<SubjectDto> execute() {
        List<Subjects> subjects = subjectRepository.findAll();
        return SubjectMapper.INSTANCE.toDto(subjects);
    }
//professorSubjectRepository.findProfessorsBySubjectName(subjectName);

    public List<Object[]> getProfessorCedulaBySubjectName(String subjectName) {
        return subjectRepository.findProfessorCedulaBySubjectName(subjectName);
    }



}

