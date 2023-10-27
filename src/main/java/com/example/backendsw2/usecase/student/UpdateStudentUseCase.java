package com.example.backendsw2.usecase.student;


import com.example.backendsw2.adapter.repository.Studentpository;
import com.example.backendsw2.domain.dto.StudentDto;
import com.example.backendsw2.domain.entities.Student;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.usecase.validator.StudentValidator;

public class UpdateStudentUseCase {

    private Studentpository studentpository;

    public UpdateStudentUseCase(Studentpository studentpository) {
        this.studentpository = studentpository;
    }

    public void execute(StudentDto dto) {
        // Verificar que el usuario exista
        Student existingStudent = studentpository.findStudentById(dto.getIdStudent());
        if (existingStudent == null) {
            throw new ClassException ( "Estudiante no encontrado");
        }

        // Validar información del usuario
        StudentValidator.validateInputDto(dto);

        // Verificar si el nuevo nombre de usuario ya está en uso por otro usuario
        if (!existingStudent.getStudentName ().equalsIgnoreCase(dto.getStudentName())
                && studentpository.existStudentString(dto.getStudentName().trim())) {
            throw new ClassException("El nuevo nombre de usuario ya está en uso");
        }


        existingStudent.setIdStudent(dto.getIdStudent());
        existingStudent.setStudentName(dto.getStudentName());
        existingStudent.setStudentLastName(dto.getStudentLastName());
        existingStudent.setStudentEmail(dto.getStudentEmail());
        existingStudent.setStudentNameUser(dto.getStudentNameUser());
        existingStudent.setStudentPassword(dto.getStudentPassword());
        existingStudent.setStudentAddress(dto.getStudentAddress());
        existingStudent.setStudentStatus(dto.getStudentStatus());
        existingStudent.setStudentBirthDate(dto.getStudentBirthDate());
        existingStudent.setNota(dto.getNota());
        existingStudent.setDesempenio(dto.getDesempenio());
        existingStudent.setPeriodoAcademico(dto.getPeriodoAcademico());

        studentpository.updateStudent(existingStudent);

    }
}
