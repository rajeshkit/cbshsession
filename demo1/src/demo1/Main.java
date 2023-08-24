package demo1;

public class Main {
	public static void main(String[] args) {
		
//		String s1=new String("hai");
//		System.out.println("hai".equals(s1));//deep copy
//		System.out.println("hai"==s1);//shadow copy 
//		System.out.println(s1.hashCode());
//		System.out.println("hai".hashCode());
		
//		Order o1=new Order(100,"Tv",50000);
//		Order o2=new Order(100,"Tv",50000);
//		
//		System.out.println(o2.equals(o1));//true
//		String s1=new String("hai");
//		String s2=new String("hai");
//		
//		System.out.println(s2.equals(s1));// true
	
		Order o1=new Order(100,"Tv",50000);
		Order o2=new Order(100,"Tv",50000);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1.equals(o2));//true
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
	}
}
