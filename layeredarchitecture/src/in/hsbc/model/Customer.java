package in.hsbc.model;

public class Customer {
	private int customerId;
	private String customerName;
	private int balance;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, int balance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.balance = balance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
