import java.lang.*;

public Pizza extends FoodItem{
	
	private String size;
	public Pizza(){System.out.println("EC");}
 
	public Pizza(String size,double price,String name){
		super(price,name);
		this.size=size;
		
	}
	public void setSize(){
		this size=size;
	}
	public String getsize(){
		return size;
	}
	
	
	
}