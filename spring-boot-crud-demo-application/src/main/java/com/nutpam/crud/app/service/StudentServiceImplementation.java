package com.nutpam.crud.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutpam.crud.app.model.Student;
import com.nutpam.crud.app.repositry.StudentRepository;

@Service
public class StudentServiceImplementation {

	@Autowired
	private StudentRepository studentRepo;
	
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	public Optional<Student> getStudentById(int id) {
		return studentRepo.findById(id);
	}
	
	public Student updateStudentRecord(Student student, int id) {
		
		Student existingStudent = studentRepo.findById(id).get();
		
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		
		return studentRepo.save(existingStudent);
		
	}
	
	public void deleteStudentRecord(int id) {
		studentRepo.deleteById(id);
	}
}
