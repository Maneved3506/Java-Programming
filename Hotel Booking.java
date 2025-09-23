import java.util.Scanner;
public class Hotelbooking {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 boolean[][] rooms = new boolean[3][5];
 while (true) {
 System.out.println("\n--- Hotel Room Booking System ---");
 System.out.println("1. View Rooms");
 System.out.println("2. Book a Room");
 System.out.println("3. Exit");
 System.out.print("Enter your choice: ");
 int choice = scanner.nextInt();
 switch (choice) {
 case 1:

 System.out.println("\nRoom Status (Floor x Room):");
 for (int floor = 0; floor < rooms.length; floor++) {
 System.out.print("Floor " + (floor + 1) + ": ");
 for (int room = 0; room < rooms[floor].length; room++) {
 if (rooms[floor][room]) {
 System.out.print("[Booked] ");
 } else {
 System.out.print("[Available] ");
 }
 }
 System.out.println();
 }
 break;
 case 2:

 System.out.print("Enter Floor (1-3): ");
 int floor = scanner.nextInt();
 System.out.print("Enter Room (1-5): ");
 int room = scanner.nextInt();
 if (floor < 1 || floor > 3 || room < 1 || room > 5) {
 System.out.println("Invalid floor or room number!");
 } else if (rooms[floor - 1][room - 1]) {
 System.out.println("Sorry, this room is already booked.");
 } else {
 rooms[floor - 1][room - 1] = true;
 System.out.println("Room booked successfully!");
 }
 break;
 case 3:

 System.out.println("Thank you for using the Hotel Booking System!");
 scanner.close();
 return;
 default:
 System.out.println("Invalid choice! Please select 1, 2, or 3.");
 }
 }
 }
}
