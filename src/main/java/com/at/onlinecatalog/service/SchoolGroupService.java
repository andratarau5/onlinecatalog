package com.at.onlinecatalog.service;

import com.at.onlinecatalog.model.SchoolGroup;
import com.at.onlinecatalog.model.Student;
import com.at.onlinecatalog.repository.SchoolGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ISchoolGroupService")
public class SchoolGroupService {
    @Autowired
    private SchoolGroupRepository schoolGroupRepository;

    public List<SchoolGroup> findAll() {
        return schoolGroupRepository.findAll();
    }

    public void save(SchoolGroup schoolGroup){
        schoolGroupRepository.save(schoolGroup);
    }

    public List<Student> findStudentsByGroup(Integer id) {
        return schoolGroupRepository.findById(id).get().getStudents();
        //TODO: try catch/check if present
    }
}