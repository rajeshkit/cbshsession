package polymorphismdemo;

public class AreaDetails extends Area{

	public int findArea(int length, int bredth){ //overriding
		return length*bredth; // implementation1
	}
	public static void main(String[] args) {
		Area a=new AreaDetails();
		a.findArea(10, 10);
		
		
	}
}