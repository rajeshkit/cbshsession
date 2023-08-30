package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

import collectionsdemo.Trainee;

public class HashMapDemo {
	public static void main(String[] args) {
	
		HashMap<Integer,String> mapList=new HashMap<Integer,String>();
		mapList.put(600000,"Chennai");
		mapList.put(500000,"Hyderabad");
		mapList.put(200000,"Mumabi");
		mapList.put(400000,"Bangalore");
		mapList.put(300000,"Pune");
		//System.out.println(mapList.entrySet());
		
		for (Entry<Integer,String> e : mapList.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		
		for (Integer in : mapList.keySet()) {
			System.out.println(in+":"+mapList.get(in));
		}
		
		//System.out.println(mapList.values());
		for (String st : mapList.values()) {
			System.out.println(st);
		}
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		String name=s.nextLine();
		int cost=s.nextInt();
		Trainee t1=new Trainee(id,name,cost);
		Trainee t2=new Trainee();
		t2.setTraineeId(id);
		t2.setTraineeName(name);
		t2.setRating(cost);
		HashMap<Integer,Trainee> h=new HashMap<>();
		h.put(t1.getTraineeId(), t1);
		
		h.put(t2.getTraineeId(), t2);
		for (Entry<Integer,Trainee> e : h.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
