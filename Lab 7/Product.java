import java.lang.*;

public class Product{
	private int productId;
	private String productName;
	private double price;
	private int availableQuantity;
	
	
	public Product(){
		System.out.println("E-C");
		
	}
	
	public void setProductId(int productId){
		this.productId=productId;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity=availableQuantity;
	}
	public int getProductId(){return productId;}
	public String getProductName(){return productName;}
	public double getPrice(){return price;}
	public int getAvailableQuantity(){return availableQuantity;}
	
	
	//public void buyProducts(int quantity){
		//availableQuantity=availableQuantity+quantity;
		//return availableQuantity;
	//}
	//public void sellProducts(int quantity){
		//availableQuantity=availableQuantity-quantity;
		//return availableQuantity;
		
	}
	
	
	
	
	
	
