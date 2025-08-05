package ClassAndObjects;

import java.util.Scanner;

import java.util.Scanner;

class Employee {
    String name;
    int salary;
    int id;
    Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    void getInput(Scanner sc) {
        System.out.print("Enter the name of employee: ");
        sc.nextLine(); // Consume newline
        name = sc.nextLine();
        System.out.print("Enter the salary of employee: ");
        salary = sc.nextInt();
        System.out.print("Enter the ID of employee: ");
        id = sc.nextInt();
    }

    void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);
    }
}

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee("", 0, 0);
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            emp[i].getInput(sc);
        }

        System.out.println("\nEmployee Records:");
        for (Employee e : emp) {
            e.display();
        }

        sc.close();
    }
}
