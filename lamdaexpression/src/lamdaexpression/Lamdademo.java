package lamdaexpression;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lamdademo{
	
	public static void main(String[] args) {
		Runnable r = ()->System.out.println("thread task");
		Thread t1=new Thread(r);
		t1.start();
		//int compare(T o1, T o2);
		Comparator<Integer> c=
				(o1,o2)->o1.compareTo(o2);
			//public int compareTo(T o);
		Comparable<Integer> c1=
				(o1)->o1.compareTo(6768);
			// void accept(T t);
		Consumer<String> c2=(t)->{System.out.println(t);};	
		//  boolean test(T t);
		Predicate<Integer> p=(t)->{return t.equals(5656);};		
		Pizza p1=new Pizza(100, "abc", 565, null);
		Pizza p2=new Pizza(101, "efg", 1565, null);
		
		Predicate<Pizza> pp=(t)->{return t.getPizzaId()>200;};
		pp.test(p1);
		
		//		Predicate p;
//		
//		Function f;
		
	}

	
}
