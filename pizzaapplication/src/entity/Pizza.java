package entity;

import java.time.LocalDate;

public class Pizza {
	private int pizzaId;
	private String pizzaName;
	private int cost;
	private LocalDate deliveryDate;
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public Pizza(int pizzaId, String pizzaName, int cost, LocalDate deliveryDate) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.cost = cost;
		this.deliveryDate = deliveryDate;
	}
	public int getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaName=" + pizzaName + ", cost=" + cost + ", deliveryDate="
				+ deliveryDate + "]";
	}
	
	
}
