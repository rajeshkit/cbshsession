package userdefinedexception;

import java.util.Scanner;

public class UserDefinedExceptionDemo {
	public static void main(String[] args) throws InvalidAccountNumberException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your account number");
		String accountNo = s.next();
		
		System.out.println("line 1");
		System.out.println("line 2");
		if(accountNo.length()!=12) {
			throw new InvalidAccountNumberException("check account no try again");// no arg constructort
		}
		System.out.println("line 3");
		System.out.println("line 4");
		
	}
}
