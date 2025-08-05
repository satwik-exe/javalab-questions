package Lab3;
import java.util.Scanner;
class Calculator {
int subtract(int a, int b) {
    return a - b;
}

int subtract(int a, int b, int c) {
    return a - b - c;
}

double subtract(double a, double b) {
    return a - b;
}
}
public class lab3_4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Subtract two integers: " + calc.subtract(10, 5));
        System.out.println("Subtract two doubles: " + calc.subtract(15.5, 10.2));
        System.out.println("Subtract three integers: " + calc.subtract(43, 5, 3));

    }
}
