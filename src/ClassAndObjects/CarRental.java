package ClassAndObjects;

import java.util.Scanner;

class Car {
    String brand;
    String model;
    double rentalPrice;

    Car(String brand, String model, double rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    void getInput(Scanner sc) {
        System.out.print("Enter Car Brand: ");
        sc.nextLine();
        brand = sc.nextLine();
        System.out.print("Enter Car Model: ");
        model = sc.nextLine();
        System.out.print("Enter Rental Price per Day: ");
        rentalPrice = sc.nextDouble();
    }

    void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: $" + rentalPrice + " per day");
    }
}

public class CarRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int n = sc.nextInt();

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car("", "", 0.0);
            System.out.println("Enter details for Car " + (i + 1) + ":");
            cars[i].getInput(sc);
        }

        System.out.println("\nAvailable Cars:");
        for (Car c : cars) {
            c.display();
        }

        sc.close();
    }
}

