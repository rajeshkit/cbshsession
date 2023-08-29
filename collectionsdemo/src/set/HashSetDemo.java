package set;

import java.util.HashSet;
import java.util.TreeSet;

import collectionsdemo.Trainee;
import collectionsdemo.TraineeRatingComparator;

public class HashSetDemo {
	public static void main(String[] args) {
		TreeSet<String> hashList=new TreeSet<>();
		hashList.add("hsbc");
		hashList.add("chennai");
		hashList.add("bangalore");
		hashList.add("mumbai");
		hashList.add("pune");
		for (String string : hashList) {
			System.out.println(string);
		}
		Trainee t1 = new Trainee(300,"abc",5);
		Trainee t2 = new Trainee(101,"bcd",4);
		Trainee t3 = new Trainee(200,"efg",5);
		TreeSet<Trainee> list=new TreeSet<>(new TraineeRatingComparator());
		list.add(t1);
		list.add(t2);
		list.add(t3);
		for (Trainee trainee : list) {
			System.out.println(trainee);
		}
		
		
	}
}
