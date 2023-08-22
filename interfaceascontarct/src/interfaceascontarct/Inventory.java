package interfaceascontarct;

public interface Inventory {
	public int addProduct(Product p);
	public Product findProductById(int productId);
	public Product[] findByProductName(String productName);
	public Product updateProduct(Product p);
	public int deleteProductById(int productId);
	public Product[] getAllProducts();
}
