package demo1;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("statement 1");
		System.out.println("statement 2");
		for (int i = 0; i < 10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println("hsbc1: "+i);
			System.out.println("hsbc2: "+i);
			
		}
		System.out.println("statement 5");
	}
}
