package edu.aeu.msit.model;

public class Lesson {
	private int les_id;
	private String les_name;

	/**
	 * @param les_id
	 * @param les_name
	 */
	public Lesson(int les_id, String les_name) {
		this.les_id = les_id;
		this.les_name = les_name;
	}
	
	/**
	 * 
	 * @param les_name
	 */
	public Lesson(String les_name) {
		this.les_name = les_name;
	}

	/**
	 * @return the les_id
	 */
	public int getLes_id() {
		return les_id;
	}

	/**
	 * @param les_id the les_id to set
	 */
	public void setLes_id(int les_id) {
		this.les_id = les_id;
	}

	/**
	 * @return the les_name
	 */
	public String getLes_name() {
		return les_name;
	}

	/**
	 * @param les_name the les_name to set
	 */
	public void setLes_name(String les_name) {
		this.les_name = les_name;
	}
	
	@Override
	public String toString() {
		return "Lesson [les_id=" + les_id + ", les_name=" + les_name  + "]";
	}
}
