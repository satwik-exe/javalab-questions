package Lab4;
import java.util.Scanner;
class Shape {
    protected double area;
    protected static final double SHEET_COST_PER_SQFT = 40.0;
    public Shape(double area) {
        this.area = area;
    }
    public double calculateCost() {
        return area * SHEET_COST_PER_SQFT;
    }
}

class Box extends Shape {
    private double height;
    protected static final double BOX_COST_PER_CUBICFT = 60.0;
    public Box(double length, double width, double height) {
        super(length * width);
        this.height = height;
    }

    public double calculateVolume() {
        return area * height;
    }

    @Override
    public double calculateCost() {
        return calculateVolume() * BOX_COST_PER_CUBICFT;
    }
}
public class shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of plastic shape:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the area of the sheet in square feet: ");
            double area = scanner.nextDouble();
            Shape sheet = new Shape(area);
            double cost = sheet.calculateCost();
            System.out.printf("The cost of the plastic sheet is: Rs %.2f%n", cost);
        } else if (choice == 2) {
            System.out.print("Enter the length of the box in feet: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the box in feet: ");
            double width = scanner.nextDouble();
            System.out.print("Enter the height of the box in feet: ");
            double height = scanner.nextDouble();
            Box box = new Box(length, width, height);
            double cost = box.calculateCost();
            System.out.printf("The cost of the plastic box is: Rs %.2f%n", cost);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }

}
