package interfaceascontarct;

public class InventoryImplementation implements Inventory {
	static Product[] productList;
	static{
		Product p1=new Product(100, "Tv", 10000);
		Product p2=new Product();
		p2.setProductId(101);
		p2.setProductName("laptop");
		p2.setCost(50000);
		Product p3=new Product(103, "laptop", 100000);
		Product p4=new Product(104, "Tv", 100000);
		Product p5=new Product(105, "Projector", 200000);
		productList=new Product[5];
		productList[0]=p1;productList[1]=p2;productList[2]=p3;
		productList[3]=p4;productList[4]=p5;
		
	}
	@Override
	public int addProduct(Product p) {
		System.out.println("add a product");
		return 0;
	}

	@Override
	public Product findProductById(int productId) {
		System.out.println("find a product by id");
		return null;
	}

	@Override
	public Product[] findByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteProductById(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product[] getAllProducts() {
		// TODO Auto-generated method stub
		return productList;
	}

}
