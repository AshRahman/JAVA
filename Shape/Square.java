import java.lang.*;
 public class Square{
	 
	private double side;
	
	public Square(){
		System.out.println("Empty Square");
	}
	public void setSide(double side){
		this.side=side;
	}
	public double getSide(){return side;}
	public double getArea(){return side*side;}
	 
	 
	 
 }