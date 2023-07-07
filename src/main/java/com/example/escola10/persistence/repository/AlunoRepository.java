package com.example.escola10.persistence.repository;

import com.example.escola10.persistence.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
