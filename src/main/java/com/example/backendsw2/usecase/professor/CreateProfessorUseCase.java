package com.example.backendsw2.usecase.professor;


import com.example.backendsw2.adapter.repository.CourseRepository;
import com.example.backendsw2.adapter.repository.ProfessorRepository;
import com.example.backendsw2.domain.dto.ProfessorDto;
import com.example.backendsw2.domain.entities.Course;
import com.example.backendsw2.domain.entities.Professor;
import com.example.backendsw2.domain.exception.ClassException;
import com.example.backendsw2.domain.mapper.ProfessorMapper;
import com.example.backendsw2.usecase.port.CipherInfo;
import com.example.backendsw2.usecase.validator.ProfessorValidator;

public class CreateProfessorUseCase {

    private ProfessorRepository professorRepository;
    private CourseRepository courseRepository; // Agregamos el repositorio de cursos
    private CipherInfo cipherInfo;




    public CreateProfessorUseCase(ProfessorRepository professorRepository, CipherInfo cipherInfo, CourseRepository courseRepository){
        this.professorRepository = professorRepository;
        this.cipherInfo = cipherInfo;
        this.courseRepository = courseRepository; // Agregamos el repositorio de cursos
    }

    public void execute(ProfessorDto dto) {
        // validar informacion de usuario
        ProfessorValidator.validateInputDto(dto);

        String courseId = dto.getCourseName();

        Course course = courseRepository.findById(Long.valueOf (courseId)).orElse(null);

        if (course != null) {
            // convertir dto a entidad
            Professor professor = ProfessorMapper.INSTANCE.toEntity(dto);

            professor.setCourseName((course.getCourseName()));

            // guardar usuario
            this.professorRepository.save(professor);
        } else {
            throw new ClassException ("El curso no existe");
        }
    }

}
