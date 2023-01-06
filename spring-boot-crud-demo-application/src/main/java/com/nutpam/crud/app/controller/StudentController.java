package com.nutpam.crud.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nutpam.crud.app.model.Student;
import com.nutpam.crud.app.service.StudentServiceImplementation;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImplementation serviceImplementation;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return serviceImplementation.addStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return serviceImplementation.getStudents();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable int id){
		return serviceImplementation.getStudentById(id);
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable int id){
		return serviceImplementation.updateStudentRecord(student, id);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		serviceImplementation.deleteStudentRecord(id);
	}
}
