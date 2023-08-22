package customer;

public class Product {
	int calculateProductPrice(int noOfProducts,int unitPrice){
		return noOfProducts*unitPrice;
	}
	int calculateProductPrice(Customer cust) {
		calculateProductPrice(cust.pr, cust.p);
		return cust.pr + cust.p;
	}
}
