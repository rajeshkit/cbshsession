package demo1;

public class Demo4 {
	public int add(int no1,int no2) {
		int total = no1 + no2; // task or logic adding two no's
		return total;
	}
	public static void main(String[] args) {
		Demo4  d=new Demo4();
		int result =  d.add(344, 232);
		System.out.println(result);
		
		String str=new String("dsfnjs sdfskdfj");
		String str1 = str.toUpperCase();
		System.out.println(str1);
	}
}
