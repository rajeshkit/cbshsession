package userdefinedexception;

public class InvalidAccountNumberException extends Exception {
	String msg;
	public InvalidAccountNumberException() {
		super(); 
	}
	public InvalidAccountNumberException(String msg) {
		super(msg);
		this.msg = msg;
	}
	 
}
