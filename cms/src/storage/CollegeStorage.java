package storage;

import java.util.ArrayList;

import entity.College;

public interface CollegeStorage {
	public int addCollege(College c);
	public College findCollegeById(int collegeId);
	public College updateCollege(College p);
	public int deleteCollegeById(int collegeId);
	public ArrayList<College> getAllColleges();
}
