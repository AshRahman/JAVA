import java.lang.*;
public class Product{
	private String productId;
	private String productName;
	private double price;
	private int availableQuantity;
	
	public Product(){
		System.out.println("Empty constructor");
	}
	public Product(String productId,String productName, double price,int availableQuantity){
		System.out.println("Para constructor");
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.availableQuantity=availableQuantity;
	}
	public void setProductId(String productId){
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
	public String getProductId(){return productId;}
	public String getProductName(){return productName;}
	public double getPrice(){return price;}
	public int getAvailableQuantity(){return availableQuantity;}
	public void showDetails(){
		System.out.println("Product ID is:"+productId);
		System.out.println("Product Name is:"+productName);
		System.out.println("Price is:"+price);
		System.out.println("Available Quantity :"+availableQuantity);
	}
	
	
}