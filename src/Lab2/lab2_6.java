package Lab2;
import java.util.Scanner;

public class lab2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j)
                    sum1+=arr[i][j];
            }
        }
        int r=row-1;
        int c=0;
        while(r>=0 && c<col){
            sum2+=arr[c][r];
            r--;
            c++;
        }
        System.out.println("The sum of left diagonal is: "+sum1);
        System.out.println("The sum of right diagonal is: "+sum2);
    }
}
