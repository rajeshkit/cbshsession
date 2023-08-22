package interfaceascontarct;

public class Product {
	private int productId;
	private String productName;
	private int cost;
	
	public Product() {
		super();
	}
	public Product(int productId, String productName, int cost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
