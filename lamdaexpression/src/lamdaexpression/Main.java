package lamdaexpression;
@FunctionalInterface
interface CircleInterface{
	public double area(int r);
	public default void display() {
		System.out.println("display method");
	}
	public default void display1() {
		System.out.println("display1 method");
	}
	public static void show() {
		System.out.println("show method");
	}
}
@FunctionalInterface
interface MyInterface{
	public void add(int a,int b);	
}
public class Main{
	public double areaOfCircle(int radius) {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		MyInterface m=(a,b)-> System.out.println(a+b);
		m.add(45, 57);
		CircleInterface c = (radius)-> 3.14*radius*radius;
		System.out.println(c.area(567));
	}
}
