package view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import exception.InvalidEmployeeNumberException;
import storage.StorageImpl;

public class UserUi {
	Scanner s;
	void acceptEmpDetailsAndStore() {
		s=new Scanner(System.in);
		System.out.println("Enter the employee number");
		int eNo = s.nextInt();
		s.nextLine();
		System.out.println("Enter the employee First name");
		String eFirstName=s.nextLine();
		System.out.println("Enter the employee city name");
		String c=s.nextLine();
		System.out.println("Enter the employee salary");
		int sl=s.nextInt();
		Employee e=new Employee(eNo,eFirstName,c,sl);
		StorageImpl si=new StorageImpl();
		si.addEmployee(e);	
	}
	void displayEmpByEmpNo() throws InvalidEmployeeNumberException  {
		// get empno display employee object empno 
		s=new Scanner(System.in);
		System.out.println("Enter employee number you want to display");
		int eNo=s.nextInt();
		StorageImpl si=new StorageImpl();
		
		Employee e1=si.getEmployee(eNo);
		if(e1!=null) {
			System.out.println(e1.getEmpNo()+" "+e1.getFirstName()+" "+e1.getCity()+" "+e1.getSalary());
		}else {
			System.out.println("Employee not found with that empNo ");
		}
	}
	void displayAllEmployees() {
		StorageImpl si=new StorageImpl();
		ArrayList<Employee> list=si.getAllEmployees();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpNo()+" "+e1.getFirstName()+" "+e1.getCity()+" "+e1.getSalary());

		}
	}
}
