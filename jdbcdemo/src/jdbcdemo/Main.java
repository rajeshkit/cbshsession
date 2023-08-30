package jdbcdemo;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		String url ="jdbc:mysql://localhost:3306/cbsh";
		String username="root";
		String password="root@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		String query="update employee set employee_name='qqqqq' where employee_id=56534";
		String query2="insert into employee values(88888,'ttt','2015-12-12')";
		String query1="delete from employee where employee_id=12033";
	
		Statement pstmt = con.createStatement();
		
		con.setAutoCommit(false);
		try {
			pstmt.executeUpdate(query);
			pstmt.executeUpdate(query1);
			pstmt.executeUpdate(query2); // making one exception
			con.commit();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			System.out.println("catch block");
			con.rollback();
		}
		
		
//		ResultSetMetaData rsmd=rs.getMetaData();
//		System.out.println(rsmd.getColumnCount());
//		System.out.println(rsmd.getColumnName(2));
//		System.out.println(rsmd.getColumnType(2));
//		System.out.println(rsmd.getColumnTypeName(2));
//		System.out.println(rsmd.getPrecision(2));
///*

		
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name=s.nextLine();
//		System.out.println("Enter employee number");
//		int empNo=s.nextInt();
//		s.nextLine();
//		System.out.println("Enter the Doj(dd-MM-yyyy)");
//		String stringDoj=s.nextLine();
//		//after jdk 1.8
//		DateTimeFormatter stf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		LocalDate ld = LocalDate.parse(stringDoj, stf);
//		System.out.println(ld);
//		Date sd=Date.valueOf(ld);
//	
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url, username, password);
//		String insertQuery="INSERT INTO employee VALUES(?,?,?)";
//		PreparedStatement pstmt = con.prepareStatement(insertQuery);
//		pstmt.setInt(1, empNo);
//		pstmt.setString(2, name);
//		pstmt.setDate(3, sd);
//		pstmt.executeUpdate();
//		pstmt.close();
//		con.close();
		
		
	}

}
