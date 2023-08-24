package iostreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f=new File("E:/employee.txt");
//		InputStream in=new FileInputStream(f);
//		int k=0;
//		while((k=in.read())!=-1) {
//			System.out.print((char)k);
//		}
//	
//		in.close();
		String msg="Welcome adfadkjf sdfskdjfhkjsdfhksdhfkjksd sdfkjsdhfksd";
		OutputStream os=new FileOutputStream("E:/trainer.txt");
		os.write(msg.getBytes());
		os.close();
		
//		//***********************
//		FileReader fr=new FileReader(f);
//		int k1=0;
//		while((k1=fr.read())!=-1) {
//			System.out.println(k1);
//		}
//		fr.close();
		String msg1="hagfh werew  qwqe  sfdgjsdnfjk sdfksdnfkjh;kjsdh sdkfkd";
		Writer w=new FileWriter("E:/trainer1.txt",true);
		w.append("abc def");
		w.flush();
		os.close();
		FileReader fr=new FileReader("E:/trainer1.txt");
		int k1=0;
		while((k1=fr.read())!=-1) {
			System.out.print((char)k1);
		}
		fr.close();
	}
}
