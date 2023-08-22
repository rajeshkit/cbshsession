package arraypassing;

public class Cart {
	public void displayCartItems(Order[] allOrders) {
		for (Order order : allOrders) {
			System.out.println(order.getOrderId()+"  "+order.getProductName()+"  "+order.getCost());
		}
	}
}
