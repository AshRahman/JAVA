import java.lang.*;
public class Start{
	public static void main(String args[]){
		Circle c= new Circle();
		c.setRadius(3);
		System.out.println("Area: "+c.getArea());
		System.out.println("Radius: "+c.getRadius());
		
		Rectangle r=new Rectangle();
		r.setLength(5);
		r.setWidth(6);
		System.out.println("Length: "+r.getLength());
		System.out.println("Width: "+r.getWidth());
		System.out.println("Area: "+r.getArea());
		
		Square s=new Square();
		s.setSide(5);
		System.out.println("Side: "+s.getSide());
		System.out.println("Area: "+s.getArea());
	}
	
	
}