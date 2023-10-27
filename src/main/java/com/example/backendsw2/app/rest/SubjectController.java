package com.example.backendsw2.app.rest;

import com.example.backendsw2.adapter.repository.SubjectRepository;
import com.example.backendsw2.domain.dto.SubjectDto;
import com.example.backendsw2.usecase.subject.ConsultSubjectUseCase;
import com.example.backendsw2.usecase.subject.CreateSubjectUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;


    @Autowired
    private CreateSubjectUseCase createSubjectUseCase;
    @Autowired
    private ConsultSubjectUseCase consultSubjectUseCase;
    //  @Autowired
    //private UpdateCourseUseCase updateCourseUseCase;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createSubject(@RequestBody SubjectDto subjectDto) {
        //se neceista el caso de uso
        this.createSubjectUseCase.execute(subjectDto);
    }

    @GetMapping(value = "/mostrar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SubjectDto> showUser() {
        return this.consultSubjectUseCase.execute();
    }

    @GetMapping("/professor-cedula-by-subject")
    public List<Object[]> getProfessorCedulaBySubjectName(@RequestParam String subjectName) {
        return consultSubjectUseCase.getProfessorCedulaBySubjectName(subjectName);
    }

  /*@PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public void updateUser(@RequestBody SubjectDto subjectDto) {
      //se neceista el caso de uso
      this.consultSubjectUseCase.execute(subjectDto);
 }
*/
}

