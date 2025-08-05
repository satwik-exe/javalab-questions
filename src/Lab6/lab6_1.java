package Lab6;
import java.util.Scanner;

public class lab6_1 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[4];
            for (int i = 0; i < 5; i++) {
                arr[i] = i + 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception in threads \"main\"\n" + e);
        }
    }
}