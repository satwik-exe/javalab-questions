package Lab5;
import java.util.Scanner;
interface Employee {
    void getDetails();
}

interface Manager1 extends Employee {
    void getDeptDetails();
}

class Head implements Manager1 {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    public Head(int empId, String empName, int deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void getDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
    }


    public void getDeptDetails() {
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    public void displayDetails() {
        getDetails();
        getDeptDetails();
    }
}

public class lab5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter employee id: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter department id: ");
        int deptId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();


        Head head = new Head(empId, empName, deptId, deptName);
        head.displayDetails();

    }
}
