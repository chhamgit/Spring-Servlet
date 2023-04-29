package edu.aeu.msit.repository;

import java.util.List;
import java.util.Optional;

import edu.aeu.msit.model.Lesson;

public interface LessonRepository {
	int save(Lesson lesson);

	int update(Lesson lesson);

	int deleteById(int id);

	List<Lesson> findAll();

	Optional<Lesson> findById(int id);
}
