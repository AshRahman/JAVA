import java.lang.*;

public abstract FoodItem{
	int id;
	double price;
	String name;
	
	public FoodItem(){
		System.out.println("Ec");
	}
	
	public void setId(int id){
		this.id=id;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setName(name){
		this.name=name;
	}
	public int getId(){return id;}
	public double getPrice(){return price;}
	public String getName(){return name;}
    public  abstract void showDetails();

}