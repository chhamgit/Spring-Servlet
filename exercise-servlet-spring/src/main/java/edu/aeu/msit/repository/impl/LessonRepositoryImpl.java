package edu.aeu.msit.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.aeu.msit.model.Lesson;
import edu.aeu.msit.repository.LessonRepository;

@Repository
public class LessonRepositoryImpl implements LessonRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Lesson lesson) {
		return jdbcTemplate.update("insert into td_lesson (les_name) values(?)", lesson.getLes_name());
	}

	@Override
	public int update(Lesson lesson) {
		return jdbcTemplate.update("update td_lesson set les_name = ? where les_id = ?", lesson.getLes_name(),
				lesson.getLes_id());
	}

	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from td_lesson where les_id = ?", id);
	}

	@Override
	public List<Lesson> findAll() {
		return jdbcTemplate.query("select * from td_lesson",
				(rs, rowNum) -> new Lesson(rs.getInt("les_id"), rs.getString("les_name")));
	}

	@Override
	public Optional<Lesson> findById(int id) {
		return jdbcTemplate.queryForObject("select * from td_lesson where les_id = ?",
				(rs, rowNum) -> Optional.of(new Lesson(rs.getInt("les_id"), rs.getString("les_name"))), id);
	}

}
