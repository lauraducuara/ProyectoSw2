package com.example.backendsw2.usecase.professor;


import com.example.backendsw2.adapter.repository.ProfessorRepository;
import com.example.backendsw2.domain.dto.ProfessorDto;
import com.example.backendsw2.domain.entities.Professor;
import com.example.backendsw2.domain.mapper.ProfessorMapper;

import java.util.List;

public class ConsultProfessorUseCase {
    private ProfessorRepository professorRepository;
    private Professor professor;

    public ConsultProfessorUseCase(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorDto> execute() {
        List<Professor> professor = professorRepository.findAll();
        List<ProfessorDto> listProfessor = ProfessorMapper.INSTANCE.toDto(professor);


        return listProfessor;
    }
}
