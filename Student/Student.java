import java.lang.*;
public class Student{
	private int Id;
	private String Name;
	private double Cgpa;
	
	public void setId(int i){
		Id=i;
	}
	public void setName(String n){
		Name=n;
	}
	public void setCgpa(double c){
		Cgpa=c;
	}
	public int getId(){return Id;};
	public String getName(){return Name;};
	public double getCgpa(){return Cgpa;};
	
	
	public static void main(String args[]){
		Student s = new Student();
		s.setId(17344);
		s.setName("Rahat");
		s.setCgpa(3.74);
		System.out.println("Id is : "+s.getId());
		System.out.println("Name is: "+s.getName());
		System.out.println("CGPA is : "+s.getCgpa());
		
		
	}
	
	
	
}