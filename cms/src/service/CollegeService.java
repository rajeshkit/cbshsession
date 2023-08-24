package service;

import java.util.ArrayList;

import entity.College;
import exception.InvalidCollegeIdException;
import exception.NoCollegeFoundException;

public interface CollegeService {
	public int addCollege(College c);
	public College findCollegeById(int collegeId) throws InvalidCollegeIdException,NoCollegeFoundException;
	public College updateCollege(College p);
	public int deleteCollegeById(int collegeId) throws InvalidCollegeIdException;
	public ArrayList<College> getAllColleges() throws NoCollegeFoundException;
}
