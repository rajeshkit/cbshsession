package interfaceasacontract;

import java.util.ArrayList;

public class InventoryImplementation implements Inventory {
	static ArrayList<Product> productList;
	static {
		Product p1=new Product(100,"tv",50000);
		Product p2=new Product();p2.setProductId(200);p2.setProductName("laptop");p2.setPrice(100000);
		Product p3=new Product(300,"tv",10000);
		Product p4=new Product(400,"laptop",150000);
		Product p5=new Product(500,"Refrigrator",50000);
		productList=new ArrayList<Product>();
		productList.add(p1);productList.add(p2);productList.add(p3);
		productList.add(p4);productList.add(p5);
	}
	@Override
	public int addProduct(Product p) {
	
		productList.add(p);
		return 1;
	}

	@Override
	public Product findProductById(int productId) {
		for (Product product : productList) {
			if(product.getProductId()==productId) {
				return product;
			}
			
		}
		return null;
	}

	@Override
	public Product updateProduct(Product p) {
		for (Product product : productList) {
			if(product.getProductId()==p.getProductId()) {
				product.setProductName(p.getProductName());
				product.setPrice(p.getPrice());
			}
		}
		
		return p;
	}

	@Override
	public int deleteProductById(int productId) {
		for (Product product : productList) {
			if(product.getProductId()==productId) {
				productList.remove(product);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public ArrayList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productList;
	}

}
