package Lab3;
import java.util.Scanner;

class Shape {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    public int area(int side) {
        return side * side;
    }
}

public class lab3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();
        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.printf("The area of the circle is: %.2f%n", s.area(radius));
                break;

            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.printf("The area of the triangle is: %.2f%n", s.area(base, height));
                break;

            case 3:
                System.out.print("Enter the side length of the square: ");
                int side = sc.nextInt();
                System.out.printf("The area of the square is: %d%n", s.area(side));
                break;

            default:
                System.out.println("Invalid choice! Please choose between 1, 2, or 3.");
                break;
        }
    }
}
