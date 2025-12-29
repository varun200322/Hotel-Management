package hotelManagement;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Room 
{
	int id;
	int floor;
	int capacity;
	String type;
	String description;
	double price;
	//boolean AVAILABLE;
	ArrayList<String> reservedDates;
	
	public Room(int id, int floor, int capacity, String type, String description, double price) {
		super();
		this.id = id;
		this.floor = floor;
		this.capacity = capacity;
		this.type = type;
		this.description = description;
		this.price = price;
	}

	public Room() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void Reserve(LocalDate startDate, LocalDate finishDate)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		for(LocalDate date = startDate; date.isBefore(finishDate); date = date.plusDays(1))
		{
			String d = date.format(formatter);
			reservedDates.add(d);
		}
	}
	
	public boolean isReserved(LocalDate startDate, LocalDate finishDate)
	{
		boolean b = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		for(LocalDate date = startDate; date.isBefore(finishDate); date = date.plusDays(1))
		{
			String d = date.format(formatter);
			if(reservedDates.contains(d))
				b = true;
		}
		return b;
	}
	
    public void print()
	{
		System.out.println("ID: "+id);
		System.out.println("Floor: "+floor);
		System.out.println("Capacity: "+capacity);
		System.out.println("Type: "+type);
		System.out.println("Description: "+description);
		System.out.println("Price: "+price);
	}
	
}
