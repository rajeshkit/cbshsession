package polymorphismdemo;

import java.io.IOException;

public class Area {
	final static public int a=557;
	public Area(int v) {
		// TODO Auto-generated constructor stub
	}
	public int findArea(int length, int bredth) { //overridden
		return length*bredth; // implementation1
	}
	public static void main(String[] args) {
		final int sd=87;
		Area ar=new Area(78);
		
	}
	

}
