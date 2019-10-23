import java.lang.*;

public class Main{
	public static void main(String args[]){
		Product p = new Product();
		p.setProductId("PT");
		p.setProductName("Potato");
		p.setPrice(25);
		p.setAvailableQuantity(100);
		
		System.out.println("ID:"+p.getProductId());
		System.out.println("Name:"+p.getProductName());
		System.out.println("Price:"+p.getPrice());
		System.out.println("Quantity:"+p.getAvailableQuantity());
		 p.showDetails();

		 
		 Product p1 = new Product();
		p1.setProductId("Al");
		p1.setProductName("Alu");
		p1.setPrice(30);
		p1.setAvailableQuantity(200);
		
		System.out.println("ID:"+p1.getProductId());
		System.out.println("Name:"+p1.getProductName());
		System.out.println("Price:"+p1.getPrice());
		System.out.println("Quantity:"+p1.getAvailableQuantity());
		 p1.showDetails();
		Product p2 = new Product("Apple","APP",23,100);
		p2.showDetails();
	}
	
	
	
}