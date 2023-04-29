package edu.aeu.msit.service;

import java.util.List;
import java.util.Optional;

import edu.aeu.msit.model.Student;

public interface StudentService {
	int save(Student student);

	int update(Student student);

	int deleteById(int id);

	List<Student> findAll();

	Optional<Student> findById(int id);
}
