
public class Customer {
	int aa=100; // instance variable - scope is with in the class
	static int b=334; // static variable -scope is with in the class
	String ss="xud"; // instance variable
	void display() { 
		System.out.println(aa);
		System.out.println(ss);
		System.out.println(Customer.b);
	}
	public static void main(String[] args) { 
		int a=10; //local variable
		String s="abc"; // local variable
		System.out.println(a);
		Customer c=new Customer();
		System.out.println(c.aa);
		System.out.println(c.ss);
		System.out.println(Customer.b);
	}

}
