package ClassAndObjects;

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String course;

    Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    void getInput(Scanner sc) {
        System.out.print("Enter Student Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course Name: ");
        course = sc.nextLine();
    }

    void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student("", 0, "");
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i].getInput(sc);
        }

        System.out.println("\nStudent Records:");
        for (Student s : students) {
            s.display();
        }

    }
}
