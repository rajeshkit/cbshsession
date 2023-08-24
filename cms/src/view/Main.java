package view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.College;
import exception.InvalidCollegeIdException;
import exception.NoCollegeFoundException;
import service.CollegeServiceImpl;

public class Main {
		public static void main(String[] args) throws InvalidCollegeIdException  {
//			Scanner s=new Scanner(System.in);
//			System.out.println("Enter the college ID:");
//			int cId=s.nextInt();
//			CollegeServiceImpl ssm=new CollegeServiceImpl();
//			College c2=ssm.findCollegeById(cId);
//			System.out.println(c2);
//			
//			//**************************
//			System.out.println("Getting all Colleges");
			CollegeServiceImpl ssm1=new CollegeServiceImpl();
//			ArrayList<College> list = ssm1.getAllColleges();
//			
//			for (College college : list) {
//				System.out.println(college);
//			}
			
			ssm1.deleteCollegeById(0);
		}

}
