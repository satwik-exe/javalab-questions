package ClassAndObjects;

import java.util.Scanner;

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println("Product Details:");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
    }
}

public class OnlineShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Category: ");
            String category = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume newline

            products[i] = new Product(name, price, category);
        }

        System.out.println("\nAvailable Products:");
        for (Product p : products) {
            p.display();
        }

        sc.close();
    }
}
