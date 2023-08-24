package looslycoupled;

import java.util.Scanner;

public class PaymentMain {
	public static void main(String[] args) {
//		Payment p=null;
//		p=new CashPayment();//202020
//		p.makePayment();
//		p=new UpiPayment();//303030
//		p.makePayment();
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Payment System");
		System.out.println("Enter the payment option (cash or upi or cc)");
		String option=s.next();
		
		Payment payment=PaymentFactory.choosePaymentMethod(option);
		payment.makePayment();
		payment.getBalance();
	}
}
