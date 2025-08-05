package Lab3;
import java.util.Scanner;
class Rectangle {
    double length;
    double breadth;

    void read(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area is: " + length * breadth + "\nperimeter is: " + 2 * (length + breadth));
    }
}
public class lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Rectangle rec = new Rectangle();
        rec.read(length, breadth);
        rec.calculate();
        rec.display();
    }
}
