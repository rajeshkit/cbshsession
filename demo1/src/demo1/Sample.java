package demo1;

import java.util.Scanner;

public class Sample {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
		int p = s.nextInt();//7675
		System.out.println("Enter the tenure");
		int t = s.nextInt();//5
		System.out.println("Enter the ROI");
		float roi = s.nextFloat(); //12.3
		float emi = p * t * roi / 100;
		System.out.println("Welcome to HSBC");
		System.out.println(emi);
		System.out.println("Welcome to HSBC"+emi);
		
	}

}
