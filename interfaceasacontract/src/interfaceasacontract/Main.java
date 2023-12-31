package interfaceasacontract;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		InventoryImplementation iv=new InventoryImplementation();
		
		// adding a new product to product list
		Product pro=new Product(600, "Projector", 100000);
		iv.addProduct(pro);
		
		// getting all product from product list
		ArrayList<Product> list=iv.getAllProducts();
		for (Product product : list) {
			System.out.println(product.getProductId()+" "
						+product.getProductName()+"  "
						+product.getPrice());
		}
		// delete a product by id 
		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the product ID you want to delete");
//		int id=s.nextInt();
//		int status = iv.deleteProductById(id);
//		if(status==1) {
//			System.out.println("product id is deleted success");	
//		}else {
//			System.out.println("product id is not deleted!! check the product Id");
//		}
//		// getting all product from product list
//				ArrayList<Product> list1=iv.getAllProducts();
//				for (Product product : list1) {
//					System.out.println(product.getProductId()+" "
//								+product.getProductName()+"  "
//								+product.getPrice());
//				}
				System.out.println("Enter the product ID you want to find");
				int id1=s.nextInt();	
				Product pr = iv.findProductById(id1);
				if(pr!=null) {
					System.out.println(pr.getProductId()+" "+pr.getProductName()+"  "+pr.getPrice());
				}else {
					System.out.println("Product not found with Id Kindly check the ID!!!");
				}
				
				//update an product
				System.out.println("Enter the product Id you wanto to update");
				int pId=s.nextInt();
				System.out.println("Enter the product new name you want to update");
				String pName=s.nextLine();
				System.out.println("Enter the product new cost that you want to update");
				int pCost=s.nextInt();
				Product productUpdate=new Product(pId, pName, pCost);
				iv.updateProduct(productUpdate);
	}

}
