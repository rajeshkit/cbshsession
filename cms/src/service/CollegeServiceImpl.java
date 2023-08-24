package service;

import java.util.ArrayList;

import entity.College;
import exception.InvalidCollegeIdException;
import exception.NoCollegeFoundException;
import storage.CollegeStorageImpl;

public class CollegeServiceImpl implements CollegeService{

	@Override
	public int addCollege(College c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public College findCollegeById(int collegeId) throws InvalidCollegeIdException, NoCollegeFoundException {
		CollegeStorageImpl csm=new CollegeStorageImpl();
		if(collegeId<=0) {
			throw new InvalidCollegeIdException("verify the college id");
		}
		College c1=csm.findCollegeById(collegeId);
		if(c1==null) {
			throw new NoCollegeFoundException("No College found with college id");
		}
		return c1;
	}

	@Override
	public College updateCollege(College p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCollegeById(int collegeId) throws InvalidCollegeIdException {
		CollegeStorageImpl csm=new CollegeStorageImpl();
		try {
			csm.deleteCollegeById(0);
		} catch (NullPointerException e) {
			throw new InvalidCollegeIdException();
		}
		return 0;
	}

	@Override
	public ArrayList<College> getAllColleges() throws NoCollegeFoundException {
		CollegeStorageImpl csm=new CollegeStorageImpl();
		ArrayList<College> cc=csm.getAllColleges();
		if(cc.size()==0) {
			throw new NoCollegeFoundException("No college in the list");
		}
		return cc;
	}

}
