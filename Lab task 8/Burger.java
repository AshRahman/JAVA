import java.lang.*;

public Burger extends FoodItem{
	public int numberOfPatties;
	
	public Burger(){System.out.ptintln("EC");}
	
	public Burger(int numberOfPatties,double price,String name)
	{
		super(price,name);
		this.numberOfPatties=numberOfPatties;
	}
	public void setNumberOfPatties(int numberOfPatties){
		this.numberOfPatties=numberOfPatties;
	}
	public int getNumberOfPatties(){return numberOfPatties;}
	
	
	
	
	
}