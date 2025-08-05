package ClassAndObjects;

import java.util.Scanner;

class Room {
    int roomNumber;
    String type;
    double price;

    Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
    }

    void display() {
        System.out.println("Room Details:");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price + " per night");
        System.out.println("----------------------");
    }
}

public class hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rooms: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Room[] rooms = new Room[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Room " + (i + 1) + ":");
            System.out.print("Enter Room Number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Room Type (Single/Double/Suite): ");
            String type = sc.nextLine();
            System.out.print("Enter Price per Night: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume newline

            rooms[i] = new Room(roomNumber, type, price);
        }

        System.out.println("\nAvailable Rooms:");
        for (Room r : rooms) {
            r.display();
        }

        sc.close();
    }
}

