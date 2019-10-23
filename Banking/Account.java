import java.lang.*;
 public class Account{
	 String accountNumber;
	 String accountHolderName;
	 double balance;
	 
	 public Account(){
		 System.out.println("E-C");
	 }
	 public void setAccountNumber(String accountNumber){
		this.accountNumber=accountNumber;
	 }
	 public void setAccountHolderName(String accountHolderName){
		 this.accountHolderName=accountHolderName;
	 }
	 public void setBalance(double balance){
		 this.balance=balance;
	 }
	 public String getAccountNumber(){return accountNumber;}
	 public String getAccountHolderName(){return accountHolderName;}
	 public double getBalance(){return balance;}
	 ///public void depositMoney(double amount){
		 
		/// return balance;
	 ///}
	 
	 
	 
 }