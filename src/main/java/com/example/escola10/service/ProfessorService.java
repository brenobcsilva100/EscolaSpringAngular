package com.example.escola10.service;

import com.example.escola10.persistence.model.Professor;
import com.example.escola10.persistence.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Professor salvar(Professor professor) {
        return professorRepository.save(professor);
    }

    public List<Professor> mostrar() {
        return professorRepository.findAll();
    }
}
