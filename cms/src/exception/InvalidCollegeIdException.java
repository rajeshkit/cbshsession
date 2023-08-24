package exception;

public class InvalidCollegeIdException extends Exception {
	String msg;
	
	public InvalidCollegeIdException() {
		super();
	}

	public InvalidCollegeIdException(String msg) {
		super();
		this.msg = msg;
	}
	
}
