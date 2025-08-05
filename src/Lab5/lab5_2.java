package Lab5;
import java.util.Scanner;

interface Motor {
    int capacity = 500;

    void run(int x);

    void consume();
}

class WashingMachine implements Motor {
    public void run(int n) {
        if (n > capacity) {
            System.out.println("capacity of washing machine exceeded");
        } else {
            System.out.println("Capacity of washing machine do not exceed");
        }
    }

    public void consume() {
        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}

public class lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the machine");
        int capacity = sc.nextInt();
        WashingMachine obj = new WashingMachine();
        obj.consume();
        obj.run(capacity);
    }
}
