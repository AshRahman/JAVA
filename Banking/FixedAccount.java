import java.lang.*;
public class FixedAccount extends Account{
	private int tenureYear;
	
	public FixedAccount(){
		System.out.println("E-C");
	}
	public void setTenureYear(int tenureYear){
		this.tenureYear=tenureYear;
	}
	public int getTenureYear(){return tenureYear;}
	
	
	
	
}