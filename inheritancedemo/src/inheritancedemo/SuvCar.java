package inheritancedemo;

public class SuvCar  extends Car{
	public SuvCar() {
		super(676);
		
		System.out.println("sub class suv Car constructor");
	}
	public void diskBrakes() {
		
		
	}
	public static void main(String[] args) {
		SuvCar s=new SuvCar();
	}
}
