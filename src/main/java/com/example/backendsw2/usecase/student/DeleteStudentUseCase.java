package com.example.backendsw2.usecase.student;


import com.example.backendsw2.adapter.repository.Studentpository;

public class DeleteStudentUseCase {

    private Studentpository studentpository;

    public  DeleteStudentUseCase(Studentpository studentpository) {
        this.studentpository = studentpository;
    }

    public void execute(Long id){
        if(!studentpository.existUserL(id)){
            throw new RuntimeException("Usuario no se encuentra");
        }
        this.studentpository.deleteStudentById(id);
    }
}
