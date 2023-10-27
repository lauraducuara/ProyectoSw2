package com.example.backendsw2.usecase.subject;


import com.example.backendsw2.adapter.repository.SubjectRepository;

public class DeleteSubjectUseCase {

    private SubjectRepository subjectRepository;

    public DeleteSubjectUseCase(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
    public void execute(Long id){
        if(!subjectRepository.existUserL(id)){
            throw new RuntimeException("Asignatura no se encuentra");
        }
        //crea update
        this.subjectRepository.deleteSubjectById(id);
    }
}

