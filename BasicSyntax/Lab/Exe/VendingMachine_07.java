package Fundamentals.BasicSyntax.Exe;

import java.util.Scanner;

public class VendingMachine_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double availableAmount = 0;
        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);

            if (coins != 0.10 && coins != 0.20 && coins != 0.50 && coins != 1.00 && coins != 2.00){
                System.out.printf("Cannot accept %.2f%n", coins);
            }else{
                availableAmount += coins;
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")){

            switch (input){
                case "Nuts":
                    if (availableAmount >= 2){
                        availableAmount -= 2;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (availableAmount >= 0.7){
                        availableAmount -= 0.7;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (availableAmount >= 1.5){
                        availableAmount -= 1.5;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (availableAmount >= 0.8){
                        availableAmount -= 0.8;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (availableAmount >= 1){
                        availableAmount -= 1;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        if (availableAmount >= 0) {
            System.out.printf("Change: %.2f", availableAmount);
        }
    }
}
