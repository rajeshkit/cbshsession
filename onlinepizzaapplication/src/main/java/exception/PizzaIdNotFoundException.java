package exception;

public class PizzaIdNotFoundException extends Exception {
	String msg;
	public PizzaIdNotFoundException() {
		super();
	}
	public PizzaIdNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
