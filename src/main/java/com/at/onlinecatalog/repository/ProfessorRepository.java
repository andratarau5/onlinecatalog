package com.at.onlinecatalog.repository;

import com.at.onlinecatalog.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {
}
