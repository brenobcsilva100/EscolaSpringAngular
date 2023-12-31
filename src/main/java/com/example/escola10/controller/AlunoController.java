package com.example.escola10.controller;

import com.example.escola10.persistence.model.Aluno;
import com.example.escola10.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/cadastrarAluno")
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno){
        return new ResponseEntity<>(alunoService.salvar(aluno), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarAluno")
    public ResponseEntity<List<Aluno>> mostrarAluno(){
        return new ResponseEntity<>(alunoService.mostrar(), HttpStatus.OK);
    }

}
