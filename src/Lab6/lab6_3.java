package Lab6;
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


public class lab6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int n = sc.nextInt();

        try {
            processInput(n);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    static void processInput(int c) throws NegativeNumberException {
        if (c > 0)
            System.out.println("Double value: " + c * 2);
        else
            throw new NegativeNumberException("Caught the exception\nException occurred: NegativeNumberException: number should be positive");
    }
}
