package storage;

import java.util.ArrayList;

import entity.College;

public class CollegeStorageImpl implements CollegeStorage {
	static ArrayList<College> collgeList;
	static {
		collgeList=new ArrayList<College>();
	}
	@Override
	public int addCollege(College c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public College findCollegeById(int collegeId) {
		for (College college : collgeList) {
			if(college.getCollegeId()==collegeId) {
				return college;
			}
		}
		return null;
	}

	@Override
	public College updateCollege(College p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCollegeById(int collegeId) {
		String str=null;
		str.substring(0);// throw new NullPointerException();
		return 0;
	}

	@Override
	public ArrayList<College> getAllColleges() {
		// TODO Auto-generated method stub
		return collgeList;
	}

}
