package customer;

import java.util.Scanner;

public class Customer {
	int p;
	int pr;
	
	public Customer(int p, int pr) {
		this.p = p;
		this.pr = pr;
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int totalProducts = s.nextInt();
		int price = s.nextInt();
		Product p=new Product();
		p.calculateProductPrice(totalProducts, price);
		
		Customer c=new Customer(totalProducts,price);
		
	}
	
}
