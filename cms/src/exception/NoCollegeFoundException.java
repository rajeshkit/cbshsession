package exception;

public class NoCollegeFoundException extends Exception {
	String msg;
	
	
	public NoCollegeFoundException() {
		super();
	}


	public NoCollegeFoundException(String msg) {
		super();
		this.msg = msg;
	};
	
}
