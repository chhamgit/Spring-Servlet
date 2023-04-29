package edu.aeu.msit.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.aeu.msit.model.Student;
import edu.aeu.msit.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Student student) {
		return jdbcTemplate.update("insert into td_student (stu_first_name, stu_last_name, stu_dob) values(?,?,?)",
				student.getStu_first_name(), student.getStu_last_name(), student.getStu_dob());
	}

	@Override
	public int update(Student student) {
		return jdbcTemplate.update(
				"update td_student set stu_first_name = ?, stu_last_name = ?, stu_dob = ? where stu_id = ?",
				student.getStu_first_name(), student.getStu_last_name(), student.getStu_dob(), student.getStu_id());
	}

	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from td_student where stu_id = ?", id);
	}

	@Override
	public List<Student> findAll() {
		return jdbcTemplate.query("select * from td_student", (rs, rowNum) -> new Student(rs.getInt("stu_id"),
				rs.getString("stu_last_name"), rs.getString("stu_first_name"), rs.getDate("stu_dob")));
	}

	@Override
	public Optional<Student> findById(int id) {
		return jdbcTemplate.queryForObject("select * from td_student where stu_id = ?",
				(rs, rowNum) -> Optional.of(new Student(rs.getInt("stu_id"), rs.getString("stu_last_name"),
						rs.getString("stu_first_name"), rs.getDate("stu_dob"))),
				id);
	}

}
