package edu.ycp.cs320.coursesurvey.model;

/**
 * 
 * @author Tyler Younkins, Garlan Bowser, Cory Dawson
 *
 */

public class Institution {
	private int instId;
	private String name;
	private int userTableID;
	private int courseTableID;


	/**
	 * Get Institution name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set Institution name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get Institution ID
	 * @return instId
	 */
	public int getInstId () {
		return this.instId;
	}

	/**
	 * Set Institution ID#
	 * @param instId
	 */
	public void setInstId (int instId) {
		this.instId = instId;
	}
	
	/**
	 * set User Table ID
	 * @param userTableID
	 */
	public void setUserTableID(int userTableID){
		this.userTableID = userTableID;
	}
	
	/**
	 * Get User Table ID
	 * @return userTableID
	 */
	public int getUserTableID(){
		return this.userTableID;
	}
	
	/**
	 * set Course Table ID
	 * @param courseTableID
	 */
	public void setCourseTableID(int courseTableID){
		this.courseTableID = courseTableID;
	}
	
	/**
	 * Get Course Table ID
	 * @return courseTableID
	 */
	public int getCourseTableID(){
		return this.courseTableID;
	}

}
