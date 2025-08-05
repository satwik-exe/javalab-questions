package Lab6;

public class lab6_2 {
    public static void main(String[] args) {
        try {
            int a = 9;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } finally {

        }
    }
}
