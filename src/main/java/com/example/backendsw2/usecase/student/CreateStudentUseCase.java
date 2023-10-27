package com.example.backendsw2.usecase.student;


import com.example.backendsw2.adapter.repository.Studentpository;
import com.example.backendsw2.domain.dto.StudentDto;
import com.example.backendsw2.domain.entities.Student;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.domain.mapper.StudentMapper;
import com.example.backendsw2.usecase.port.CipherInfo;
import com.example.backendsw2.usecase.validator.StudentValidator;

public class CreateStudentUseCase {


    private Studentpository studentpository;
    private CipherInfo cipherInfo;


    public CreateStudentUseCase(Studentpository studentpository, CipherInfo cipherInfo){
        this.studentpository = studentpository;
        this.cipherInfo = cipherInfo;
    }
    public void execute(StudentDto dto) {
        // validar informacion de usuario
        StudentValidator.validateInputDto(dto);
        // validar que el usuario no exista
        if(this.studentpository.existsStudent(dto.getStudentNameUser().trim()).intValue() > 0)
            throw new ClassException ("El alumno ya existe");
        // convertir dto a entidad
        Student student = StudentMapper.INSTANCE.toEntity(dto);
        // guardar usuario
        this.studentpository.save(student);

    }

}


