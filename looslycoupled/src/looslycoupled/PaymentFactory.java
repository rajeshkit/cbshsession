package looslycoupled;

public class PaymentFactory {
	public static Payment choosePaymentMethod(String method) {
		Payment p=null;
		if(method.equalsIgnoreCase("cash")) {
			p=new CashPayment();
		}
		if(method.equalsIgnoreCase("upi")) {
			p = new UpiPayment();
		}
		if(method.equalsIgnoreCase("creditcard")) {
			p = new CreditcardPayment();
		}
		return p;
		
	}
}
