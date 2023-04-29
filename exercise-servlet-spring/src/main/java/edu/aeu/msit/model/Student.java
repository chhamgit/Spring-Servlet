package edu.aeu.msit.model;

import java.sql.Date;

public class Student {
	private int stu_id;
	private String stu_last_name;
	private String stu_first_name;
	private Date stu_dob;

	/**
	 * @param stu_id
	 * @param stu_last_name
	 * @param stu_first_name
	 * @param stu_dob
	 */
	public Student(int stu_id, String stu_last_name, String stu_first_name, Date stu_dob) {
		this.stu_id = stu_id;
		this.stu_last_name = stu_last_name;
		this.stu_first_name = stu_first_name;
		this.stu_dob = stu_dob;
	}
	
	/**
	 * 
	 * @param stu_last_name
	 * @param stu_first_name
	 * @param stu_dob
	 */
	public Student(String stu_last_name, String stu_first_name, Date stu_dob) {
		this.stu_last_name = stu_last_name;
		this.stu_first_name = stu_first_name;
		this.stu_dob = stu_dob;
	}

	/**
	 * @return the stu_id
	 */
	public int getStu_id() {
		return stu_id;
	}

	/**
	 * @param stu_id the stu_id to set
	 */
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	/**
	 * @return the stu_last_name
	 */
	public String getStu_last_name() {
		return stu_last_name;
	}

	/**
	 * @param stu_last_name the stu_last_name to set
	 */
	public void setStu_last_name(String stu_last_name) {
		this.stu_last_name = stu_last_name;
	}

	/**
	 * @return the stu_first_name
	 */
	public String getStu_first_name() {
		return stu_first_name;
	}

	/**
	 * @param stu_first_name the stu_first_name to set
	 */
	public void setStu_first_name(String stu_first_name) {
		this.stu_first_name = stu_first_name;
	}

	/**
	 * @return the stu_dob
	 */
	public Date getStu_dob() {
		return stu_dob;
	}

	/**
	 * @param stu_dob the stu_dob to set
	 */
	public void setStu_dob(Date stu_dob) {
		this.stu_dob = stu_dob;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + stu_id + ", StudentName=" + stu_last_name + " " + stu_last_name + ",age =" + stu_dob.toString() + "]";
	}

}
