package com.at.onlinecatalog.repository;

import com.at.onlinecatalog.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends JpaRepository<Grade,Integer> {
}
