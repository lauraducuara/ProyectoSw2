package com.example.backendsw2.domain.dto;

public class ProfessorBasicDto {
    private Long professorCedula;
    private String professorName;
    private String professorLastName;
    public ProfessorBasicDto (Long professorCedula, String professorName, String professorLastName) {
        this.professorCedula = professorCedula;
        this.professorName = professorName;
        this.professorLastName = professorLastName;
    }

    public Long getProfessorCedula () {
        return professorCedula;
    }

    public void setProfessorCedula (Long professorCedula) {
        this.professorCedula = professorCedula;
    }

    public String getProfessorName () {
        return professorName;
    }

    public void setProfessorName (String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorLastName () {
        return professorLastName;
    }

    public void setProfessorLastName (String professorLastName) {
        this.professorLastName = professorLastName;
    }
}
