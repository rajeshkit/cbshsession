package datedemo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo {
	//jdk 1.8
		public static void main(String[] args) {
//			LocalDate ld = LocalDate.now();
//			System.out.println(ld);
//			
			
			
//			LocalTime lt=LocalTime.now();
//			System.out.println(lt);
//			
//			LocalTime lt1 = LocalTime.of(13, 30, 45, 787656);
//			System.out.println(lt1);
//			
//			LocalDateTime ldt1 = LocalDateTime.of(2018, 10, 25, 12, 20, 20, 787878);
//			System.out.println(ldt1);
//			
//			System.out.println();
			
			System.out.println(new java.sql.Date(System.currentTimeMillis()));
			System.out.println(new java.util.Date());
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//			LocalDateTime ldt=LocalDateTime.now();
//			System.out.println(ldt);
			//Converting java LocalDate to String representation of Date
//			LocalDate ld1 = LocalDate.of(1999, 12, 12);
//			System.out.println(ld1);
//			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMMM/yyyy E");
//			String d = ld1.format(dtf);
//			System.out.println(d);
			//Converting  String representation of Date to java LocalDate
//			String dob="12/12/2022";
//			DateTimeFormatter ddt1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
//			LocalDate d = LocalDate.parse(dob, ddt1);
//			System.out.println(d);
//		}
		}

}
