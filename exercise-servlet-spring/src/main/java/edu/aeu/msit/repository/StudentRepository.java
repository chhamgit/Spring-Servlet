package edu.aeu.msit.repository;

import java.util.List;
import java.util.Optional;

import edu.aeu.msit.model.Student;

public interface StudentRepository {
	int save(Student student);

	int update(Student student);

	int deleteById(int id);

	List<Student> findAll();

	Optional<Student> findById(int id);

}
