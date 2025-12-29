package hotelManagement;

import java.util.*;

import controller.GuestController;
import controller.RoomsController;

public class Main 
{
	private static ArrayList<Room> rooms;
	private static ArrayList<Guest> guests;
	private static ArrayList<Employee> employees;
	private static ArrayList<Reservation> reservations;
	
	public static void main(String[] args)
	{
		rooms = new ArrayList<>();
		guests = new ArrayList<>();
		employees = new ArrayList<>();
		reservations = new ArrayList<>();
		
		int i = 0;
		while(i!=16)
		{
			//-----ROOM------
			System.out.println("Welcome to VR Hotels");
			System.out.println("1. Add a new Room.");
			System.out.println("2. Show all Rooms.");
			System.out.println("3. Edit Room data.");
			//-----GUEST-----
			System.out.println("4. Add a new Guest.");
			System.out.println("5. Show all Guests.");
			System.out.println("6. Search Guest(by name).");
			System.out.println("7. Edit Guest Data.");
			//-----RESERVATION-----
			System.out.println("8. Create new Reservation.");
			System.out.println("9. Show all Reservations.");
			System.out.println("10. Get reservation(by guest name).");
			System.out.println("11. Get reservation by ID.");
			System.out.println("12. Edit Reservation.");
			//-----EMPLOYEE-----
			System.out.println("13. Add new Employee.");
			System.out.println("14. Show all Employees.");
			System.out.println("15. Edit Employee data.");
			System.out.println("16. Quit.");
			
			Scanner scanner = new Scanner(System.in);
			i = scanner.nextInt();
			
			switch(i)
			{
			case 1: RoomsController.addNewRoom(rooms, scanner); break;
			case 2: RoomsController.showAllRooms(rooms); break;
			case 3: RoomsController.editRoom(rooms, scanner); break;
			case 4: GuestController.addNewGuest(guests, scanner); break;
			case 5: GuestController.showAllGuests(guests); break;
			case 6: GuestController.searchGuestsByName(guests, scanner); break;
			case 7: GuestController.editGuest(guests, scanner);
			}
		}
	}
}
