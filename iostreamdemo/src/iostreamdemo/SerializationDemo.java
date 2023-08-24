package iostreamdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Order o1=new Order(100,"Tv",500000);
		Order o2=new Order(101,"Table",150000);
		Order o3=new Order(102,"Refr",25000);
		Order o4=new Order(103,"AC",150000);
		ArrayList<Order> orderList=new ArrayList<>();
		orderList.add(o1);orderList.add(o2);orderList.add(o3);orderList.add(o4);
		FileOutputStream fos=new FileOutputStream("E:/order.df");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(orderList);
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("E:/order.df");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList<Order> order1=(ArrayList<Order>) ois.readObject();
		for (Order order : order1) {
			System.out.println(order.getOrderId()+"  "+order.getName()+"  "+order.getCost());
			
		}
		ois.close();
		fis.close();
		
	}
}
