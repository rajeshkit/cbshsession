package arraypassing;

public class Customer {
		public static void main(String[] args) {
			Order order1=new Order();
			order1.setOrderId(100);order1.setProductName("sdfdf,dfdf");order1.setCost(5656);
			Order order2=new Order();
			order2.setOrderId(101);order2.setProductName("ddfd");order2.setCost(333);
			Order order3=new Order();
			order3.setOrderId(100);order3.setProductName("sdfdf,dfdf");order3.setCost(5656);
			
			Order[] orderList=new Order[3];
			orderList[0]=order3;//404040
			orderList[1]=order1;//202020
			orderList[2]=order2;//303030
			
			Cart c=new Cart();
			c.displayCartItems(orderList);
			
			
			
		}
}
