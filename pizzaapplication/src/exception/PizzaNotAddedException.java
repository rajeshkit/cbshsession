package exception;

public class PizzaNotAddedException extends Exception {
	String msg;
	public PizzaNotAddedException() {
		super();
	}
	public PizzaNotAddedException(String msg) {
		super(msg);
		this.msg = msg;
	};
	
}
