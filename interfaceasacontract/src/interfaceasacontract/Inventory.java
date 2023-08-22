package interfaceasacontract;

import java.util.ArrayList;

public interface Inventory {
	public int addProduct(Product p);
	public Product findProductById(int productId);
	public Product updateProduct(Product p);
	public int deleteProductById(int productId);
	public ArrayList<Product> getAllProducts();
}
