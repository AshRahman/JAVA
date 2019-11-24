import java.lang.*;
import java.util.*;

public class Start{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n,j,k;
		int Id[]=new int[10];
		int Price[]=new int[10];
		int AQ[]=new int[10];
		String s1,s2,s3,s4;
		
		System.out.println("enter shop name");
		s1=sc.nextLine();
		System.out.println("enter amount of products");
		n=sc.nextInt();
		Shop ss1=new Shop(s1,n);
		 Product P[]=new Product[n];
		for(int i=0;i<n;i++){
			System.out.println("enter product ID");
			Id[i]=sc.nextInt();
			P[i].setProductId(Id[i]);
			
			System.out.println("enter product Name");
			s1=sc.nextLine();
			P[i].setProductName(s1);
			
			System.out.println("enter product Price");
			Price[i]=sc.nextInt();
			P[i].setPrice(Price[i]);
			
			System.out.println("enter product Quantity");
			AQ[i]=sc.nextInt();
			P[i].setAvailableQuantity(AQ[i]);
			
			
			
		}
		//Product p1= new Product();
		
		
		
		
		//p1.setPrice();
		//p1.setAvailableQuantity();
		
		//Product p2= new Product();
		//p2.setProductId(11);
		//p2.setProductName("pastry");
		//p2.setPrice(110);
		//p1.setAvailableQuantity(20);
		
		//Product p3= new Product();
		//p3.setProductId(12);
		//p3.setProductName("bun");
		//p3.setPrice(12);
		//p3.setAvailableQuantity(50);
		
		//s1.addProduct(p1);
		//s1.addProduct(p2);
		//s1.addProduct(p3);
		
		//System.out.println("Shop:"+s1.getShopName());
		//for(int i=0;i<products.length;i++){
			//System.out.println("Id: "+s1.products[i].getProductId());
			//System.out.println("Name: "+s1.products[i].getProductName());
			//System.out.println("Price: "+s1.products[i].getPrice());
			//System.out.println("Available: "+s1.products[i].getProductAvailableQuantity());
			
		//}
		
		//getProducts(11).buyProduct(5);
		//getProducts(12).sellProduct(5);
		
		
		
		
		
		
		
		
		
	}
	
	
}