package edu.aeu.msit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.aeu.msit.model.Lesson;
import edu.aeu.msit.repository.LessonRepository;
import edu.aeu.msit.service.LessonService;

@Service
public class LessonServiceImpl implements LessonService {

	@Autowired
	LessonRepository lessonRepository;

	@Override
	public int save(Lesson lesson) {
		return lessonRepository.save(lesson);
	}

	@Override
	public int update(Lesson lesson) {
		return lessonRepository.update(lesson);
	}

	@Override
	public int deleteById(int id) {
		return lessonRepository.deleteById(id);
	}

	@Override
	public List<Lesson> findAll() {
		return lessonRepository.findAll();
	}

	@Override
	public Optional<Lesson> findById(int id) {
		return lessonRepository.findById(id);
	}

}
