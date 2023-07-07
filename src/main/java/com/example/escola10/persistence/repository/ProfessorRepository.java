package com.example.escola10.persistence.repository;

import com.example.escola10.persistence.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
