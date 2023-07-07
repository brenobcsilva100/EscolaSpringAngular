package com.example.escola10.controller;

import com.example.escola10.persistence.model.Professor;
import com.example.escola10.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping("/cadastrarProfessor")
    public ResponseEntity<Professor> cadastrarProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorService.salvar(professor), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarProfessor")
    public ResponseEntity<List<Professor>> mostrarProfessor(){
        return new ResponseEntity<>(professorService.mostrar(), HttpStatus.OK);
    }

}
