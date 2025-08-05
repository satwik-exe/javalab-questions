package Lab2;
import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int arr[]=new int[3];
       System.out.println("Enter 3 numbers: ");
       for(int i=0;i<3;i++){
           arr[i]=sc.nextInt();
       }
       int max=arr[0];;
       for(int i=1;i<3;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
       System.out.println("Largest number is: "+max);

    }
}
