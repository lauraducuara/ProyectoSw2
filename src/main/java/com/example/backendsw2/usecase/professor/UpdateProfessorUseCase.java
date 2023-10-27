package com.example.backendsw2.usecase.professor;


import com.example.backendsw2.adapter.repository.ProfessorRepository;
import com.example.backendsw2.domain.dto.ProfessorDto;
import com.example.backendsw2.domain.entities.Professor;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.usecase.validator.ProfessorValidator;

public class UpdateProfessorUseCase {

    private ProfessorRepository professorRepository;

    public UpdateProfessorUseCase(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public void execute(ProfessorDto dto) {
        // Verificar que el usuario exista
        Professor existingProfessor = professorRepository.findProfessorById(dto.getProfessorCedula());
        if (existingProfessor == null) {
            throw new ClassException ("Profesor no encontrado");
        }

        // Validar información del usuario
        ProfessorValidator.validateInputDto(dto);

        // Verificar si el nuevo nombre de usuario ya está en uso por otro usuario
        // Verificar si el nuevo nombre de usuario ya está en uso por otro usuario
        if (!existingProfessor.getProfessorName ().equalsIgnoreCase(dto.getProfessorName())
                && professorRepository.existProfessorString(dto.getProfessorName().trim())) {
            throw new ClassException("El nuevo nombre de usuario ya está en uso");
        }

        // Actualizar los campos del usuario existente
        existingProfessor.setProfessorCedula(dto.getProfessorCedula());
        existingProfessor.setProfessorNameUser(dto.getProfessorNameUser());
        existingProfessor.setProfessorPassword(dto.getProfessorPassword());
        existingProfessor.setProfessorName(dto.getProfessorName());
        existingProfessor.setProfessorLastName(dto.getProfessorLastName());
        existingProfessor.setProfessorSalary(dto.getProfessorSalary());
        existingProfessor.setProfessorAddres(dto.getProfessorAddres());
        existingProfessor.setProfessorSpecialization(dto.getProfessorSpecialization());
        existingProfessor.setProfessorEstatus(dto.getProfessorEstatus());
        // Guardar los cambios en el repositorio
        professorRepository.updateProfessor(existingProfessor);
    }
}
