package Lab3;
import java.util.Scanner;

class Rectangle1 {
    double length;
    double breadth;

    Rectangle1() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}
public class lab3_6 {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1();
        System.out.println("Using default constructor:");
        System.out.printf("Area of rectangle: %.2f%n", rec.calculateArea());

        Scanner sc = new Scanner(System.in);
        System.out.println("Using parameterized constructor:");
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        Rectangle1 rec1 = new Rectangle1(length, breadth);
        System.out.printf("Area of rectangle: %.2f%n", rec1.calculateArea());
    }
}
