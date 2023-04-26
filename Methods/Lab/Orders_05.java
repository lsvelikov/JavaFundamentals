package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class Orders_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (product){
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2;
                break;
        }
        System.out.printf("%.2f",calculatePrice(price, quantity));
    }
    public static double calculatePrice(double price, int quantity){
        return price * quantity;
    }
}
