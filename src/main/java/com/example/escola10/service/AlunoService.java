package com.example.escola10.service;

import com.example.escola10.persistence.model.Aluno;
import com.example.escola10.persistence.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno salvar(Aluno Aluno) {
        return alunoRepository.save(Aluno);
    }

    public List<Aluno> mostrar() {
        return alunoRepository.findAll();
    }
    
}
