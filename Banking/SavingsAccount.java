import java.lang.*;
public class SavingsAccount extends Account{
	private double interestRate;
	public SavingsAccount(){
		System.out.println("E-C");
	}
	public void setInterestRate(double interestRate){
		this.interestRate=interestRate;
	}
	public double getInterestRate(){return interestRate;}
	
	
	
}