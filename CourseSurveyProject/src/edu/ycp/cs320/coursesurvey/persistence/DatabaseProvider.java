package edu.ycp.cs320.coursesurvey.persistence;

public class DatabaseProvider {
	private static IDatabase theInstance;
	
	public static void setInstance(IDatabase fakedatabase) {
		theInstance = fakedatabase;
	}
	
	public static IDatabase getInstance() {
		if (theInstance == null) {
			throw new IllegalStateException("IDatabase instance has not been set!");
		}
		return theInstance;
	}
}
