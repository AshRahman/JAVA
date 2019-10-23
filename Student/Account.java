import java.lang.*;

public class Account{
	private int AccountNumber;
	private String AccountHolderName;
	private double Balance;
	
	public void setAccountNumber(int an){
		AccountNumber =an;
	}
	public void setAccountHolderName(String ahn){
		AccountHolderName=ahn;
	}
	public void setBalance(double b){
		Balance=b;
	}
	
	public int getAccountNumber(){return AccountNumber;}
	public String getAccountHolderName(){return AccountHolderName;}
	public double getBalance(){return Balance;}
	void showDetails(){
		System.out.println("Account Number is: "+getAccountNumber());
		System.out.println("Account Holder Name is: "+getAccountHolderName());
		System.out.println("Account Balance is: "+getBalance());
	}
public  static void main(String args[]){
	Account a=new Account();
	a.showDetails();
}
}