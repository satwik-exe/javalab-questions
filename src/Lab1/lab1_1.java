package Lab1;

import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Roll No: ");
        String rollNo = scanner.nextLine();

        System.out.print("Enter your Section: ");
        String section = scanner.nextLine();

        System.out.print("Enter your Branch: ");
        String branch = scanner.nextLine();

        System.out.print("\nDisplay Name: " + name + "\n" +
                "Display Roll No: " + rollNo + "\n" +
                "Display Section: " + section + "\n" +
                "Display Branch: " + branch);

        scanner.close();
    }
}
