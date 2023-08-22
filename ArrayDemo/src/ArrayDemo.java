import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] marks=new int[5];// primitive int array
		String[] cities=new String[5];
		// non primitive predefined object
		Order[] orders=new Order[5];
		// non primitive user defined  object
		int[] marks1= {456,45,56,67,78};
		String[] cities1= {"chennai","dgf","fgdfg","dfgfd"};
		
		Order o1=new Order();
		Order o2=new Order();
		Order o3=new Order();
		Order o4=new Order();
		Order o5=new Order();
		Order[] orders1= {o1,o2,o3,o4,o5};
		for (String s : cities1) {
			System.out.println(s.toString());
		}
		
		for (Order o:orders1) {
			System.out.println(o.cost+" "+o.itemName+" "+o.orderId);
		}
		
	}
}
