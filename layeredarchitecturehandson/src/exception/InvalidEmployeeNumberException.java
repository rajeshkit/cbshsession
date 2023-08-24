package exception;

public class InvalidEmployeeNumberException extends Exception {
	String msg;
	public InvalidEmployeeNumberException() {
		super();
	}
	public InvalidEmployeeNumberException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	
}
