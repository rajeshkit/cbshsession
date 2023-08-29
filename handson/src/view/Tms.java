package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Transport;
import storage.TransportStorage;

public class Tms {
	public static List<Transport> transportList=null;
	static {
		transportList=new ArrayList<Transport>();
		transportList.add(new Transport(100, "abc transport", 20000));
		transportList.add(new Transport(500, "bvd transport", 300000));
		transportList.add(new Transport(150, "xyz transport", 220000));
		transportList.add(new Transport(90, "nnn transport", 12000));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the field Name you want to sort");
		System.out.println("1. id or 2.name or 3.cost");
		System.out.println("Enter your choice");
		String option=s.nextLine();
		TransportStorage ts=TransportStorageFactory.getTransportImpl(option);
		List<Transport> sortedList = ts.sortTransport(transportList);
		for (Transport transport : sortedList) {
			System.out.println(transport);
		}
	}
}
