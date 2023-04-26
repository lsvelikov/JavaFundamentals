package Fundamentals.Exam.MidRetake;

import java.util.Scanner;

public class ComputerStore_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalPriceWithoutTax = 0;
        double totalPriceWithTax = 0;
        double totalTax = 0;
        while (true) {
            if (input.equals("special")) {
                totalPriceWithTax -= totalPriceWithTax * 0.1;
                break;
            } else if (input.equals("regular")) {
                break;
            }
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            } else if (price > 0) {
                double tax = price * 0.2;
                totalTax += tax;
                totalPriceWithTax += price + tax;
            }
            totalPriceWithoutTax += price;


            input = scanner.nextLine();
        }
        if (totalPriceWithTax == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPriceWithoutTax);
            System.out.printf("Taxes: %.2f$%n", totalTax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", totalPriceWithTax);
        }
    }
}
