package exception;

public class BookIdNotFoundException extends Exception {
	String msg;
	public BookIdNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public BookIdNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}
	

}
