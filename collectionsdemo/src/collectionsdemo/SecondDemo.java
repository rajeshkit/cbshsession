package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SecondDemo {
	public static void main(String[] args) {
		
//		LinkedList<Trainee> list1=new LinkedList<Trainee>();
//		list1.add(new Trainee(100, "abc", 4));
//		list1.add(new Trainee(45, "bcd", 8));
//		list1.add(new Trainee(79, "efg", 5));
//		list1.add(new Trainee(12, "hij", 7));
//		System.out.println("Before Sort:"+list1);
//		Collections.sort(list1);// Comparable -> compareTo
//		System.out.println("After Sort:"+list1);
//		
//		System.out.println("Before Sort:"+list1);
//		Collections.sort(list1,new TraineeIdComparator());// Comparator - compare - SortTraineeId
//		System.out.println("After Sort:"+list1);
//		
//		System.out.println("Before Sort:"+list1);
//		Collections.sort(list1,new TraineeRatingComparator());// Comparator - compare - SortTraineeId
//		System.out.println("After Sort:"+list1);
//		
//		System.out.println("Before Sort:"+list1);
//		Collections.sort(list1,new TraineeNameComparator());// Comparator - compare - SortTraineeId
//		System.out.println("After Sort:"+list1);
//		
//		
//		
	
		
		LinkedList<Integer> list=null;
		list=new LinkedList<>();
		list.add(879);						
		list.add(565);// Auto boxing
		list.add(232);//  Auto boxing
		list.add(787);// Auto boxing
		list.add(788);//  Auto boxing
		list.add(888);
		System.out.println("Before sort:"+list);
		Collections.sort(list);
		
		
		System.out.println("After Sort:"+list);
		System.out.println("****************");
	}
}
