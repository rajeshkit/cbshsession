package demo;

import inheritancedemo.Phone;

public class SmartPhone extends Phone{
	public void camera() {
		
	}
	public static void main(String[] args) {
		SmartPhone sm=new SmartPhone();
		sm.camera();
		//sm.sendSms();
		//sm.makeCalls();
		//SmartPhone.display();
		//System.out.println(sm.cost);
	}
}
