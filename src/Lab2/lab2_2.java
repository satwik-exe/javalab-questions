package Lab2;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        System.out.println("Enter 10 elements:");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int even=0,odd=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                even++;
            }
            else
                odd++;
        }
        System.out.println("No of even numbers are: "+even);
        System.out.println("No of odd numbers are: "+odd);
    }
}
