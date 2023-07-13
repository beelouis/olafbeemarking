package main;

import java.util.*;

class Assessment{

	private HashMap<String, Program> assessments;

	public Assessment(){
		assessments = new HashMap<String, Program>();
		
		// read all assessments into list; <name, assessmentFile>
		// check for missing files
		// report if files are missing and point to the name of the student
	}
	
	public Set<String> getNames(){
		return assessments.keySet();
	}
	
	public Collection<Program> getProgramFiles(){
		return assessments.values();
	}

}