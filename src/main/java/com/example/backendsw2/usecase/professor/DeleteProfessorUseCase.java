package com.example.backendsw2.usecase.professor;


import com.example.backendsw2.adapter.repository.ProfessorRepository;

public class DeleteProfessorUseCase {

    private ProfessorRepository professorRepository;

    public  DeleteProfessorUseCase(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public void execute(Long id){
        if(!professorRepository.existUserL(id)){
            throw new RuntimeException("Usuario no se encuentra");
        }
        this.professorRepository.deleteProfessorById(id);
    }
}

