import java.lang.*;

public class Start{
	public static void main(String args[]){
		Shop s1=new Shop("Baker",4);
		
		Products p1= new Products;
		p1.setProductId(10);
		p1.setProductName("cake");
		p1.setPrice(120);
		p1.setAvailableQuantity(20);
		
		Products p2= new Products;
		p2.setProductId(11);
		p2.setProductName("pastry");
		p2.setPrice(110);
		p1.setAvailableQuantity(20);
		
		Products p3= new Products;
		p3.setProductId(12);
		p3.setProductName("bun");
		p3.setPrice(12);
		p3.setAvailableQuantity(50);
		
		s1.addProduct(p1);
		s1.addProduct(p2);
		s1.addProduct(p3);
		
		System.out.println("Shop:"+s1.getShopName());
		for(int i=0;i<products.length;i++){
			System.out.println("Id: "+s1.products[i].getProductId());
			System.out.println("Name: "+s1.products[i].getProductName());
			System.out.println("Price: "+s1.products[i].getPrice());
			System.out.println("Available: "+s1.products[i].getProductAvailableQuantity());
			
		}
		
		getProducts(11).buyProduct(5);
		getProducts(12).sellProduct(5);
		
		
		
		
		
		
		
		
		
	}
	
	
}