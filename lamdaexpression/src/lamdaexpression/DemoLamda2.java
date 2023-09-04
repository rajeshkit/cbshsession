package lamdaexpression;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoLamda2 {
	public static void main(String[] args) {
		
		Pizza p1=new Pizza(100, "abc", 2565, null);
		Pizza p2=new Pizza(101, "efg", 1565, null);
		
		Comparator<Pizza> c1=(var o1,var o2)->{return o1.getCost()-o2.getCost();};
		System.out.println(c1.compare(p1, p2));
		
		// int compare(T o1, T o2);
		Comparator<Integer> c=(var o1, var o2)->o1.compareTo(o2);
		int i = c.compare(345, 345);
		System.out.println(i);
		// public int compareTo(T o);
		Comparable<Integer> cc=(var o)->o.compareTo(100);
		int k = cc.compareTo(2);
		System.out.println(k);
		// boolean test(T t);
		Predicate<Integer> p=(t)->t.equals(100);
		System.out.println(p.test(10));
		
		Predicate<String> p11=(t)-> t.equals("hsbc");
		System.out.println(p11.test("hsbc"));
		// Function<T,R> = R apply(T t);
		Function<Integer,String> f=(t)->{return "hsbc";};
		
		Function<Integer,Boolean> f1=(t)->{return t.equals(345);};
		
	}
}
