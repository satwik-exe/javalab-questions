package Lab5;
import java.util.Scanner;
interface Account {
    abstract void earning(double b);

    abstract void deduction(double a);

    void bonus(double l);
}

class Manager implements Account {
    public void earning(double b) {
        double cal = b + ((b * 80) / 100.0) + ((b * 15) / 100.00);
        System.out.println("Earnings: " + cal);

    }

    public void deduction(double a) {
        double c = (a * 12) / 100.00;
        System.out.println("Deduction: " + c);
    }

    public void bonus(double l) {

    }
}

class SubStaff extends Manager {
    public void bonus(double c) {
        System.out.println("Bonus: " + (c * 50) / 100.00);
    }
}


public class lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary of Sub staff");
        double basicSalary = sc.nextDouble();
        SubStaff obj = new SubStaff();
        obj.earning(basicSalary);
        obj.deduction(basicSalary);
        obj.bonus(basicSalary);

    }
}
