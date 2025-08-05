package Lab3;
import java.util.Scanner;
class box {
    double length;
    double width;
    double height;

    box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    double volume() {
        return length * width * height;
    }
}

public class lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the box: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        box b = new box(length, width, height);
        double vol = b.volume();
        System.out.println("The volume of the box is " + vol);
    }
}
