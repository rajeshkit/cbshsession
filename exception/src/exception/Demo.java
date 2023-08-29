package exception;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
	

	public static void main(String[] args) throws IOException  {
		
		//Demo d=new Demo();
		System.out.println("line1");
		System.out.println("line2");
		
		
		try(Scanner s=new Scanner(System.in);
				FileInputStream fi=new FileInputStream("E:/trainer1.txt");) {
			int divider=s.nextInt();
			int index = s.nextInt();
			int total = 100 / divider;
			System.out.println(total);
			int[] k= {34,34,56};
			System.out.println(k[index]);
			String str="jhfgjfh";
			str.substring(0);
		}catch( ArrayIndexOutOfBoundsException | 
				NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("line8");

	}

	
}
