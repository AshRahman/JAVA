import java.lang.*;

public class Shop{
	String shopName;
	Product []products;
	public Shop(){
		System.out.println("E-C");
	}
	
	
	
	public Shop(String shopName,int sizeofArray){
		this.shopName=shopName;
		this.shopName=shopName;
		products=new Product[sizeofArray];
	}
	public String getShopName(){return shopName;}
	
	 void addProduct(Product p){
		int flag=0;
		for(int i=0;i<products.length;i++){
			if(products[i]==null){
				products[i]=p;
				flag=1;
				break;
			}
		}
		if(flag==1){System.out.println("----inserted----");}
		else{System.out.println("-------cant insert------");}
	}
	
	
	void removeProduct(Product p){
		int flag=0;
		for(int i=0;i<products.length;i++){
			if(products[i]==p){
				products[i]=null;
				flag=1;
				break;
			}
		}
		if(flag==1){System.out.println("----removed----");}
		else{System.out.println("-------cant remove------");}
	}
	 Product getProduct(int productId){
		for(int i=0;i<products.length;i++){
			if(products[i]!=null && products[i].getProductId()==productId){
				
					return products[i];
			
		  }
		}
		return null;
		
	}
	
	public void showAllProducts(){
		for(int i=0;i<products.length;i++){
			System.out.println("Id: "+products[i].getProductId());
			System.out.println("Name: "+products[i].getProductName());
			System.out.println("Price: "+products[i].getPrice());
			System.out.println("Available: "+products[i].getAvailableQuantity());
			
		}
	}
	
	
	
	
	
}
