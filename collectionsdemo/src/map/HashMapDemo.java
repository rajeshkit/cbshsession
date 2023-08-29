package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

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
		Trainee t1=new Trainee(12,"454",4);
		Trainee t2=new Trainee(24,"67",4);
		HashMap<Integer,Trainee> h=new HashMap<>();
		h.put(35465, t1);
		h.put(34434, t2);
		for (Entry<Integer,Trainee> e : h.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
