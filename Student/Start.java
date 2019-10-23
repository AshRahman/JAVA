import java.lang.*;
public class Start{
	public static void main(String args[]){
	 SavingsAccount sa=new SavingsAccount();
	 sa.setAccountNumber("111111111");
	 sa.setAccountHolderName("OOP1");
	 sa.setBalance(100000);
	 sa.setInterestRate(7.5);
	 
	 FixedAccount fa=new FixedAccount();
	 fa.setAccountNumber("1111111112");
	 fa.setAccountHolderName("OOP1");
	 fa.setBalance(200000);
	 fa.setTenureYear(10);
	 
	 
	 Bank b=new Bank();
	 b.setName("DBBL");
	 b.setSavingsAccount(sa);
	 b.setFixedAccount(fa);
	 
	 
	 System.out.println("Holder Name: "+b.getSavingsAccount().getAccountHolderName());
	 System.out.println("Bank name: "+b.getName());
	 System.out.println("Account number: "+b.getSavingsAccount().getAccountNumber());
	 System.out.println("Balance: "+b.getSavingsAccount().getBalance());
	 System.out.println("Interest rate: "+b.getSavingsAccount().getInterestRate());
	 
	 System.out.println("Holder Name: "+b.getFixedAccount().getAccountHolderName());
	 System.out.println("Bank name: "+b.getName());
	 System.out.println("Account number: "+b.getFixedAccount().getAccountNumber());
	 System.out.println("Balance: "+b.getFixedAccount().getBalance());
	 System.out.println("Tenure Year: "+b.getFixedAccount().getTenureYear());
		
		
	
		
		
		
		
		
	}
	
	
	
	
}