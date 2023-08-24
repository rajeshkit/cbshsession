package demo1;

public class Order extends Object{
	int orderId;
	String itemName;
	float cost;
	int status;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderId, String itemName, float cost) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.cost = cost;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public boolean equals(Object o) {
		Order o2=(Order)o;
		return this.orderId==o2.orderId 
				&& this.itemName.equals(o2.itemName)
				&& this.cost==o2.cost;
		}
	@Override
	public int hashCode() {
		return (int) (orderId*cost);
	}

	@Override
	public String toString() {
		return "orderId:" + orderId + ", itemName:" + itemName + ", cost=" + cost +"";
	}

	
	
}

	


