package exception;

public class Professor extends RuntimeException {
	public static void main(String[] args) {
		ArithmeticException ae=new ArithmeticException(); 
			
		Professor p=new Professor();// Unchecked exception
	}

}
