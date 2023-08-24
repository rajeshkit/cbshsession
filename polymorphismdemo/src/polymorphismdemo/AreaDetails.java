package polymorphismdemo;

public class AreaDetails extends Area{

	public AreaDetails(int v) {
		super(v);
		// TODO Auto-generated constructor stub
	}
	public int findArea(int length, int bredth){ //overriding
		return length*bredth; // implementation1
	}
	public static void main(String[] args) {
		Area a=new AreaDetails(0);
		a.findArea(10, 10);
		
		
	}
}
