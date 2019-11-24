import java.lang.*;

public Menu implements I_FoodItemOperations{
	
	public FoodItem items[];
	public FoodItem(int sizeOfArray){
		items= new FoodItem[sizeOfArray];
	}
	public void addFoodItem(FoodItem f)
	{
		int flag = 0;
		for(int i=0; i<items.length; i++)
		{
			if(items[i] == null)
			{
				itemss[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Inserted");}
		else {System.out.println("Can Not Insert");}
	}
	public void removeFoodItem(FoodItem f)
	{
		int flag =0;
		for(int i=0; i<items.length; i++)
		{
			if(items[i] == a)
			{
				items[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag==1){System.out.println("-----Removed-----");}
		else{System.out.println("-----CanNot Remove-----");}
	}
	
	public FoodItem getFoodItem(int id)
	{
		Account a = null;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber() == accountNumber)
				{
					a=accounts[i];
					break;
				}
			}
		}
		return a;
	}
}
	
	
	
	
	
}