package Lab1;

import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks (0-100): ");
        int marks = scanner.nextInt();

        String grade;

        if (marks >= 91 && marks <= 100) {
            grade = "O";
        } else if (marks >= 81 && marks <= 90) {
            grade = "E";
        } else if (marks >= 71 && marks <= 80) {
            grade = "A";
        } else if (marks >= 61 && marks <= 70) {
            grade = "B";
        } else if (marks >= 0 && marks <= 60) {
            grade = "C";
        } else {
            grade = "Invalid marks";
        }

        System.out.println("The grade is: " + grade);

        scanner.close();
    }
}
