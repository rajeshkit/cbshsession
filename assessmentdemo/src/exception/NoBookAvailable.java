package exception;

public class NoBookAvailable extends Exception {
	String msg;
	public NoBookAvailable(){
		super();
	}
	public NoBookAvailable(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
