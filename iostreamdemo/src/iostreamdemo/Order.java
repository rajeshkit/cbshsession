package iostreamdemo;

import java.io.Serializable;

public class Order implements Serializable{
	private int orderId;
	private String name;
	private int cost;
	public Order() {
		super();
	}
	public Order(int orderId, String name, int cost) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.cost = cost;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
