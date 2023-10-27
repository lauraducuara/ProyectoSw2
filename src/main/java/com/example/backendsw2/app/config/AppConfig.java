package com.example.backendsw2.app.config;


import com.example.backendsw2.adapter.cipher.ChiperInfoImpl;
import com.example.backendsw2.adapter.repository.CourseRepository;
import com.example.backendsw2.adapter.repository.UserRepository;

import com.example.backendsw2.adapter.repository.ProfessorRepository;
import com.example.backendsw2.adapter.repository.SubjectRepository;
import com.example.backendsw2.usecase.course.ConsultCourseUseCase;
import com.example.backendsw2.usecase.course.CreateCourseUseCase;
import com.example.backendsw2.usecase.course.DeleteCourseUseCase;
import com.example.backendsw2.usecase.course.UpdateCourseUseCase;
import com.example.backendsw2.usecase.port.CipherInfo;
import com.example.backendsw2.usecase.professor.ConsultProfessorUseCase;
import com.example.backendsw2.usecase.professor.CreateProfessorUseCase;
import com.example.backendsw2.usecase.professor.DeleteProfessorUseCase;
import com.example.backendsw2.usecase.professor.UpdateProfessorUseCase;
import com.example.backendsw2.usecase.subject.ConsultSubjectUseCase;
import com.example.backendsw2.usecase.subject.CreateSubjectUseCase;
import com.example.backendsw2.usecase.user.ConsultUserUseCase;
import com.example.backendsw2.usecase.user.CreateUserUseCase;
import com.example.backendsw2.usecase.user.UpdateUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //configuración

    @Autowired//traerla es como el constructor
    private CourseRepository courseRepository;

    @Autowired//traerla es como el constructor
    private SubjectRepository subjectRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private UserRepository userRepository;

    @Bean
    public CreateCourseUseCase createCourseUseCase(){
        return new CreateCourseUseCase(courseRepository);
    }
    @Bean
    public ConsultCourseUseCase ConsultCourseUseCase(){
        return new ConsultCourseUseCase(courseRepository);
    }
    @Bean
    public UpdateCourseUseCase UpdateCourseUseCase(){
        return new UpdateCourseUseCase(courseRepository);
    }
    @Bean
    public DeleteCourseUseCase DeleteCourseUseCase(){
        return new DeleteCourseUseCase(courseRepository);
    }




    @Bean
    public CreateSubjectUseCase createSubjectUseCase(){return new CreateSubjectUseCase(subjectRepository, courseRepository);}

    @Bean
    public ConsultSubjectUseCase consultSubjectUseCase(){return  new ConsultSubjectUseCase(subjectRepository);}


    @Bean
    public CipherInfo cipherInfo(){
        return new ChiperInfoImpl ();
    }


    @Bean
    public CreateProfessorUseCase createProfessorUseCase(){return  new CreateProfessorUseCase(professorRepository, cipherInfo(), courseRepository);}
    @Bean
    public ConsultProfessorUseCase consultProfessorUseCase(){return new ConsultProfessorUseCase(professorRepository);}
    @Bean
    public UpdateProfessorUseCase updateProfessorUseCase(){return new UpdateProfessorUseCase(professorRepository);}
    @Bean
    public DeleteProfessorUseCase deleteProfessorUseCase(){return new DeleteProfessorUseCase(professorRepository);}


    @Bean
    public CreateUserUseCase createUserUseCase(){
        return new CreateUserUseCase(userRepository, cipherInfo());
    }
    @Bean
    public ConsultUserUseCase consultUserUseCase(){
        return new ConsultUserUseCase(userRepository);
    }
    @Bean
    public UpdateUserUseCase updateUserUseCase(){
        return new UpdateUserUseCase(userRepository);
    }
}
