package controller;

import java.util.*;

import hotelManagement.Room;

public class RoomsController 
{
	@SuppressWarnings("unused")
	public static void addNewRoom(ArrayList<Room> rooms, Scanner scanner)
	{
		System.out.println("Enter floor(int): ");
		int floor = scanner.nextInt();
		System.out.println("Enter capacity(int): ");
		int capacity = scanner.nextInt();
		System.out.println("Enter type (String): ");
		String type = scanner.next();
		System.out.println("Enter description(String): ");
		String description = scanner.next();
		System.out.println("Enter price(double): ");
		double price = scanner.nextDouble();
		int id = 1000+rooms.size();
		
		Room room = new Room(id, floor, capacity, type, description, price);
		rooms.add(room);
		
		System.out.println("Room added Successfully!");
	}
	
	public static void showAllRooms(ArrayList<Room> rooms)
	{
		for(Room room : rooms)
		{
			System.out.println("----------");
			room.print();
			System.out.println("----------");
		}
			
	}
	
	public static void editRoom(ArrayList<Room> rooms, Scanner scanner)
	{
		System.out.println("Enter room ID: (-1 to show all rooms)");
		int id = scanner.nextInt();
		//int id = 0;
		if(id==1)
		{
			showAllRooms(rooms);
			System.out.println("Enter room ID: (-1 to show all rooms)");
			int j = scanner.nextInt();
			id = j;
		}
		Room room = getRoomById(id, rooms);
		System.out.println("Enter floor: (-1 to keep it)");
		int floor = scanner.nextInt();
		if(floor==-1)
			floor = room.getFloor();
		
		System.out.println("Enter capacity: (-1 to keep it)");
		int capacity = scanner.nextInt();
		if(capacity==-1)
			capacity = room.getCapacity();
		
		System.out.println("Enter room type: (-1 to keep it)");
		String type = scanner.next();
		if(type.equals("-1"))
			type = room.getType();
		
		System.out.println("Enter description: (-1 to keep it)");
		String description = scanner.next();
		if(description.equals("-1"))
			description = room.getDescription();
		
		System.out.println("Enter Price: (-1 to keep it)");
		double price = scanner.nextDouble();
		if(price==-1)
			price = room.getPrice();
		
		room.setFloor(floor);
		room.setCapacity(capacity);
		room.setDescription(description);
		//room.setId(id);
		room.setPrice(price);
		room.setType(type);
		//rooms.set(id, room);
		for(Room r:rooms)
		{
			if(r.getId()==id)
				r = room;
		}
	}
	
	public static Room getRoomById(int id, ArrayList<Room> rooms)
	{
		Room room = new Room();
		for(Room r : rooms)
		{
			if(r.getId()==id) {
				room = r;
				break;
			}
		}
		return room;
	}
}
