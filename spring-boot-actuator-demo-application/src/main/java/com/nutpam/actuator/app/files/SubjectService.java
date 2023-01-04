package com.nutpam.actuator.app.files;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "subject")
public class SubjectService {
	
	Map<String, Subject> subjectMapping = new ConcurrentHashMap<>();
	
	@ReadOperation
	public Map<String, Subject> getAllSubjects(){
		return subjectMapping;
	}

	@ReadOperation
	public Subject getSubjectById(@Selector String subject) {
		return subjectMapping.get(subject);
	}
	
	@WriteOperation
	public void setSubject(@Selector String subject, int subjectId) {
		subjectMapping.put(subject, new Subject(subjectId));
	}
}
