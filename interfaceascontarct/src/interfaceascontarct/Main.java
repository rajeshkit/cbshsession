package interfaceascontarct;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	static Product[] productList;
	public static void main(String[] args) {
		Product p1=new Product(100, "Tv", 10000);
		Product p2=new Product();
		p2.setProductId(101);
		p2.setProductName("laptop");
		p2.setCost(50000);
		Product p3=new Product(103, "laptop", 100000);
		Product p4=new Product(104, "Tv", 100000);
		Product p5=new Product(105, "Projector", 200000);
		
		productList=new Product[5];
		productList[0]=p1;productList[1]=p2;productList[2]=p3;
		productList[3]=p4;productList[4]=p5;
		Product p6=new Product(105, "Projector", 200000);
		//productList[6]=p6;
		
		ArrayList<Product> productList1=new ArrayList<Product>();
		productList1.add(p1);
		productList1.add(p2);
		productList1.add(p3);
		productList1.add(p4);
		productList1.add(p5);
		productList1.add(p6);
		for (Product product : productList1) {
			if(product.getProductId()==100) {
				System.out.println(product.getProductId()+" "
			+product.getProductName()+" "+product.getCost());
		
			}
		}
		
	}
}
