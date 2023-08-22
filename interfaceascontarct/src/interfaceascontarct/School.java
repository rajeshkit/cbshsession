package interfaceascontarct;

public class School {
	private int schoolId;
	private String schoolName;
	private int schoolFees;
	public School() {
		super();
	}
	public School(int schoolId, String schoolName, int schoolFees) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolFees = schoolFees;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getSchoolFees() {
		return schoolFees;
	}
	public void setSchoolFees(int schoolFees) {
		this.schoolFees = schoolFees;
	}
	
	
	

}
