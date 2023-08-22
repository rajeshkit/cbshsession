package inheritancedemo;

public class Car {
	int cost;
	public Car() { 
		System.out.println("Base class Car constructor");
	}
	
	public Car(int cost) {
		this();
		System.out.println("Base class one arg Car constructor");
		this.cost = cost;
	}

	public void drive() {
		
	}
	public void applyBrakes() {
		
	}
}
