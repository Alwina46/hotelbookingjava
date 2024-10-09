package project;
import java.util.Scanner;
		import java.util.ArrayList;

		class Room {
		    int roomNumber;
		    String roomType;
		    boolean isBooked;

		    public Room(int roomNumber, String roomType) {
		        this.roomNumber = roomNumber;
		        this.roomType = roomType;
		        this.isBooked = false;
		    }
		}

		public class HotelBookingSystem {
		    private ArrayList<Room> rooms;
		    private Scanner scanner;

		    public HotelBookingSystem() {
		        rooms = new ArrayList<>();
		        scanner = new Scanner(System.in);

		        // Initialize rooms
		        rooms.add(new Room(101, "Single"));
		        rooms.add(new Room(102, "Double"));
		        rooms.add(new Room(103, "Suite"));
		        rooms.add(new Room(104, "Single"));
		        rooms.add(new Room(105, "Double"));
		    }

		    public void run() {
		        while (true) {
		            System.out.println("Hotel Room Booking System");
		            System.out.println("1. Display Rooms");
		            System.out.println("2. Room Booking");
		            System.out.println("3. Cancel Booking");
		            System.out.println("4. Exit");

		            System.out.println("Choose an option:");
		            int option = scanner.nextInt();

		            switch (option) {
		                case 1:
		                	displayRooms();
		                    break;
		                case 2:
		                    roomBooking();
		                    break;
		                case 3:
		                	cancelBooking();
		                    break;
		                case 4:
		                	System.out.println("Thankyou For Visiting Us");
		                    break;
		                    
		                default:
		                    System.out.println("Invalid option");
		            }
		        }
		    }

		    

		    public void roomBooking() {
		        System.out.println("Enter room number:");
		        int roomNumber = scanner.nextInt();

		        for (Room room : rooms) {
		            if (room.roomNumber == roomNumber && !room.isBooked) {
		                System.out.println("Enter guest name:");
		                String guestName = scanner.next();

		                room.isBooked = true;
		                System.out.println("Room booked successfully");
		                return;
		            }
		        }

		        System.out.println("Room not available or already booked");
		    }

			 public void cancelBooking() {
		        System.out.println("Enter room number:");
		        int roomNumber = scanner.nextInt();

		        for (Room room : rooms) {
		            if (room.roomNumber == roomNumber && room.isBooked) {
		                room.isBooked = false;
		                System.out.println("Booking cancelled successfully");
		                return;
		            }
		        }

		        System.out.println("Room not booked");
		    }

		    public void displayRooms() {
		        System.out.println("Room Number\tRoom Type\tBooked Status");

		        for (Room room : rooms) {
		            System.out.println(room.roomNumber + "\t\t" + room.roomType + "\t\t" + (room.isBooked ? "Booked" : "Available"));
		        }
		    }

		    public static void main(String[] args) {
		        HotelBookingSystem hotel = new HotelBookingSystem();
		       hotel.run();
		   }
		

		}


