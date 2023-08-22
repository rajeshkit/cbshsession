
public class Order {
	
	Order(){
		System.out.println("No constructor");
	}
	Order(int id){
		System.out.println("One Arg constructor");
	}
	Order(int id,String name){
		System.out.println("Two Arg constructor");
	}
	void displayOrder() { // instance method or non static
		System.out.println("order");
	}
	
	public static void main(String[] args) { // static 
		Order o1=new Order(23,"abc");//Order object is created
							//then immediate after it will
							//call the constructor implicit
		o1.displayOrder(); // explicitly called
	}
}
