
public class Showroom {
	public static void main(String[] args) {
		String car1= "101,Innova,200000";
		String[] s = car1.split(",");
		Car c1=new Car();
		c1.setCarId(Integer.parseInt(s[0]));
		c1.setCarName(s[1]);
		c1.setPrice(Integer.parseInt(s[2]));
	}
}
