package Fundamentals.BasicSyntax.MoreExe;

import java.util.Scanner;

public class GamingStore_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double moneyToSpend = budget;
        double price = 0;
        double totalPrice = 0;
        boolean notEnoughMoney = false;
        while (!command.equals("Game Time")) {
            String game = command;

            boolean isValid = ((game.equals("OutFall 4")) || (game.equals("CS: OG")) || (game.equals("Zplinter Zell")) || (game.equals("Honored 2")) || (game.equals("RoverWatch")) || (game.equals("RoverWatch Origins Edition")));

            if (!isValid) {
                System.out.println("Not Found");
            }
            switch (game) {
                case "OutFall 4":
                    price = 39.99;
                    if (moneyToSpend >= price) {
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (moneyToSpend >= price) {
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (moneyToSpend >= price) {
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (moneyToSpend >= price) {
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (moneyToSpend >= price) {
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (moneyToSpend >= price) {
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
            }
            moneyToSpend -= price;
            totalPrice += price;

            if (moneyToSpend <= 0) {
                notEnoughMoney = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (notEnoughMoney) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalPrice, budget - totalPrice);
        }
    }
}
