import java.lang.*;
 
public class Flight{
	private String flightid;
	private int capacity;
	private Airport departureFrom;
	private Schedule departureTime;
	private Airport flyingTo;
	private Schedule arrivalTime;
	
	public void setFlightId(String flightid){
		this.flightid=flightid;
	}
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public void setDepartureFrom(Airport departureFrom){
		this.departureFrom=departureFrom;
	}
	public void setDepartureTime(Schedule departureTime){
		this.departureTime=departureTime;
	}
	public void setFlyingTo(Airport flyingTo){
		this.flyingTo=flyingTo;
	}
	public void setArrivalTime(Schedule arrivalTime){
		this.arrivalTime=arrivalTime;
	}
	
	public String getFlightId(){return flightid;}
	public int getCapacity(){return capacity;}
	public Airport getDepartureFrom(){return departureFrom;}
	public Schedule getDepartureTime(){return departureTime;}
	public Airport getFlyingTo(){return flyingTo;}
	public Schedule getArrivalTime(){return arrivalTime;}
	
	
}