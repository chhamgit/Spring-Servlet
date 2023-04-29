package edu.aeu.msit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.aeu.msit.model.Student;
import edu.aeu.msit.repository.StudentRepository;
import edu.aeu.msit.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;

	@Override
	public int save(Student student) {
		return repository.save(student);
	}

	@Override
	public int update(Student student) {
		return repository.update(student);
	}

	@Override
	public int deleteById(int id) {
		return repository.deleteById(id);
	}

	@Override
	public List<Student> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Student> findById(int id) {
		return repository.findById(id);
	}

}
