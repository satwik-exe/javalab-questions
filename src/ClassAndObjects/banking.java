package ClassAndObjects;

import java.util.Scanner;

class Account {
    String accountNumber;
    String accountHolder;
    double balance;

    Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    void display() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Account " + (i + 1) + ":");
            System.out.print("Enter Account Number: ");
            String accountNumber = sc.nextLine();
            System.out.print("Enter Account Holder's Name: ");
            String accountHolder = sc.nextLine();
            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline

            accounts[i] = new Account(accountNumber, accountHolder, balance);
        }

        System.out.println("\nAccount Details:");
        for (Account acc : accounts) {
            acc.display();
        }

        System.out.print("\nEnter the account number to perform transactions: ");
        String searchAccNumber = sc.nextLine();

        Account selectedAccount = null;
        for (Account acc : accounts) {
            if (acc.accountNumber.equals(searchAccNumber)) {
                selectedAccount = acc;
                break;
            }
        }

        if (selectedAccount != null) {
            System.out.println("Account Found!");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (choice == 1) {
                selectedAccount.deposit(amount);
            } else if (choice == 2) {
                selectedAccount.withdraw(amount);
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.println("\nUpdated Account Details:");
            selectedAccount.display();
        } else {
            System.out.println("Account not found.");
        }
    }
}
