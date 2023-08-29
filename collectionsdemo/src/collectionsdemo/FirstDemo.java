package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FirstDemo {
	public static void main(String[] args) {
		Trainee t1=new Trainee(120, "abc", 10);
		Trainee t2=new Trainee(121, "bcd", 5);
		Trainee t3=new Trainee(122, "def", 7);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(879);
		list.add(565);// Auto boxing
		list.add(232);//  Auto boxing
		list.add(787);// Auto boxing
		list.add(788);//  Auto boxing
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		
		
		
		
		
		System.out.println("basic for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("advanced for loop");
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("iterator");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			// next method returns the current object from the iterator
		}
		System.out.println("for Each");
		list.forEach(i->System.out.println(i));
		
		
		
		ArrayList<Trainee> list1=new ArrayList<>();
		list1.add(t1);
		list1.add(t2);// Auto boxing
		list1.add(t3);//  Auto boxing
		System.out.println(list1.toString());
		
		Iterator<Trainee> itr1=list1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}
