package com.at.onlinecatalog.repository;

import com.at.onlinecatalog.model.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DisciplineRepository extends JpaRepository<Discipline,Integer> {
}
