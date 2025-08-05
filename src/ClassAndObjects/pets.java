package ClassAndObjects;

import java.util.Scanner;

class Pet {
    String name;
    String species;
    int age;

    Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }
    void display() {
        System.out.println("Pet Details:");
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }
}

public class pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pets: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pet[] pets = new Pet[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Pet " + (i + 1) + ":");
            System.out.print("Enter Pet Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Species (Dog/Cat/Bird etc.): ");
            String species = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            pets[i] = new Pet(name, species, age);
        }

        System.out.println("\nAvailable Pets:");
        for (Pet p : pets) {
            p.display();
        }
    }
}
