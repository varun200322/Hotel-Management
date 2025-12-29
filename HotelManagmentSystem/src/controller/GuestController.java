package controller;

import java.util.*;
import hotelManagement.Guest;

public class GuestController 
{
	public static void addNewGuest(ArrayList<Guest> guests, Scanner scanner)
	{
		System.out.println("Enter name: ");
		String name = scanner.next();
		System.out.println("Enter email: ");
		String email = scanner.next();
		System.out.println("Enter discount: ");
		int discount = scanner.nextInt();
		//Create the object and add it into the List.
		Guest guest = new Guest(guests.size(), name, email, discount);
		guests.add(guest);
	}
	
	public static void showAllGuests(ArrayList<Guest> guests)
	{
		for(Guest guest: guests)
		{
			System.out.println("----------");
			guest.print();
			System.out.println("----------");
		}
	}
	
	public static void searchGuestsByName(ArrayList<Guest> guests, Scanner scanner)
	{
		System.out.println("Enter name: ");
		String name = scanner.next();
		for(Guest guest : guests)
		{
			if(guest.getName().equals(name))
			{
				guest.print();
			}
		}
	}
	
	public static void editGuest(ArrayList<Guest> guests, Scanner scanner)
	{
		System.out.println("Enter ID: (-1 to search by guest name)");
		int id = scanner.nextInt();
		if(id==1)
		{
			searchGuestsByName(guests, scanner);
			System.out.println("Enter ID: ");
			id = scanner.nextInt();
		}
		
		Guest guest = guests.get(id);
		
		System.out.println("Enter name: (-1 to keep it)");
		String name = scanner.next();
		if(name.equals("-1"))
		{
			name = guest.getName();
		}
		
		System.out.println("Enter email: (-1 to keep it)");
		String email = scanner.next();
		if(email.equals("-1"))
		{
			email = guest.getEmail();
		}
		
		System.out.println("Enter discount: (-1 to keep it)");
		int discount = scanner.nextInt();
		if(discount==-1)
		{
			discount = guest.getDiscount();
		}
		
		guest.setName(name);
		guest.setEmail(email);
		guest.setId(id);
		guest.setDiscount(discount);
	}
}
