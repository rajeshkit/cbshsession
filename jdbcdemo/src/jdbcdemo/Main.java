package jdbcdemo;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		String url ="jdbc:mysql://localhost:3306/cbsh";
		String username="root";
		String password="root@123";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter employee number");
		int empNo=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Doj(dd-MM-yyyy)");
		String stringDoj=s.nextLine();
		//after jdk 1.8
		DateTimeFormatter stf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ld = LocalDate.parse(stringDoj, stf);
		System.out.println(ld);
		Date sd=Date.valueOf(ld);
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		String insertQuery="INSERT INTO employee VALUES(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(insertQuery);
		pstmt.setInt(1, empNo);
		pstmt.setString(2, name);
		pstmt.setDate(3, sd);
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
	}

}
