package iostreamdemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingStringLine {
	public static void main(String[] args) throws IOException {
		FileInputStream fr=new FileInputStream("c:/trainer.txt");
		BufferedInputStream bis=new BufferedInputStream(fr);
		bis.read();
		
		FileReader fr1=new FileReader("c:/trainer.txt");
		BufferedReader bis1=new BufferedReader(fr1);
		bis1.readLine();
		
		FileWriter fr2=new FileWriter("c:/trainer123.txt");
		BufferedWriter bis2=new BufferedWriter(fr2);
		bis2.write("");
		
	}
}
