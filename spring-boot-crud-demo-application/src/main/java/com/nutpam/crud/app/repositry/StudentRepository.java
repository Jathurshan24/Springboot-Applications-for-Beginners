package com.nutpam.crud.app.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutpam.crud.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
