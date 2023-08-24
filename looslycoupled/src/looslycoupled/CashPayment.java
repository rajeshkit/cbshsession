package looslycoupled;

public class CashPayment implements Payment{

	@Override
	public void makePayment() {
		System.out.println("count the cash");
		System.out.println("cash counted by cashier");
		
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		
	}
	

}
