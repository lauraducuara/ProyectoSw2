package com.example.backendsw2.app.rest;

import com.example.backendsw2.adapter.repository.ProfessorRepository;
import com.example.backendsw2.domain.dto.ProfessorDto;
import com.example.backendsw2.usecase.professor.ConsultProfessorUseCase;
import com.example.backendsw2.usecase.professor.CreateProfessorUseCase;
import com.example.backendsw2.usecase.professor.DeleteProfessorUseCase;
import com.example.backendsw2.usecase.professor.UpdateProfessorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CreateProfessorUseCase createProfessorUseCase;
    @Autowired
    private ConsultProfessorUseCase consultProfessorUseCase;
    @Autowired
    private UpdateProfessorUseCase updateProfessorUseCase;
    @Autowired
    private DeleteProfessorUseCase deleteProfessorUseCase;


    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createProfessor(@RequestBody ProfessorDto professorDto) {
        //se neceista el caso de uso
        this.createProfessorUseCase.execute(professorDto);
    }

    @GetMapping(value = "/show", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProfessorDto> showUser() {
        return this.consultProfessorUseCase.execute();
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public void updateProfessor(@RequestBody ProfessorDto professorDto) {
        //se neceista el caso de uso
        this.updateProfessorUseCase.execute(professorDto);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCourse(@PathVariable(value="idProfessor") Long idProfessor) {
        // Necesitas el caso de uso para eliminar el curso
        this.deleteProfessorUseCase.execute(idProfessor);
    }
}
