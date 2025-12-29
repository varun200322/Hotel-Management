package hotelManagement;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Reservation 
{
	LocalDate arrivalDate;
	LocalDate departureDate;
	double price;
	String status;
	Guest guest;
	Room room;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public Reservation(LocalDate arrivalDate, LocalDate departureDate, double price, String status, Guest guest,
			Room room) 
	{
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.price = price;
		this.status = status;
		this.guest = guest;
		this.room = room;
	}
	
	public LocalDate getArrivalDate()
	{
		return arrivalDate;
	}
	public String getArrivalDatetoString()
	{
		return arrivalDate.format(formatter);
	}
	public LocalDate getDepartureDate()
	{
		return arrivalDate;
	}
	public String getDepartureDatetoString()
	{
		return arrivalDate.format(formatter);
	}
	public double getPrice()
	{
		return price;
	}
	public String getStatus()
	{
		return status;
	}
	public Guest getGuest()
	{
		return guest;
	}
	public Room getRoom()
	{
		return room;
	}
	public void setArrivalDate(LocalDate arrivalDate)
	{
		this.arrivalDate = arrivalDate;
	}
	public void setDepartureDate(LocalDate departureDate)
	{
		this.departureDate = departureDate;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public void setGuest(Guest guest)
	{
		this.guest = guest;
	}
	public void setRoom(Room room)
	{
		this.room = room;
	}
}
