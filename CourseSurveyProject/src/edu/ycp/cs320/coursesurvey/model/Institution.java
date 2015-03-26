package edu.ycp.cs320.coursesurvey.model;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Tyler Younkins, Garlan Bowser, Cory Dawson
 *
 */

// TODO: remove arraylists and empty constructor
public class Institution {
	private int instId;
	private String name;


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
	public int getInstId (int instId) {
		return instId;
	}

	/**
	 * Set Institution ID#
	 * @param instId
	 */
	public void setId (int instId) {
		this.instId = instId;
	}

}
