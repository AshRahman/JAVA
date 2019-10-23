import java.lang.*;
 public class Start{
	 public static void main(String args[]){
		 Coordinate c1= new Coordinate();
		 Coordinate c2= new Coordinate();
		 c1.setLongitude(23.32);
		 c1.setLatitude(32.23);
		 c2.setLongitude(50.32);
		 c2.setLatitude(50.23);
		 
		 Schedule s1=new Schedule();
		 Schedule s2=new Schedule();
		 s1.setHour(12);
		 s1.setMinute(15);
		 s2.setHour(9);
		 s2.setMinute(30);
		 
		 Airport a1= new Airport();
		 Airport a2= new Airport();
		 a1.setName("Jakarta");
		 a1.setLocation(c1);
		 a2.setName("Kuwait");
		 a2.setLocation(c2);
		 
		 
		 Flight f1=new Flight();
		 f1.setFlightId("C2201");
		 f1.setCapacity(220);
		 f1.setDepartureFrom(a1);
		 f1.setDepartureTime(s1);
		 f1.setFlyingTo(a2);
		 f1.setArrivalTime(s2);
		 
		 System.out.println("Flight ID: "+f1.getFlightId());
		 System.out.println("Flight Capacity: "+f1.getCapacity());
		 System.out.println("Departure from: "+f1.getDepartureFrom().getName());
		 System.out.println("Departure Coordinate: "+f1.getDepartureFrom().getLocation().getLongitude()+","+f1.getDepartureFrom().getLocation().getLatitude());
		 //System.out.println("Departure from latitude: "+f1.getDepartureFrom().getLocation().getLatitude());
		 System.out.println("Departure time: "+f1.getDepartureTime().getHour()+":"+f1.getDepartureTime().getMinute());
		 //System.out.println("Departure time minute: "+f1.getDepartureTime().getMinute());
		 System.out.println("Arriving to: "+f1.getFlyingTo().getName());
		 System.out.println("Arrival Coordinate: "+f1.getFlyingTo().getLocation().getLongitude()+","+f1.getDepartureFrom().getLocation().getLatitude());
		 //System.out.println("Flying to latitude: "+f1.getDepartureFrom().getLocation().getLatitude());
		 System.out.println("Arrival time: "+f1.getArrivalTime().getHour()+":"+f1.getDepartureTime().getMinute());
		 //System.out.println("Departure time minute: "+f1.getDepartureTime().getMinute());
		 
		 
	 }
	 
	 
 }