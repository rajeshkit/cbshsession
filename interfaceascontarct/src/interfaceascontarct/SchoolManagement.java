package interfaceascontarct;

import java.util.ArrayList;

public class SchoolManagement {
	public static void main(String[] args) {
		School s1=new School(100,"Vidhya",12000);
		School s2=new School();
		s2.setSchoolId(200);s2.setSchoolName("International");
		s2.setSchoolFees(50000);
		School s3=new School(300,"Vidhya",90000);
		School s4=new School(400,"SBOA",100000);
		
		ArrayList<School> schoolList=new ArrayList<School>();
		schoolList.add(s1);
		schoolList.add(s2);
		schoolList.add(s3);
		schoolList.add(s4);
		
		for (School school : schoolList) {
			System.out.println(school.getSchoolId()+" "+school.getSchoolName()+" "+school.getSchoolFees());
			
		}
		
		
	}
}
