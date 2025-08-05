package Lab3;
import java.util.Scanner;
class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display(Student[] students, int n) {
        System.out.println("Details of student are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + "\nRoll Number : " + students[i].roll + "\nName : " + students[i].name + "\nCGPA : " + students[i].cgpa);
        }
    }

    void calculateCGPA(Student[] s) {
        double cgpa = s[0].cgpa;
        String name = s[0].name;
        for (int i = 1; i < s.length; i++) {
            if (cgpa > s[i].cgpa) {
                cgpa = s[i].cgpa;
                name = s[i].name;
            }
        }
        System.out.println("Student " + name + " has Lowest CGPA of " + cgpa);

    }
}
public class lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students:");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the student " + (i + 1) + " roll number:");
            int roll = sc.nextInt();
            System.out.println("Enter the student name:");
            String name = sc.next();
            System.out.println("Enter the student cgpa:");
            double cgpa = sc.nextDouble();
            students[i] = new Student(roll, name, cgpa);
        }
        students[n - 1].display(students, n);
        students[n - 1].calculateCGPA(students);
    }
}
